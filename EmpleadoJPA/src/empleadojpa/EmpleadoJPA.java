/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author oswaldosaldivar
 */
public class EmpleadoJPA {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpleadoJPAPU");
    static EntityManager em = emf.createEntityManager();
    static EntityTransaction et = null;
    
    public static void main(String[] args) {
        
        Empleado em1 = new Empleado();
        em1.setNombreEmpleado("Oswaldo Peralta");
        
        Direccion dir1 = new Direccion();
        dir1.setNombreCalle("Calle siempre viva");
        dir1.setCodigoPostal("20029");
        
        em1.setDireccion(dir1);
        
        try{
            
            et = em.getTransaction();
            et.begin();
            em.persist(em1);
            et.commit();
        
        }catch(RuntimeException e){
            if(et.isActive()){
                et.rollback();
            
                throw e;
            }
        
        }
        
        
        
        
    }
    
}
