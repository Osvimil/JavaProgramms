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

import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import net.rickamr.biblioteca.java.Entidad;

/** Operaciones básicas sobre una entidad.
 * @author Ricardo Armando Machorro Reyes */
@Stateless @Dependent
public class EjbAbc {
  @Inject
  protected EntityManager em;
  public <T> List<T> buscaInstancias(String consulta, Class<T> tipo) {
    return em.createNamedQuery(consulta, tipo).getResultList();
  }
  public <T> List<T> buscaInstancias(String consulta, String filtro, Class<T> tipo) {
    return em.createNamedQuery(consulta, tipo).
        setParameter("filtro", "%" + filtro + "%").getResultList();
  }
  public <T> List<T> buscaInstancias(String consulta, Entidad<?> objeto,
      Class<T> tipo) {
    return em.createNamedQuery(consulta, tipo).
        setParameter("id", objeto.getId()).getResultList();
  }
  public <T> T busca(Class<T> tipo, final Object id) {
    return em.find(tipo, id);
  }
  public void agrega(final Object modelo) {
    em.persist(modelo);
  }
  public void modifica(final Object modelo) {
    em.merge(modelo);
  }
  public void elimina(Class<?> tipo, final Object id) {
    final Object objeto = em.find(tipo, id);
    if (objeto != null) {
      em.remove(objeto);
    }
  }
}
