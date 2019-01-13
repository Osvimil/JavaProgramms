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

import java.lang.reflect.Type;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import net.rickamr.biblioteca.java.Entidad;
import net.rickamr.biblioteca.java.Generics;
import net.rickamr.biblioteca.jee.EjbAbc;

/** Permite manejar entidades dentro de combos. Está basado en la clase
 * ConvertidorDeComputadora del proyecto jsf06asociaciones, pero se adapta para que
 * funcione con cualquier entidad.
 * @author Ricardo Armando Machorro Reyes
 * @param <T> Tipo de la clase que se convierte.
 * @param <I> Tipo del identificador de la clase. */
public abstract class ConvertidorDeEntidad<T extends Entidad<I>, I>
    implements Converter {
  @Inject
  private EjbAbc abcEjb;
  @Override
  public Object getAsObject(final FacesContext context, final UIComponent component,
      final String value) {
    if (value == null || value.isEmpty()) {
      return null;
    } else {
      try {
        final Type[] tipos = Generics.getParámetrosGenéricos(this);
        final Class<?> tipo = (Class<?>) tipos[0];
        final Class<?> tipoDelId = (Class<?>) tipos[1];
        final Object id = Generics.newInstance(tipoDelId, value);
        return abcEjb.busca(tipo, id);
      } catch (final Exception ex) {
        return null;
      }
    }
  }
  @Override
  public String getAsString(final FacesContext context, final UIComponent component,
      final Object value) {
    final Class<?> tipo = (Class<?>) (Generics.getParámetrosGenéricos(this)[0]);
    if (value != null && tipo.isAssignableFrom(value.getClass())) {
      final Entidad instancia = (Entidad) value;
      return instancia.getId().toString();
    } else {
      return null;
    }
  }
}