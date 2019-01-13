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
package net.ramptors.jsf;

import net.ramptors.jee.ReemplazoDeMensajes;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import net.ramptors.jee.CtrlTransacciones;
import static net.ramptors.jee.UtilJee.getMensaje;
import static net.ramptors.jee.UtilJee.isNullOrEmpty;

/** Procesa las excepciones.
 *
 * @author Ricardo Armando Machorro Reyes. */
public class CtrlBase {
  @Inject @ReemplazoDeMensajes
  Map<String, String> reemplazoDeMensajes;
  @Inject CtrlTransacciones ctrlTransacciones;
  protected EntityManager iniciaTransaccion() {
    return ctrlTransacciones.inicia();
  }
  protected void commit(EntityManager em) {
    ctrlTransacciones.commit(em);
  }
  protected void cierra(EntityManager em) {
    ctrlTransacciones.cierra(em);
  }
  /** Analiza una excepción para poder mostrar el error de error que lleva.
   * Normalmente cuendo un EJB detecta un error, lanza otras excepciones y
   * guarda la causa original. Esta última es necesaria para mostrar el error
   * que manda el manejador de base de datos.
   *
   * @param mensaje un error relacionado con el fallo.
   * @param e excepción que describe un error. */
  protected void procesa(String mensaje, Throwable e) {
    Logger.getLogger(getClass().getName()).log(Level.SEVERE, mensaje, e);
    procesa(e);
  }
  protected void procesa(Throwable e) {
    try {
      throw e;
    } catch (final ConstraintViolationException ex) {
      muestra(ex.getConstraintViolations());
    } catch (Throwable ex) {
      Throwable causa = ex.getCause();
      if (causa == null) {
        reemplaza(getMensaje(ex));
      } else {
        procesa(causa);
      }
    }
  }
  /** Toma la primera violación y la muestra como error.
   *
   * @param violaciones conjunto de violaciones a restricciones de Bean
   * Validation. */
  protected void muestra(Set<ConstraintViolation<?>> violaciones) {
    muestraError(null, "Hay errores en los datos capturados.");
    violaciones.parallelStream().forEach((violacion) -> {
      final String propiedad = violacion.getPropertyPath().toString();
      final String mensaje = violacion.getMessage();
      if (isNullOrEmpty(propiedad)) {
        muestraError(null, mensaje);
      } else {
        muestraError(propiedad + ":v", mensaje);
      }
    });
  }
  protected void reemplaza(String mensaje) {
    for (Map.Entry<String, String> entry : reemplazoDeMensajes.entrySet()) {
      final String llave = entry.getKey();
      final String valor = entry.getValue();
      if (llave != null && valor != null && mensaje.contains(llave)) {
        muestraError(null, valor);
        return;
      }
    }
    muestraError(null, mensaje);
  }
  /** Muestra un mensaje de error.
   *
   * @param idDeComponente id del componente de la página al que se asocia el
   * mensaje.
   * @param mensaje versión corta del mensaje. */
  protected void muestraError(String idDeComponente, String mensaje) {
    FacesContext.getCurrentInstance().addMessage(idDeComponente,
        new FacesMessage(FacesMessage.SEVERITY_ERROR, mensaje, null));
  }
}
