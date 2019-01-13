

package messagess;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


@ApplicationScoped
public class Mismensajes {
    
    public void informacion(String idDeComponente, final String texto){
        mensaje(idDeComponente, FacesMessage.SEVERITY_INFO, texto, null);
    }
    
    public void error(String idDeComponente, final String texto){
        mensaje(idDeComponente, FacesMessage.SEVERITY_ERROR, texto, null);
    
    }
    
    public void mensaje(String idDeComponente, FacesMessage.Severity tipo,String resumen, String detalles){
        FacesContext.getCurrentInstance().addMessage(idDeComponente, new FacesMessage(tipo, resumen, detalles));   
    }    
}

