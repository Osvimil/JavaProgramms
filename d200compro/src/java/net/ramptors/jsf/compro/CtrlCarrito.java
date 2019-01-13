/*
 * Copyright 2017 Ricardo Armando Machorro Reyes.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ramptors.jsf.compro;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;
import net.ramptors.jee.UtilJee;
import static net.ramptors.jee.UtilJee.format;
import net.ramptors.jsf.CtrlAbc;
import net.ramptors.jee.compro.entidad.DetalleDeVenta;
import net.ramptors.jee.compro.entidad.DetalleDeVentaPK;
import static net.ramptors.jee.UtilJee.getFormatoEntero;
import static net.ramptors.jee.UtilJee.getFormatoFechaHora;
import static net.ramptors.jee.UtilJee.getFormatoPrecio;
import static net.ramptors.jee.UtilJee.isNullOrEmpty;
import static net.ramptors.jee.UtilJee.parseFechaHoraWeb;
import net.ramptors.jee.compro.entidad.Cliente;
import net.ramptors.jee.compro.entidad.Venta;

/**
 *
 * @author Ricardo Armando Machorro Reyes.
 */
@Named @ViewScoped
public class CtrlCarrito extends CtrlAbc<DetalleDeVenta, DetalleDeVentaPK> {
  private static final long serialVersionUID = 1L;
  private Venta venta;
  private String total;
  private String fechaHoraDeEntrega;
  private String cantidad;
  private String precio;
  public CtrlCarrito() {
    super(DetalleDeVenta.class, "Carrito de Compras", null, null);
  }
  public String getImagenUrl() {
    return isNuevo() || getModelo() == null ? null
        : "../ctrlArchivo/" + getModelo().getProducto().getImagen().getId();
  }
  public Venta getVenta() {
    return venta;
  }
  public String getTotal() {
    return total;
  }
  public String getFechaHoraDeEntrega() {
    return fechaHoraDeEntrega;
  }
  public void setFechaHoraDeEntrega(String fechaHoraDeEntrega) {
    this.fechaHoraDeEntrega = fechaHoraDeEntrega;
  }
  public String getCantidad() {
    return cantidad;
  }
  public void setCantidad(String cantidad) {
    this.cantidad = cantidad;
  }
  public String getPrecio() {
    return precio;
  }
  public void cancelaProducto() {
    if (venta.elimina(getModelo().getProducto())) {
      EntityManager em = null;
      try {
        em = iniciaTransaccion();
        venta = em.merge(venta);
        em.flush();
        commit(em);
        inicia(em);
      } catch (Exception e) {
        procesa("Error guardado venta.", e);
      } finally {
        cierra(em);
      }
    }
  }
  public void guardaVenta() {
    EntityManager em = null;
    try {
      em = iniciaTransaccion();
      venta.setFechaHoraDeEntrega(parseFechaHoraWeb(getFechaHoraDeEntrega(),
          getTimeZone(), "Valor incorrecto para Fecha y Hora de Entrega."));
      venta = em.merge(venta);
      commit(em);
      final FacesContext context = FacesContext.getCurrentInstance();
      context.getApplication().getNavigationHandler().
          handleNavigation(context, null, "/index?faces-redirect=true");
    } catch (Exception e) {
      procesa("Error guardado venta.", e);
    } finally {
      cierra(em);
    }
  }
  public void registra() {
    EntityManager em = null;
    try {
      if (isNullOrEmpty(getFechaHoraDeEntrega())) {
        throw new RuntimeException("Falta la fecha de entrega.");
      } else if (isNullOrEmpty(getVenta().getDireccionDeEntrega())) {
        throw new RuntimeException("Falta la dirección de entrega.");
      }
      em = iniciaTransaccion();
      venta.setFechaHoraDeEntrega(parseFechaHoraWeb(getFechaHoraDeEntrega(),
          getTimeZone(), "Valor incorrecto para Fecha y Hora de Entrega."));
      venta.setRegistro(new Date());
      venta.getDetalles().stream().forEach(d -> {
        d.setPrecio(d.getProducto().getPrecio());
        d.getProducto().decrementaExistencias(d.getCantidad());
      });
      venta = em.merge(venta);
      final Cliente cliente = venta.getCliente();
      venta = new Venta();
      cliente.setVentaActual(venta);
      venta.setCliente(cliente);
      commit(em);
      final FacesContext context = FacesContext.getCurrentInstance();
      context.getApplication().getNavigationHandler().
          handleNavigation(context, null, "/index?faces-redirect=true");
    } catch (RuntimeException e) {
      procesa("Error guardado venta.", e);
    } finally {
      cierra(em);
    }
  }
  @Override protected String getTituloDeModelo() {
    return getModelo().getProducto().getNombre();
  }
  @Override public List<DetalleDeVenta> consulta(EntityManager em) {
    final FacesContext context = FacesContext.getCurrentInstance();
    final String usuarioId = context.getExternalContext().getRemoteUser();
    final Cliente cliente = em.find(Cliente.class, usuarioId);
    venta = cliente.getVentaActual();
    setFechaHoraDeEntrega(format(getFormatoFechaHora(getTimeZone()),
        venta.getFechaHoraDeEntrega()));
    total = format(getFormatoPrecio(), venta.getTotal());
    return venta.getDetalles();
  }
  public String subtotal(DetalleDeVenta modelo) {
    return MessageFormat.format(
        "{0,number,#,##0} a ${1,number,#,##0.00} = ${2,number,#,##0.00}",
        modelo.getCantidad(), modelo.getPrecio(), modelo.getSubtotal());
  }
  @Override public void llenaModelo(EntityManager em) {
    getModelo().setCantidad(UtilJee.parseEntero(getCantidad(),
        "Formato incorrecto para cantidad."));
  }
  @Override public void muestraModelo(EntityManager em) {
    cantidad = format(getFormatoEntero(), getModelo().getCantidad());
    precio = format(getFormatoPrecio(), getModelo().getPrecio());
  }
  protected static TimeZone getTimeZone() {
    return TimeZone.getTimeZone("America/Mexico_City");
  }
}
