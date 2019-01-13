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
package net.ramptors.jee.compro.entidad;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import static net.ramptors.jee.UtilJee.toUpperCase;
import net.ramptors.jee.Entidad;

/**
 *
 * @author Ricardo Armando Machorro Reyes.
 */
@Entity
@Table(name = "USUARIO")
@NamedQueries({
  @NamedQuery(name = Usuario.FILTRO, query
      = "SELECT u "
      + "FROM Usuario u "
      + "WHERE u.upperId LIKE :filtro OR UPPER(u.nombre) LIKE :filtro "
      + "ORDER BY u.upperId"),
  @NamedQuery(name = Usuario.PARA_ROL, query
      = "SELECT u "
      + "FROM Usuario u JOIN u.roles r "
      + "WHERE r.id = :rol "
      + " AND (u.upperId LIKE :filtro OR UPPER(u.nombre) LIKE :filtro) "
      + "ORDER BY u.upperId")
})
public class Usuario extends Entidad<String> {
  private static final long serialVersionUID = 1L;
  public static final String FILTRO = "Usuario.FILTRO";
  public static final String PARA_ROL = "Usuario.PARA_ROL";
  @Id
  @Basic(optional = false)
  @NotNull
  @Pattern(regexp = "\\w{5,16}")
  @Column(name = "USU_ID")
  private String id;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 100)
  @Column(name = "USU_CONTRA")
  private String contrasena;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 255)
  @Column(name = "USU_NOMBRE")
  private String nombre;
  @JoinTable(name = "USUARIO_ROL", joinColumns
      = {@JoinColumn(name = "USU_ID", referencedColumnName = "USU_ID")},
      inverseJoinColumns
      = {@JoinColumn(name = "ROL_ID", referencedColumnName = "ROL_ID")})
  @ManyToMany(fetch = FetchType.EAGER)
  private Set<Rol> roles = new HashSet<>();
  @Version
  private Integer version;
  @Size(max = 255)
  @Column(name = "UPPER_ID")
  private String upperId;
  @Override public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getContrasena() {
    return contrasena;
  }
  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public Set<Rol> getRoles() {
    return roles;
  }
  public void setRoles(Set<Rol> roles) {
    this.roles = roles;
  }
  @PrePersist @PreUpdate private void antesDeGuardar() {
    upperId = toUpperCase(getId());
  }
}
