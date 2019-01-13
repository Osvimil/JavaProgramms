/* Copyright 2014 Ricardo Armando Machorro Reyes
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License. */
package net.rickamr.biblioteca.java;

/** Indica que algo se ha modificado. Usa una <code>java.lang.String</code> para
 * indicar el tipo de modificacion.
 * @author Ricardo Armando Machorro Reyes */
public class EvtModificacion {
  private final String tipo;
  public EvtModificacion(String tipo) {
    this.tipo = tipo;
  }
  public String getTipo() {
    return tipo;
  }
}