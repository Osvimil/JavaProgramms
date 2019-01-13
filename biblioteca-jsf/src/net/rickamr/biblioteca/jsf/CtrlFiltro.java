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
import javax.inject.Inject;
import net.rickamr.biblioteca.java.Generics;
import net.rickamr.biblioteca.jee.EjbAbc;

/** Muestra un listado de objetos que contienen un texto en alguno de sus campos.
 * @author Ricardo Armando Machorro Reyes */
public abstract class CtrlFiltro<T> extends CtrlListadoBase<T> {
  private String filtro = "";
  @Inject
  protected EjbAbc ejb;
  protected abstract String getConsulta();
  @Override
  protected List<T> buscaInstancias() {
    final Class<T> tipo = Generics.getParámetroGenérico(this, 0);
    return ejb.buscaInstancias(getConsulta(), getFiltro(), tipo);
  }
  public String getFiltro() {
    return filtro;
  }
  public void setFiltro(String filtro) {
    this.filtro = filtro;
  }
}
