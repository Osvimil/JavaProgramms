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

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;

/** Anotación para especificar que una imagen debe tener un formato que pueda manejar
 * la implementación de Java que ejecute el código. Puede colocarse en métodos
 * (normalmente getter), campos y tipos (definición de clases, interfaces, etc.). Se
 * puede usar durante la ejecución del programa y es validada por objetos de la clase
 * ValidadorDeImagen. El campo message indica la clave del texto de error en el
 * archivo <em>ValidationMessages.messages</em>. El campo groups indica en que
 * condiciones se evalúa. El campo payload indica más detalles sobre la violación, por
 * ejemplo si es un error o un aviso. */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {ValidadorDeImagenBytes.class,
  ValidadorDeImagenArchivo.class, ValidadorDeImagenPart.class})
public @interface Imagen {
  String message() default "{net.rickamr.validation.Imagen.message}";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
}
