/* Copyright 2014 Ricardo Armando Machorro Reyes
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License. */
package net.rickamr.biblioteca.jee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

/** Simplifica el manejo de mensajes.
 * @author Ricardo Armando Machorro Reyes */
@ApplicationScoped
public class Errores {
  /** si encuentra uno de las campos llave en un mensaje, lo reemplaza por su valor
   * asociado. */
  @Inject @ReemplazoDeMensajes
  private HashMap<String, String> reemplazoDeMensajes;
  /** Analiza una excepción ara poder mostrar el mensaje de error que lleva.
   * @param ex excepción que describe un error.
   * @return una instancia de <code>Error</code> que contiene la propiedad y
   *         descripción. */
  public List<Error> procesa(final Throwable ex) {
    try {
      throw ex;
    } catch (final ConstraintViolationException ex2) {
      return preparaError(ex2.getConstraintViolations());
    } catch (Throwable ex2) {
      Throwable causa = ex2.getCause();
      while (causa != null && causa != ex2) {
        ex2 = causa;
        causa = ex2.getCause();
      }
      try {
        throw ex2;
      } catch (final ConstraintViolationException ex3) {
        return preparaError(ex3.getConstraintViolations());
      } catch (Throwable ex3) {
        return preparaError(ex3, reemplazoDeMensajes);
      }
    }
  }
  /** Toma la primera violación y la muestra como error.
   * @param violaciones conjunto de violaciones a restricciones de Bean Validation. */
  private List<Error> preparaError(final Set<ConstraintViolation<?>> violaciones) {
    final List<Error> resultado = new ArrayList<>(violaciones.size());
    for (final ConstraintViolation<?> violacion : violaciones) {
      final String propiedad = violacion.getPropertyPath().toString();
      final String mensaje = violacion.getMessage();
      if (propiedad == null || propiedad.isEmpty()) {
        resultado.add(new Error(null, mensaje));
      } else {
        resultado.add(new Error(propiedad, mensaje));
      }
    }
    return resultado;
  }
  private List<Error> preparaError(final Throwable ex2,
          final Map<String, String> reemplazoDeMensajes) {
    String mensaje = ex2.getLocalizedMessage();
    if (mensaje == null) {
      return Collections.
              singletonList(new Error(null, "Error al realizar operación."));
    } else if (reemplazoDeMensajes == null) {
      return Collections.singletonList(new Error(null, mensaje));
    } else {
      for (Map.Entry<String, String> entry : reemplazoDeMensajes.entrySet()) {
        final String llave = entry.getKey();
        final String valor = entry.getValue();
        if (llave != null && valor != null && mensaje.contains(llave)) {
          mensaje = valor;
        }
      }
      return Collections.singletonList(new Error(null, mensaje));
    }
  }
}
