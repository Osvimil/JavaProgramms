/* Copyright 2014 Ricardo Armando Machorro Reyes
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License. */
package net.rickamr.biblioteca.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/** Termina la sesión y la conversación en curso.
 * @author Ricardo Armando Machorro Reyes */
@Named @ApplicationScoped
public class CtrlSalir{
  /** Termina la sesión y la conversación en curso. Posteriormente muestra una vista.
   * @param reinicio vista que se muestra después de terminar la sesión.
   * @return la vista que se debe mostrar. */
  public String salir(final String reinicio) {
    FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    return reinicio + "?faces-redirect=true";
  }
}