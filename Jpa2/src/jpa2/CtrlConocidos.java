
package jpa2;


import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;

import javax.persistence.EntityTransaction;

public class CtrlConocidos {

 private static final EntityManagerFactory emf = EMF.getEntityManagerFactory();



 public List<Conocido> lista() {

 final EntityManager em = getEntityManager();

 List<Conocido> lista;

 try {
     
 lista = em.createQuery("SELECT c FROM Conocido c ORDER BY c.nombre",Conocido.class).getResultList();

 } finally {

 em.close();

 }

 return lista;

 }

 /**

 * Busca un objeto en base a su id.

 * @param id la llave primaria del objeto.

 * @return el objeto asociado al id, o null si no está registrado.

 */

 public Conocido busca(Long id) {

 EntityManager em = getEntityManager();

 try {

 return em.find(Conocido.class, id);

 } finally {

 em.close();

 }

 }

 /**

 * Agrega un nuevo conocido.

 * @param modelo el conocido por agregar.

 * @return el conocido como queda almacenado en la base de datos, incluido el

 * id generado.

 */

 public Conocido agrega(Conocido modelo) {

 final EntityManager em = getEntityManager();

 try {

 final EntityTransaction tx = em.getTransaction();

 tx.begin();

 em.persist(modelo);

 tx.commit();

 return modelo;

 } finally {

 em.close();

 }

 }

 /**

 * Actualiza un conocido ya registrado. Si el conocido no está registrado, se

 * lanza una excepción.

 * @param modelo el conocido por actualizar.

 * @return el conocido actualizado.

 */

 public Conocido modifica(Conocido modelo) {

 final EntityManager em = getEntityManager();

 try {

 final EntityTransaction tx = em.getTransaction();

 tx.begin();

 modelo = em.merge(modelo);

 tx.commit();

 return modelo;

 } finally {
     
 em.close();

 }

 }

 /**

 * Elimina el conocido con la llave primaria id.

 * @param id la llave primaria del conocido que se elimina.

 */

 public void elimina(Long id) {

 final EntityManager em = getEntityManager();

 try {

 final EntityTransaction tx = em.getTransaction();

 tx.begin();

 // Busca un conocido usando su llave primaria.

 final Conocido modelo = em.find(Conocido.class, id);

 if (modelo != null) {

 /* Si la referencia no es nula, significa que el modelo se encontró la

 * referencia no es nula y se elimina. */

 em.remove(modelo);

 }

 tx.commit();

 } finally {

 em.close();

 }

 }

 private static EntityManager getEntityManager() {

 return emf.createEntityManager();

 }

}