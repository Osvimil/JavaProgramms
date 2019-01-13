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

import java.io.DataInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Part;
import net.rickamr.biblioteca.java.Archivo;

/** Utilerías par el manejo de solicitudes multiparte.
 * @author Ricardo Armando Machorro Reyes */
public class Parts {
  private static final String CONTENT_DISPOSITION = "content-disposition";
  private static final String CONTENT_DISPOSITION_FILENAME = "filename";
  /** Construye una instancia de <code>Archivo</code> con el contenido de una parte.
   * @param part parte que representa a un archivo
   * @return un archivo con el contenido de la parte o null si el el nombre de archivo
   *         es vacío o nulo.
   * @throws IOException      si hay un error de entrada o salida.
   * @throws ServletException Si algo sale mal. */
  public static Archivo leeArchivo(final Part part)
          throws IOException, ServletException {
    if (part == null) {
      return null;
    } else {
      final String filename = getFilename(part);
      if (filename == null || filename.isEmpty()) {
        return null;
      } else {
        final byte[] bytes = new byte[(int) part.getSize()];
        try (DataInputStream dis = new DataInputStream(part.getInputStream())) {
          dis.readFully(bytes);
        }
        return new Archivo(bytes);
      }
    }
  }
  /** Devuelve el nombre de archivo de una parte.
   * @param part parte que se analiza.
   * @return el nombre de archivo de la parte o null si la parte corresponde a un
   *         campo del formulario. */
  public static String getFilename(Part part) {
    for (String cd : part.getHeader(CONTENT_DISPOSITION).split(";")) {
      if (cd.trim().startsWith(CONTENT_DISPOSITION_FILENAME)) {
        return cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
      }
    }
    return null;
  }
}
