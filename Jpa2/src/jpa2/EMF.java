/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa2;

/**
 *
 * @author oswaldosaldivar
 */

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
public class EMF {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jpa2PU");

 private EMF() {

 }

 public static EntityManagerFactory getEntityManagerFactory() {

 return entityManagerFactory;

 }
    
}
