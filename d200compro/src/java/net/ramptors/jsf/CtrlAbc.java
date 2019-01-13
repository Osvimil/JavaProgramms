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

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import net.ramptors.jee.Entidad;

/** Operaciones básicas sobre una entidad.
 *
 * @author Ricardo Armando Machorro Reyes.
 * @param <M>
 * @param <I> */
public abstract class CtrlAbc<M extends Entidad<I>, I> extends CtrlBase
    implements Serializable {
  private static final long serialVersionUID = 1L;
  private boolean muestraDetalle;
  private String filtro;
  private List<M> lista;
  private boolean nuevo;
  private M modelo;
  protected final Class<M> tipoModelo;
  protected final String tituloMaestro;
  protected final String tituloDeNuevo;
  protected final String consultaFiltro;
  protected abstract String getTituloDeModelo();
  public CtrlAbc(Class<M> tipoModelo, String tituloMaestro,
      String tituloDeNuevo, String consultaTodos) {
    this.consultaFiltro = consultaTodos;
    this.tipoModelo = tipoModelo;
    this.tituloMaestro = tituloMaestro;
    this.tituloDeNuevo = tituloDeNuevo;
  }
  public boolean isMuestraMaestro() {
    return !isMuestraDetalle();
  }
  public boolean isMuestraDetalle() {
    return muestraDetalle;
  }
  public String getTitulo() {
    if (isMuestraDetalle()) {
      return isNuevo() ? tituloDeNuevo : getTituloDeModelo();
    } else {
      return tituloMaestro;
    }
  }
  public String getFiltro() {
    return filtro;
  }
  public void setFiltro(String filtro) {
    this.filtro = filtro;
  }
  public List<M> getLista() {
    return lista;
  }
  public boolean isNuevo() {
    return nuevo;
  }
  public M getModelo() {
    return modelo;
  }
  @PostConstruct public void inicia() {
    EntityManager em = null;
    try {
      em = iniciaTransaccion();
      inicia(em);
      commit(em);
    } catch (Exception e) {
      procesa("Error inicializando.", e);
    } finally {
      cierra(em);
    }
  }
  public void agrega() {
    EntityManager em = null;
    try {
      final M entidad = creaModelo();
      configuraDetalle(true, entidad);
      em = iniciaTransaccion();
      muestraModelo(em);
      commit(em);
    } catch (Exception e) {
      procesa("Error preparando para agregar.", e);
    } finally {
      cierra(em);
    }
  }
  public void detalle(M entidad) {
    EntityManager em = null;
    try {
      configuraDetalle(false, entidad);
      em = iniciaTransaccion();
      muestraModelo(em);
      commit(em);
    } catch (RuntimeException e) {
      procesa("Error recuperando detalle.", e);
    } finally {
      cierra(em);
    }
  }
  public void guarda() {
    EntityManager em = null;
    try {
      em = iniciaTransaccion();
      llenaModelo(em);
      if (isNuevo()) {
        em.persist(getModelo());
      } else {
        em.merge(getModelo());
      }
      em.flush();
      inicia(em);
      commit(em);
    } catch (Exception e) {
      procesa("Error agregando.", e);
    } finally {
      cierra(em);
    }
  }
  public void elimina() {
    EntityManager em = null;
    try {
      em = iniciaTransaccion();
      final M entidad = em.find(tipoModelo, getModelo().getId());
      if (entidad != null) {
        em.remove(entidad);
      }
      em.flush();
      inicia(em);
      commit(em);
    } catch (Exception e) {
      procesa("Error modificando.", e);
    } finally {
      cierra(em);
    }
  }
  public void llenaModelo(EntityManager em) {
  }
  public void muestraModelo(EntityManager em) {
  }
  protected String getFiltroCompleto() {
    return "%" + Objects.toString(getFiltro(), "").toUpperCase() + "%";
  }
  protected void inicia(EntityManager em) {
    muestraDetalle = false;
    modelo = null;
    lista = consulta(em);
  }
  protected List<M> consulta(EntityManager em) {
    return em.createNamedQuery(consultaFiltro, tipoModelo).
        setParameter("filtro", getFiltroCompleto()).
        getResultList();
  }
  protected void configuraDetalle(boolean nuevo, M modelo) {
    this.nuevo = nuevo;
    this.modelo = modelo;
    muestraDetalle = true;
  }
  protected M creaModelo() {
    try {
      return tipoModelo.newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }
}
