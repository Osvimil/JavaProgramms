/* Copyright 2014 Ricardo Armando Machorro Reyes
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License. */
package net.rickamr.biblioteca.java;

import java.io.Serializable;
import java.util.Objects;

/**
 * Operaciones comunes para una entidad y permite identificar su llave primaria. Está
 * diseñada para crear subclases de esta clase que implementen el método que devuelve
 * la llave primaria.
 *
 * @author Ricardo Armando Machorro Reyes
 */
public abstract class Entidad<I> implements Serializable, ProporcionaId<I> {
  private static final long serialVersionUID = 1L;
  /** Compara el objeto con otro y devuelve true si son de la misma clase y tienen el
   * mismo id; en otro caso devuelve false.
   * @param objeto referencia al segundo objeto que se compara.
   * @return true si los 2 objetos tienen el mismo id. En otro caso devuelve false. */
  @Override
  public boolean equals(final Object objeto) {
    if (objeto != null && getClass().isAssignableFrom(objeto.getClass())) {
      final Entidad<?> otro = (Entidad<?>) objeto;
      return Objects.equals(getId(), otro.getId());
    } else {
      return false;
    }
  }
  /** Calcula el hash code.
   * @return un hash code calculado en base a su id. */
  @Override
  public int hashCode() {
    return Objects.hashCode(getId());
  }
  @Override
  public String toString() {
    return getClass().getName() + '[' + getId() + ']';
  }
}
