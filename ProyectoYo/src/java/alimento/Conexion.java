/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimento;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author oswaldosaldivar
 */
@Dependent
public class Conexion {
    
    @Produces @PersistenceUnit
  EntityManagerFactory emf;
    
}
