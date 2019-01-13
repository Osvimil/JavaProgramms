
package messagess;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Named("cNumeros")
@RequestScoped
public class CtrlNumeros {
    private static final NumberFormat fmtEntero = NumberFormat.getIntegerInstance(Locale.forLanguageTag("es-MX"));
    private static final DecimalFormat fmtNumero = new DecimalFormat("#, ##0.00",DecimalFormatSymbols.getInstance(Locale.forLanguageTag("es-MEX")));
    private static final NumberFormat fmtMoneda = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-MX"));
    private static final NumberFormat fmtPorcentaje = NumberFormat.getPercentInstance(Locale.forLanguageTag("es-MX"));
    
    @NotNull
    @Min(0)
    @Max(20)
    private Integer entero;
    @NotNull
    private Double numero;
    @NotNull
    @Min(3)
    @Max(10)
    private Integer rango;
    private BigDecimal precio;
    private Double porcentaje;
    @Inject
    private Mismensajes mensajes; // Mensajes mensajes = new Mensajes();

    public Integer getEntero() {
        return entero;
    }

    public void setEntero(Integer entero) {
        this.entero = entero;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public Integer getRango() {
        return rango;
    }

    public void setRango(Integer rango) {
        this.rango = rango;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public void procesa(){
        if(rango != null && entero != null){
            porcentaje = (double) entero / (double) rango;
        
        }
        if(entero != null){
            mensajes.informacion("entero", fmtEntero.format(entero));       
        }
        
        if(numero != null){
             precio = new BigDecimal(numero).multiply(BigDecimal.valueOf(1250.5));
              mensajes.informacion("entero", fmtNumero.format(numero)); 
                    
        }
        if(rango != null){
             
              mensajes.informacion("rango", fmtEntero.format(rango)); 
                    
        }
        if(precio != null){
             
              mensajes.informacion(null,"Precio: "+fmtMoneda.format(precio));                    
        }
        if(porcentaje != null){
             
              mensajes.informacion(null,"Porcentaje de entero/rango: "+fmtPorcentaje.format(porcentaje));                    
        }                
    }
       
}
