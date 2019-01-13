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

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.enterprise.context.ApplicationScoped;

/** Se usa para encriptar datos con el algoritmo SHA-256.
 * @author Ricardo Armando Machorro Reyes */
@ApplicationScoped
public class Encriptador {
  public String encripta(final String texto) {
    try {
      final MessageDigest md = MessageDigest.getInstance("SHA-256");
      // Crea una instancia que aparta 64 caracteres.
      final StringBuilder sb = new StringBuilder(64);
      for (final byte b : md.digest(texto.getBytes("UTF-8"))) {
        sb.append(String.format("%02x", b & 0xff));
      }
      return sb.toString();
    } catch (final NoSuchAlgorithmException | UnsupportedEncodingException ex) {
      throw new IllegalArgumentException(ex);
    }
  }
}
