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

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJBException;
import javax.inject.Inject;

/** Muestra un listado de objetos. Se crean clases hijas que se encargan de buscar los
 * datos, pero otras tareas necesarias, como el manejo de errores y almacenamiento de
 * datos, se realizan aquí.
 * @author Ricardo Armando Machorro Reyes */
public abstract class CtrlListadoBase<T> {
  @Inject
  protected ErroresJsf erroresJsf;
  protected List<T> instancias;
  /** Las clases hijas deben buscar los datos que se muestran.
   * @return los datos que se mustran. */
  protected abstract List<T> buscaInstancias();
  @PostConstruct
  public void cargaInstancias() {
    try {
      instancias = buscaInstancias();
    } catch (EJBException ex) {
      procesaErrores(ex);
    }
  }
  public List<T> getInstancias() {
    return instancias;
  }
  protected void procesaErrores(Exception ex) {
    erroresJsf.procesa(ex);
  }
}
