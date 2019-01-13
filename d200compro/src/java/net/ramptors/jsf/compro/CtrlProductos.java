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

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;
import javax.servlet.http.Part;
import static net.ramptors.jee.UtilJee.format;
import static net.ramptors.jee.UtilJee.getFormatoEntero;
import static net.ramptors.jee.UtilJee.getFormatoPrecio;
import static net.ramptors.jee.UtilJee.parseEntero;
import static net.ramptors.jee.UtilJee.parsePrecio;
import net.ramptors.jsf.CtrlAbc;
import net.ramptors.jee.Archivo;
import net.ramptors.jee.compro.entidad.Producto;
import static net.ramptors.jsf.Parts.getBytes;

/**
 *
 * @author Ricardo Armando Machorro Reyes.
 */
@Named @ViewScoped
public class CtrlProductos extends CtrlAbc<Producto, Long> {
  private static final long serialVersionUID = 1L;
  private String existencias;
  private String precio;
  private Part imagen;
  public CtrlProductos() {
    super(Producto.class, "Productos", "Producto Nuevo", Producto.FILTRO);
  }
  public String getImagenUrl() {
    return isNuevo() || getModelo() == null ? null
        : "../ctrlArchivo/" + getModelo().getImagen().getId();
  }
  public String getExistencias() {
    return existencias;
  }
  public void setExistencias(String existencias) {
    this.existencias = existencias;
  }
  public String getPrecio() {
    return precio;
  }
  public void setPrecio(String precio) {
    this.precio = precio;
  }
  public Part getImagen() {
    return imagen;
  }
  public void setImagen(Part imagen) {
    this.imagen = imagen;
  }
  @Override protected String getTituloDeModelo() {
    return getModelo().getNombre();
  }
  public String precioFormateado(Producto modelo) {
    return format(getFormatoPrecio(), modelo.getPrecio());
  }
  @Override public void llenaModelo(EntityManager em) {
    if (isNuevo() && getImagen() == null) {
      throw new RuntimeException("Falta seleccionar la imagen.");
    } else {
      if (isNuevo() || getImagen() != null) {
        getModelo().setImagen(new Archivo(getBytes(getImagen())));
      }
      getModelo().setExistencias(parseEntero(getExistencias(),
          "Formato incorrecto para existencias."));
      getModelo().setPrecio(parsePrecio(getPrecio(),
          "Formato incorrecto para precio."));
    }
  }
  @Override public void muestraModelo(EntityManager em) {
    setImagen(null);
    setExistencias(format(getFormatoEntero(), getModelo().getExistencias()));
    setPrecio(format(getFormatoPrecio(), getModelo().getPrecio()));
  }
}
