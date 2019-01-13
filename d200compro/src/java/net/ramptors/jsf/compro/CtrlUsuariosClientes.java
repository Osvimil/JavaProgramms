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
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;
import javax.validation.constraints.Size;
import net.ramptors.jee.compro.entidad.Usuario;
import net.ramptors.jsf.CtrlAbc;

/**
 *
 * @author Ricardo Armando Machorro Reyes.
 */
@Named @ViewScoped
public class CtrlUsuariosClientes extends CtrlAbc<Usuario, String> {
  private static final long serialVersionUID = 1L;
  @Size(min = 5, max = 25)
  private String contrasena;
  private String confirma;
  public CtrlUsuariosClientes() {
    super(Usuario.class, "Usuarios", "Usuario Nuevo", null);
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
  @Override protected List<Usuario> consulta(EntityManager em) {
    return em.createNamedQuery("Usuario.PARA_ROL", tipoModelo).
        setParameter("rol", CtrlInicio.CLIENTE).
        setParameter("filtro", getFiltroCompleto()).getResultList();
  }
}
