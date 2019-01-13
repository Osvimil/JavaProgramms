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

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/** Métodos que simplifican el manejo de parámetros genéricos.
 * @author Ricardo Armando Machorro Reyes */
public class Generics {
  /** Hace una copia de un objeto usando su constructor de copia.
   * @param <T>      Tipo esperado del objeto que se copia.
   * @param tipo     variable de clase del objeto.
   * @param original referencia al objeto que se copia.
   * @return una copia del original.
   * @throws Exception si el objeto no se puede crear. */
  public static <T> T copia(Class<T> tipo, T original) throws Exception {
    return tipo.getDeclaredConstructor(tipo).newInstance(original);
  }
  /** Crea un objeto usando un constructor que reciba un <code>String</code>.
   * @param <T>   Clase del objeto que se crea.
   * @param tipo  variable de clase que crea el objeto.
   * @param texto parámetro para el constructorm
   * @return en objeto creado.
   * @throws Exception si el objeto no se puede crear. */
  public static <T> T newInstance(Class<T> tipo, String texto) throws Exception {
    return tipo.getDeclaredConstructor(String.class).newInstance(texto);
  }
  /** Revisa que todos los objetos de un arreglo sean instancias de una clase y
   * devuelve una lista con todos los elementos del arreglo y el parámetro genérico
   * correcto.
   * @param <T>     tipo que se desea tengan los elmentos del arreglo.
   * @param tipo    clase concreta que corresponde al parámetro T.
   * @param arreglo contiene los objetos que se revisan.
   * @return un listado con los objetos del tipo T. */
  public static <T> List<T> revisaTipo(Class<T> tipo, Object[] arreglo) {
    final ArrayList<T> lista = new ArrayList<>(arreglo.length);
    for (Object object : arreglo) {
      lista.add(tipo.cast(object));
    }
    return lista;
  }
  /** Devuelve un parámetro genérico utilizado para construir un objeto.
   * @param <T>    Tipo esperado del parámetro.
   * @param objeto instancia cereada con parámetros genéricos.
   * @param índice índice del parámetro genérico.
   * @return una unstancia de la clase T, que es el parámetro genérico en el índice
   *         indicado. */
  @SuppressWarnings("unchecked")
  public static <T> Class<T> getParámetroGenérico(Object objeto, int índice) {
    return (Class<T>) (getParámetrosGenéricos(objeto)[índice]);
  }
  /** Identifica los tipos concretos que se usaron para crear un objeto cuya clase usa
   * parámetros genéricos.
   * @param objeto el objeto que se analiza.
   * @return un arreglo con los parámtros genéricos de la clase del objeto o de su
   *         clase madre más inmediata que usa parámetros genéricos. Si no tiene una
   *         clase madre con parámetros genéricos, se obtiene un arreglo vacío. */
  public static Type[] getParámetrosGenéricos(Object objeto) {
    Type genericSuperclass = objeto.getClass().getGenericSuperclass();
    while (genericSuperclass != null
        && !(genericSuperclass instanceof ParameterizedType)) {
      genericSuperclass = ((Class<?>) genericSuperclass).getGenericSuperclass();
    }
    if (genericSuperclass == null) {
      return new Type[0]; // Regresa un arreglo vacío.
    } else {
      final ParameterizedType pt = (ParameterizedType) genericSuperclass;
      return pt.getActualTypeArguments();
    }
  }
}
