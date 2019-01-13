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

import java.util.Optional;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;
import static net.ramptors.jee.UtilJee.format;
import static net.ramptors.jee.UtilJee.getFormatoPrecio;
import net.ramptors.jee.compro.entidad.Cliente;
import net.ramptors.jee.compro.entidad.DetalleDeVenta;
import net.ramptors.jsf.CtrlAbc;
import net.ramptors.jee.compro.entidad.Producto;
import net.ramptors.jee.compro.entidad.Venta;

/**
 *
 * @author Ricardo Armando Machorro Reyes.
 */
@Named @ViewScoped
public class CtrlProductosCliente extends CtrlAbc<Producto, Long> {
  private static final long serialVersionUID = 1L;
  private String nombre;
  private String precio;
  private String categoria;
  public CtrlProductosCliente() {
    super(Producto.class, "Productos", null, Producto.FILTRO);
  }
  public String getImagenUrl() {
    return isNuevo() || getModelo() == null ? null
        : "../ctrlArchivo/" + getModelo().getImagen().getId();
  }
  public String getNombre() {
    return nombre;
  }
  public String getPrecio() {
    return precio;
  }
  public String getCategoria() {
    return categoria;
  }
  @Override protected String getTituloDeModelo() {
    return getModelo().getNombre();
  }
  public String precioFormateado(Producto modelo) {
    return format(getFormatoPrecio(), modelo.getPrecio());
  }
  @Override public void llenaModelo(EntityManager em) {
  }
  @Override public void muestraModelo(EntityManager em) {
    nombre = getModelo().getNombre();
    precio = format(getFormatoPrecio(), getModelo().getPrecio());
    categoria = getModelo().getCategoria().getNombre();
  }
  public void compra() {
    EntityManager em = null;
    try {
      final FacesContext context = FacesContext.getCurrentInstance();
      final String usuarioId = context.getExternalContext().getRemoteUser();
      em = iniciaTransaccion();
      final Cliente cliente = em.find(Cliente.class, usuarioId);
      final Venta venta = cliente.getVentaActual();
      final Optional<DetalleDeVenta> detalle = venta.busca(getModelo());
      if (!detalle.isPresent()) {
        venta.getDetalles().add(new DetalleDeVenta(venta, getModelo()));
      }
      commit(em);
      if (!detalle.isPresent()) {
        context.getApplication().getNavigationHandler().handleNavigation(
            context, null, "/formCarrito?faces-redirect=true");
      }
    } catch (Exception e) {
      procesa("Error comprando producto.", e);
    } finally {
      cierra(em);
    }
  }
}
