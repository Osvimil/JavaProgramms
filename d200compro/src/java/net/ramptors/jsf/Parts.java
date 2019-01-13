/* Copyright 2017 Ricardo Armando Machorro Reyes. Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License. */
package net.ramptors.jsf;

import java.io.DataInputStream;
import java.io.IOException;
import javax.servlet.http.Part;

/** Funciones de apoyo al procesamiento de jsf. */
public class Parts {
  private Parts() {
  }
  /** Construye una arreglo de bytes con el contenido de una parte.
   * @param part parte que representa a un archivo
   * @return un arreglo de bytes con el contenido de la parte o null si el
   * tamaño del archivo es vacío o nulo. */
  public static byte[] getBytes(final Part part) {
    if (part == null) {
      return null;
    } else {
      final long size = part.getSize();
      if (size > 0) {
        final byte[] bytes = new byte[(int) size];
        try (DataInputStream dis = new DataInputStream(part.getInputStream())) {
          dis.readFully(bytes);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
        return bytes;
      } else {
        return null;
      }
    }
  }
}
