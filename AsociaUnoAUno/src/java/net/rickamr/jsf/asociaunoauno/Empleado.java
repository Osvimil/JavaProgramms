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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import net.rickamr.biblioteca.java.Entidad;

/** @author Ricardo Armando Machorro Reyes */
@Entity @XmlRootElement
@NamedQuery(name = Empleado.FILTRO, query
    = "SELECT e FROM Empleado e "
    + "WHERE UPPER(e.nombre) LIKE UPPER(:filtro) "
    + "  OR e.rfc LIKE UPPER(:filtro) "
    + "ORDER BY e.rfc")
// Para que la relación sea de 1 a 1, la computadora asignada no se puede repetir.
@Table(uniqueConstraints = {
  @UniqueConstraint(name = Empleado.RFC_DUPLICADO, columnNames = {"rfc"}),
  @UniqueConstraint(name = Empleado.COMPUTADORA_ASIGNADA,
      columnNames = "computadora")})
public class Empleado extends Entidad<Long> {
  private static final long serialVersionUID = 1L;
  public static final String RFC_DUPLICADO = "RFC_D_EMP";
  public static final String COMPUTADORA_ASIGNADA = "COMP_A_EMP";
  public static final String FILTRO = "Empleado.FILTRO";
  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  //@Version
 // private int version;
  @NotNull
  @Pattern(regexp = "[A-Z]{4}\\d{2}([0]\\d|[1][0-2])([0-2]\\d|[3][01])[A-Z]\\d{2}")
  @Column(length = 13)
  private String rfc;
  @NotNull @Size(min = 1, max = 255)
  private String nombre;
  /** Relación uno a uno unidireccional con la clase Computadora. FetchType.EAGER
   * indica que cuando se carga un empleado, también se carga la computadora asociada.
   * JoinColumn(name = "computadora") indica el nombre de la llave foránea en la
   * tabla. */
  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "computadora")
  private Computadora computadora;
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
  public String getRfc() {
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public Computadora getComputadora() {
    return computadora;
  }
  public void setComputadora(Computadora computadora) {
    this.computadora = computadora;
  }
  @Override
  public String toString() {
    return getRfc() + '\n' + getNombre();
  }
}
