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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

/** @author Ricardo Armando Machorro Reyes */
@Entity
public class Archivo extends Entidad<Long> {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Version
  private int version;
  /** Archivo almacenado. */
  @NotNull @Lob
  private byte[] bytes;
  public Archivo() {
  }
  public Archivo(byte[] bytes) {
    this.bytes = bytes;
  }
  @Override
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public int getVersion() {
    return version;
  }
  public void setVersion(int version) {
    this.version = version;
  }
  public byte[] getBytes() {
    return bytes;
  }
  public void setBytes(byte[] bytes) {
    this.bytes = bytes;
  }
  public boolean isImagen() throws IOException {
    return isImagen(new ByteArrayInputStream(bytes));
  }
  public static boolean isImagen(InputStream inputStream) throws IOException {
    return ImageIO.read(inputStream) != null;
  }
}
