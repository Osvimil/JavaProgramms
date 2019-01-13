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

import java.io.IOException;
import javax.servlet.http.Part;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import net.rickamr.biblioteca.java.Archivo;

/** Valida los valores de tipo UploadedFile anotados con <code>@ArchivoImagen</code>.
 * Verifica que el archivo tenga un formato de imagen que pueda manejar Java.
 * Normalmente se usa en las clases controladoras. */
public class ValidadorDeImagenPart implements ConstraintValidator<Imagen, Part> {
  /** Inicializa al objeto con los valores de la anotación.
   * @param constraintAnnotation anotación con los valores declarados. */
  @Override
  public void initialize(Imagen constraintAnnotation) {
  }
  /** Realiza la validación.
   * @param value   referencia al objeto que se valida.
   * @param context datos adicionales que pueden servir para realizar la validación.
   * @return <code>true</code> si el valor pasa la validación; <code>false</code> en
   *         caso contrario. */
  @Override
  public boolean isValid(Part value, ConstraintValidatorContext context) {
    if (value == null) {
      return true;
    } else {
      try {
        return Archivo.isImagen(value.getInputStream());
      } catch (IOException ex) {
        return false;
      }
    }
  }
}
