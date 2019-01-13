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

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJBException;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import net.rickamr.biblioteca.java.Generics;
import net.rickamr.biblioteca.jee.EjbAbc;

/** Controlador que permite editar las propiedades de un objeto.
 * @author Ricardo Armando Machorro Reyes
 * @param <T> Tipo que edita
 * @param <I> Tipo de la llave primaria del tipo que edita. */
public class CtrlEdita<T, I> implements Serializable {
  private static final long serialVersionUID = 1L;
  @Inject
  protected ErroresJsf erroresJsf;
  @Inject
  protected EjbAbc ejb;
  protected I id;
  protected T modelo;
  @PostConstruct
  public void init() {
    try {
      leeLlavePrimaria();
    } catch (Exception ex) {
      // Si no se puede recuperar la llave primaria, se considera que es una alta.
      id = null;
    }
    try {
      // Se recupera el objeto a insertar.
      final Class<T> tipo = Generics.getParámetroGenérico(this, 0);
      if (isNuevo()) {
        modelo = tipo.newInstance();
      } else {
        this.modelo = ejb.busca(tipo, id);
      }
    } catch (IllegalAccessException | InstantiationException | EJBException ex) {
      procesaErrores(ex);
    }
  }
  public T getModelo() {
    return modelo;
  }
  public boolean isNuevo() {
    return id == null;
  }
  public String regresa() {
    return "index?faces-redirect=true";
  }
  public String guarda() {
    try {
      if (isNuevo()) {
        ejb.agrega(modelo);
      } else {
        ejb.modifica(modelo);
      }
      return regresa();
    } catch (EJBException ex) {
      procesaErrores(ex);
      return null;
    }
  }
  protected void leeLlavePrimaria() throws Exception {
    final Class<I> tipoDeLaLlave = Generics.getParámetroGenérico(this, 1);
    final String parámetroId = FacesContext.getCurrentInstance().
        getExternalContext().getRequestParameterMap().get("id");
    id = Generics.newInstance(tipoDeLaLlave, parámetroId);
  }
  protected void procesaErrores(Exception ex) {
    erroresJsf.procesa(ex);
  }
}
