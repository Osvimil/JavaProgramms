/* Copyright 2014 Ricardo Armando Machorro Reyes
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package net.rickamr.biblioteca.jsf;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import net.rickamr.biblioteca.jee.Error;
import net.rickamr.biblioteca.jee.Errores;

/** Procesa los errores de JSF.
 * @author Ricardo Armando Machorro Reyes */
@ApplicationScoped
public class ErroresJsf {
  @Inject
  private Errores errores;
  @Inject
  private Mensajes mensajes;
  public void procesa(final Throwable ex) {
    final List<Error> lista = errores.procesa(ex);
    for (Error error : lista) {
      final String propiedad = error.getPropiedad();
      final String descripción = error.getDescripción();
      mensajes.error(propiedad == null ? null : propiedad + ":v", descripción);
    }
  }
}
