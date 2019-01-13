/* Copyright 2014 Ricardo Armando Machorro Reyes
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License. */
package net.rickamr.jsf.asociaunoauno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import net.rickamr.biblioteca.java.Entidad;

/** Entidad Computadora. Para simplificar el procesamiento del catálogo de
 * computadoras, extiende de la clase Entidad, que implementa Serializable, contiene
 * las funciones hashCode e equals; también nos pide usar el método getId para
 * identificar la llave primaria de los objetos.
 * @author Ricardo Armando Machorro Reyes */
@Entity @XmlRootElement
@NamedQueries({
  @NamedQuery(name = Computadora.TODAS, query
      = "SELECT c FROM Computadora c ORDER BY c.inventario"),
  @NamedQuery(name = Computadora.FILTRO, query
      = "SELECT c FROM Computadora c "
      + "WHERE UPPER(c.inventario) LIKE UPPER(:filtro) "
      + "  OR UPPER(c.marca) LIKE UPPER(:filtro) "
      + "  OR UPPER(c.modelo) LIKE UPPER(:filtro) "
      + "ORDER BY c.inventario")
})
@Table(uniqueConstraints = @UniqueConstraint(name = Computadora.INVENTARIO_DUPLICADO,
    columnNames = {"inventario"}))
public class Computadora extends Entidad<Long> {
  private static final long serialVersionUID = 1L;
  public static final String TODAS = "Computadora.todas";
  public static final String FILTRO = "Computadora.FILTRO";
  public static final String INVENTARIO_DUPLICADO = "INV_D_COMP";
  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
 // @Version
 // private int version;
  @NotNull @Size(min = 1, max = 20)
  @Column(length = 20)
  private String inventario;
  @NotNull @Size(min = 1, max = 255)
  private String marca;
  @NotNull @Size(min = 1, max = 255)
  private String modelo;
  @Override
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
//  public int getVersion() {
//    return version;
//  }
//  public void setVersion(int version) {
//    this.version = version;
//  }
  public String getInventario() {
    return inventario;
  }
  public void setInventario(String inventario) {
    this.inventario = inventario;
  }
  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  /** Devuelve el texto que muestran las vistas en los componentes tipo select y en
   * los listados.
   * @return El valor a mostrar en los componentes tipo select y en los listados. */
  @XmlAttribute
  public String getEtiqueta() {
    return getInventario() + ':' + getModelo() + " de " + getMarca();
  }
  @XmlAttribute
  public String getEtiqueta2() {
    return getModelo() + " de " + getMarca();
  }
  @Override
  public String toString() {
    return getInventario() + ':' + getModelo() + " de " + getMarca();
  }
}
