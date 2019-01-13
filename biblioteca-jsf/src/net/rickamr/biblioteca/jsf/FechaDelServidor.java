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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/** Devuelve la hora del servidor en distintos formatos que pueden ser usados para
 * configurar la interfaz gráfica.
 * @author Ricardo Armando Machorro Reyes */
@Named(value = "fechaDelServidor") @ApplicationScoped
public class FechaDelServidor {
  private static final SimpleDateFormat fmtHtml5 =
      new SimpleDateFormat("yyyy-MM-dd", Locale.forLanguageTag("es-MX"));
  private static final SimpleDateFormat fmtFechaYHoraHtml5 =
      new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.forLanguageTag("es-MX"));
  public Date getFecha() {
    return new Date();
  }
  public String getFechaHtml5() {
    return fmtHtml5.format(new Date());
  }
  public String getFechaYHoraHtml5() {
    return fmtFechaYHoraHtml5.format(new Date());
  }
}