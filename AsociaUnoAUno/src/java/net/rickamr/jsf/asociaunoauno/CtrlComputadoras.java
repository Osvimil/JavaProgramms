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

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import net.rickamr.biblioteca.jsf.CtrlListado;

/** Tiene una estructura similar a la de CtrlConocidos del proyecto das13abc, solo que
 * la hereda totalmente de la clase CtrlListado.
 * @author Ricardo Armando Machorro Reyes */
@Named(value = "ctrlComputadoras") @RequestScoped
public class CtrlComputadoras extends CtrlListado<Computadora> {
  @Override
  protected String getConsulta() {
    return Computadora.TODAS;
  }
}
