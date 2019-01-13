/* Copyright 2017 Ricardo Armando Machorro Reyes.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License. */
package net.ramptors.jsf.compro;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TemporalType;
import net.ramptors.jee.CtrlTransacciones;
import static net.ramptors.jee.UtilJee.format;
import static net.ramptors.jee.UtilJee.getFormatoPrecio;

/** @author Ricardo Armando Machorro Reyes.*/
@Named @RequestScoped
public class CtrlReporte {
  private final Date día = new Date();
  protected List<Object[]> lista;
  @Inject CtrlTransacciones ctrlTransacciones;
  @PostConstruct public void inicia() {
    final Calendar c1 = Calendar.getInstance(getTimeZone(), getLocale());
    c1.setTime(día);
    c1.set(Calendar.HOUR_OF_DAY, 0);
    c1.set(Calendar.MINUTE, 0);
    c1.set(Calendar.SECOND, 0);
    c1.set(Calendar.MILLISECOND, 0);
    final Calendar c2 = Calendar.getInstance(getTimeZone(), getLocale());
    c2.setTime(día);
    c2.set(Calendar.HOUR_OF_DAY, 23);
    c2.set(Calendar.MINUTE, 59);
    c2.set(Calendar.SECOND, 59);
    c2.set(Calendar.MILLISECOND, 999);
    final Date fecha1 = c1.getTime();
    final Date fecha2 = c2.getTime();
    EntityManager em = null;
    try {
      em = iniciaTransaccion();
      lista = em.createNamedQuery("Venta.reporte", Object[].class).
          setParameter("fecha1", fecha1, TemporalType.TIMESTAMP).
          setParameter("fecha2", fecha2, TemporalType.TIMESTAMP).
          getResultList();
      commit(em);
    } finally {
      ctrlTransacciones.cierra(em);
    }
  }
  public List<Object[]> getLista() {
    return lista;
  }
  public Date getFecha() {
    return día;
  }
  public String getTotal() {
    final BigDecimal total = getLista().stream().map(
        arr -> (BigDecimal) arr[1]).reduce(
            BigDecimal.ZERO.setScale(2, RoundingMode.DOWN),
            BigDecimal::add);
    return format(getFormatoPrecio(), total);
  }
  private EntityManager iniciaTransaccion() {
    return ctrlTransacciones.inicia();
  }
  private void commit(EntityManager em) {
    ctrlTransacciones.commit(em);
  }
  protected static TimeZone getTimeZone() {
    return TimeZone.getTimeZone("America/Mexico_City");
  }
  private static Locale getLocale() {
    return new Locale("es-MX");
  }
}
