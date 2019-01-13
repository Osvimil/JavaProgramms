/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textines;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import static javax.swing.text.StyleConstants.Size;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author oswaldosaldivar
 */

@Named("cTextos")
@RequestScoped
public class CtrlTextos {
    
    @NotNull @Size(min = 1, max = 17)
    private String nombre;
    
    @Size (min = 5, max = 17)
    private String secreto;
    @NotNull
    private String navegador;
    @NotNull @Pattern(regexp = "")
    private String email;
    @Pattern (regexp = "")
    private String usuario;
    @NotNull @Pattern(regexp = "")
    private String url;
    @Pattern(regexp = "")
    
    
    
}
