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
package net.rickamr.biblioteca.jee;

/** Contiene la descripción de un error asociado a una propiedad.
 * @author Ricardo Armando Machorro Reyes */
public class Error {
  private final String propiedad;
  private final String descripción;
  public Error() {
    this.propiedad = null;
    this.descripción = null;
  }
  public Error(String propiedad, String descripción) {
    this.propiedad = propiedad;
    this.descripción = descripción;
  }
  public String getPropiedad() {
    return propiedad;
  }
  public String getDescripción() {
    return descripción;
  }
}