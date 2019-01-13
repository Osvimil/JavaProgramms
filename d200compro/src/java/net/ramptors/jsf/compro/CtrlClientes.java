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

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;
import static net.ramptors.jee.UtilJee.format;
import net.ramptors.jee.compro.entidad.Cliente;
import net.ramptors.jsf.CtrlAbc;
import static net.ramptors.jee.UtilJee.getFormatoFecha;
import static net.ramptors.jee.UtilJee.getFormatoHora;
import static net.ramptors.jee.UtilJee.parseFechaWeb;
import static net.ramptors.jee.UtilJee.parseHoraWeb;
import net.ramptors.jee.compro.entidad.Venta;

/**
 *
 * @author Ricardo Armando Machorro Reyes.
 */
@Named @ViewScoped
public class CtrlClientes extends CtrlAbc<Cliente, String> {
  private static final long serialVersionUID = 1L;
  private String nacimiento;
  private String horaFavorita;
  public CtrlClientes() {
    super(Cliente.class, "Clientes", "Cliente Nuevo", Cliente.FILTRO);
  }
  public String getNacimiento() {
    return nacimiento;
  }
  public void setNacimiento(String nacimiento) {
    this.nacimiento = nacimiento;
  }
  public String getHoraFavorita() {
    return horaFavorita;
  }
  public void setHoraFavorita(String horaFavorita) {
    this.horaFavorita = horaFavorita;
  }
  @Override protected String getTituloDeModelo() {
    return getModelo().getId();
  }
  @Override public void llenaModelo(EntityManager em) {
    if (isNuevo()) {
      final Venta venta = new Venta();
      venta.setCliente(getModelo());
      getModelo().setVentaActual(venta);
    }
    getModelo().setNacimiento(parseFechaWeb(getNacimiento(),
        "Formato incorrecto para Nacimiento."));
    getModelo().setHoraFavorita(parseHoraWeb(getHoraFavorita(),
        "Formato incorrecto para Hora Favorita."));
  }
  @Override public void muestraModelo(EntityManager em) {
    setNacimiento(format(getFormatoFecha(), getModelo().getNacimiento()));
    setHoraFavorita(format(getFormatoHora(), getModelo().getHoraFavorita()));
  }
}
