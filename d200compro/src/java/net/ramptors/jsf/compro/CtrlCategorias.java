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

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import net.ramptors.jsf.CtrlAbc;
import net.ramptors.jee.compro.entidad.Categoria;

/**
 *
 * @author Ricardo Armando Machorro Reyes.
 */
@Named @ViewScoped
public class CtrlCategorias extends CtrlAbc<Categoria, Long> {
  private static final long serialVersionUID = 1L;
  public CtrlCategorias() {
    super(Categoria.class, "Categorias", "Categoría Nueva", Categoria.FILTRO);
  }
  @Override protected String getTituloDeModelo() {
    return getModelo().getNombre();
  }
}
