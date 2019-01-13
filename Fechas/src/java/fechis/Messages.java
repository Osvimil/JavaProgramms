
package fechis;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@ApplicationScoped
public class Messages {
    
    public void informacion(String idDeComponente,final String texto){
        messages(idDeComponente,FacesMessage.SEVERITY_ERROR,texto,null);
        
    }
    
    
    public void error(String idDeComponente, final String texto){
        messages(idDeComponente, FacesMessage.SEVERITY_ERROR,texto,null);
    
    }
    
    public void messages(String idDeComponente,FacesMessage.Severity tipo,String resumen,String detalles){
        FacesContext.getCurrentInstance().addMessage(idDeComponente, new FacesMessage(tipo,resumen,detalles));
        
    
    }
    
    
}
