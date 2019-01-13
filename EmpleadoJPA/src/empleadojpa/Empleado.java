/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author oswaldosaldivar
 */

@Entity
public class Empleado {
    
    private String nombreEmpleado;
    
    @Id
    private Direccion direccion;
    
    public Empleado(){
    
    }
    
    public String getNombreEmpleado(){
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado){
        this.nombreEmpleado=nombreEmpleado;   
    }
    
    public Direccion getDireccion(){
        return direccion;
    }
    
    public void setDireccion(Direccion direccion){
        this.direccion=direccion;   
    }
    
    
}

