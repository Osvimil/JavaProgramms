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

import javax.ejb.EJBException;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import net.rickamr.biblioteca.java.ProporcionaId;
import net.rickamr.biblioteca.jee.EjbAbc;

/** @author Ricardo Armando Machorro Reyes */
@Named(value = "ctrlElimina") @RequestScoped
public class CtrlElimina {
  @Inject
  private ErroresJsf erroresJsf;
  @Inject
  protected EjbAbc ejb;
  public String regresa() {
    return "index?faces-redirect=true";
  }
  public String elimina(final ProporcionaId<?> modelo) {
    try {
      if (modelo != null) {
        ejb.elimina(modelo.getClass(), modelo.getId());
        return regresa();
      }
    } catch (EJBException ex) {
      erroresJsf.procesa(ex);
    }
    return null;
  }
  protected void procesaErrores(Exception ex) {
    erroresJsf.procesa(ex);
  }
}
