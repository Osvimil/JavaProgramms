/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimento;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author oswaldosaldivar
 */

@Entity
@Table(uniqueConstraints = {
    
@UniqueConstraint(name = "CON_D_NOMBRE", columnNames = {"nombre"})})
public class Pizza implements Serializable {
    
    
  private static final long serialVersionUID = 1L;
  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @NotNull @Size(min = 1, max = 255)
  private String nombre;
  @NotNull @Pattern(regexp = "\\d{8,14}")
  private String telefono;
  
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
  
   @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }
  
  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Pizza)) {
      return false;
    }
    Pizza other = (Pizza) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.
        equals(other.id))) {
      return false;
    }
    return true;
  }
   @Override
  public String toString() {
    return "alimento.Pizza[ id=" + id + " ]";
  }
  
  
  
    
}
