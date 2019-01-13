/* Copyright 2014 Ricardo Armando Machorro Reyes.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License. */
package net.rickamr.jsf.asociaunoauno;

import javax.ejb.EJBException;
import javax.enterprise.context.Dependent;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;
import net.rickamr.biblioteca.jee.EjbAbc;

/** Permite manejar entidades dentro de componentes tipo select.
 * @author Ricardo Armando Machorro Reyes */
@Named @Dependent
public class ConvertidorDeComputadora implements Converter {
  @Inject
  private EjbAbc ejbAbcc;
  @Override
  public Object getAsObject(final FacesContext context, final UIComponent component,
          final String value) {
    if (value == null || value.isEmpty()) {
      return null;
    } else {
      try {
        return ejbAbcc.busca(Computadora.class, new Long(value));
      } catch (NumberFormatException | EJBException ex) {
        return null;
      }
    }
  }
  @Override
  public String getAsString(final FacesContext context, final UIComponent component,
          final Object value) {
    if (value != null && value instanceof Computadora) {
      final Computadora instancia = (Computadora) value;
      return instancia.getId().toString();
    } else {
      return null;
    }
  }
}
