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

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;
import javax.validation.constraints.Size;
import static net.ramptors.jee.UtilJee.isNullOrEmpty;
import static net.ramptors.jee.UtilJee.encripta;
import net.ramptors.jee.compro.entidad.Rol;
import net.ramptors.jee.compro.entidad.Usuario;
import net.ramptors.jsf.CtrlAbc;

/**
 *
 * @author Ricardo Armando Machorro Reyes.
 */
@Named @ViewScoped
public class CtrlUsuarios extends CtrlAbc<Usuario, String> {
  private static final long serialVersionUID = 1L;
  private List<Rol> roles;
  @Size(min = 5, max = 25)
  private String contrasena;
  private String confirma;
  public CtrlUsuarios() {
    super(Usuario.class, "Usuarios", "Usuario Nuevo", Usuario.FILTRO);
  }
  public List<Rol> getRoles() {
    return roles;
  }
  public void agregaRol(Rol rol) {
    getModelo().getRoles().add(rol);
    actualizaRoles();
  }
  public void eliminaRol(Rol rol) {
    getModelo().getRoles().remove(rol);
    actualizaRoles();
  }
  public String getContrasena() {
    return contrasena;
  }
  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }
  public String getConfirma() {
    return confirma;
  }
  public void setConfirma(String confirma) {
    this.confirma = confirma;
  }
  @Override protected String getTituloDeModelo() {
    return getModelo().getId();
  }
  @Override public void llenaModelo(EntityManager em) {
    if (isNuevo() && isNullOrEmpty(getContrasena())) {
      throw new RuntimeException("Falta la Contraseña.");
    } else if (!Objects.equals(getContrasena(), getConfirma())) {
      throw new RuntimeException("Las Contraseñas no coinciden.");
    } else {
      if (isNuevo()) {
        getModelo().setContrasena(encripta(getContrasena()));
      } else if (!isNullOrEmpty(getContrasena())) {
        getModelo().setContrasena(encripta(getContrasena()));
      }
    }
  }
  @Override public void muestraModelo(EntityManager em) {
    actualizaRoles();
    setContrasena(null);
    setConfirma(null);
  }
  private void actualizaRoles() {
    roles = getModelo().getRoles().parallelStream().
        sorted((rol1, rol2) -> rol1.getId().compareTo(rol2.getId())).
        collect(Collectors.toList());
  }
}
