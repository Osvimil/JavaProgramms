
package proveedor;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class CtrlProveedor {
    private static final EntityManagerFactory emf = EMF.getEntityManagerFactory();
    
    public List<ProveedorEficaz> lista() {
final EntityManager em = getEntityManager();
List<ProveedorEficaz> lista;
try {
    lista = em.createQuery("SELECT c FROM Proveedor c ORDER BY c.nombre",ProveedorEficaz.class).getResultList();
} finally {
em.close();
}
return lista;   
}
    
    public ProveedorEficaz buscar(Long id) {
EntityManager em = getEntityManager();
try {
return em.find(ProveedorEficaz.class, id);
} finally {
em.close();
}
}
    
    public ProveedorEficaz agregar(ProveedorEficaz modelo) {
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
    
    public ProveedorEficaz modificar(ProveedorEficaz modelo) {
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
    
    public void eliminar(Long id) {
final EntityManager em = getEntityManager();
try {
final EntityTransaction tx = em.getTransaction();
tx.begin();
// Busca un conocido usando su llave primaria.
final ProveedorEficaz modelo = em.find(ProveedorEficaz.class, id);
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
    
    
    

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
}
