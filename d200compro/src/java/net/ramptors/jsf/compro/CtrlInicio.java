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
package net.ramptors.jsf.compro;

import java.util.Arrays;
import java.util.Collections;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import net.ramptors.jee.CtrlTransacciones;
import static net.ramptors.jee.UtilJee.encripta;
import net.ramptors.jee.compro.entidad.Rol;
import net.ramptors.jee.compro.entidad.Usuario;

/**
 * Web application lifecycle listener.
 *
 * @author Ricardo Armando Machorro Reyes.
 */
public class CtrlInicio implements ServletContextListener {
  public static final String ADMINISTRADOR = "Administrador";
  public static final String CLIENTE = "Cliente";
  public static final Rol[] ROLES = {
    new Rol(ADMINISTRADOR, "Administra el sistema."),
    new Rol(CLIENTE, "Realiza compras.")};
  private static final String ID_ADMINISTRADOR = "admin";
  private static final String CONTRASENA_ADMINISTRADOR = "istra";
  private static final String NOMBRE_ADMINISTRADOR = "Cámbiame";
  @Inject CtrlTransacciones ctrlTransacciones;
  @Override public void contextInitialized(ServletContextEvent sce) {
    EntityManager em = null;
    try {
      em = iniciaTransaccion();
      final EntityManager em1 = em;
      Arrays.stream(ROLES).forEach(rol -> {
        if (em1.find(Rol.class, rol.getId()) == null) {
          em1.persist(rol);
        }
      });
      if (em.find(Usuario.class, ID_ADMINISTRADOR) == null) {
        final Usuario usuario = new Usuario();
        usuario.setId(ID_ADMINISTRADOR);
        usuario.setContrasena(encripta(CONTRASENA_ADMINISTRADOR));
        usuario.setNombre(NOMBRE_ADMINISTRADOR);
        usuario.setRoles(
            Collections.singleton(em.find(Rol.class, ADMINISTRADOR)));
        em.persist(usuario);
      }
      commit(em);
    } finally {
      ctrlTransacciones.cierra(em);
    }
  }
  @Override public void contextDestroyed(ServletContextEvent sce) {
  }
  private EntityManager iniciaTransaccion() {
    return ctrlTransacciones.inicia();
  }
  private void commit(EntityManager em) {
    ctrlTransacciones.commit(em);
  }
}
