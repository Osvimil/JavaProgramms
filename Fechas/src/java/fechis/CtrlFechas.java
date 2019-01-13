
package fechis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

@Named(value="cFechas") @RequestScoped
public class CtrlFechas {
    
    private static final SimpleDateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy",Locale.forLanguageTag("es-MX"));
    private static final SimpleDateFormat fmthora = new SimpleDateFormat("HH:mm",Locale.forLanguageTag("es-MX"));
    private static final SimpleDateFormat fmtFechaYHora = new SimpleDateFormat("dd/MM/yyyy HH:mm XXX",Locale.forLanguageTag("es-MX"));
    private static final SimpleDateFormat fmtFechaYHoraLocal = new SimpleDateFormat("dd/MM/yyyy HH:mm",Locale.forLanguageTag("es-MX"));
    private static final SimpleDateFormat fmtHTML5 = new SimpleDateFormat("yyyy-MM-dd",Locale.forLanguageTag("es-MX"));
    
    @NotNull @Past
    private Date FechaPasado;
    @NotNull @Future
    private Date FechaFuturo;
    @NotNull
    private Date Hora;
    @NotNull
    private Date FechaYHora = new Date();
     @NotNull
    private Date fechaYHoraLocal;
    @NotNull
    private String semana; 
    @NotNull
    private String mes;
    @Inject
    private Messages messages;
    
     
  public Date getFechaDelServidor() {
    return new Date();
  }
  public String getFechaHtml5DelServidor() {
    return fmtHTML5.format(new Date());
  }

    public Date getFechaPasado() {
        return FechaPasado;
    }

    public void setFechaPasado(Date FechaPasado) {
        this.FechaPasado = FechaPasado;
    }

    public Date getFechaFuturo() {
        return FechaFuturo;
    }

    public void setFechaFuturo(Date FechaFuturo) {
        this.FechaFuturo = FechaFuturo;
    }

    public Date getHora() {
        return Hora;
    }

    public void setHora(Date Hora) {
        this.Hora = Hora;
    }

    public Date getFechaYHora() {
        return FechaYHora;
    }

    public void setFechaYHora(Date FechaYHora) {
        this.FechaYHora = FechaYHora;
    }

    public Date getFechaYHoraLocal() {
        return fechaYHoraLocal;
    }

    public void setFechaYHoraLocal(Date fechaYHoraLocal) {
        this.fechaYHoraLocal = fechaYHoraLocal;
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
     public void procesa() {
    if (FechaPasado != null) {
      messages.informacion("fechaDelPasado", fmtFecha.format(FechaPasado));
    }
    if (FechaFuturo != null) {
      messages.informacion("fechaDelFuturo", fmtFecha.format(FechaFuturo));
    }
    if (Hora != null) {
      messages.informacion("hora", fmthora.format(Hora));
    }
    if (FechaYHora != null) {
      messages.informacion("fechaYHora", fmtFechaYHora.format(FechaYHora));
    }
    if (fechaYHoraLocal != null) {
      messages.informacion("fechaYHoraLocal",
              fmtFechaYHoraLocal.format(fechaYHoraLocal));
    }
    messages.informacion("semana", semana);
    messages.informacion("mes", mes);
  }   
}
