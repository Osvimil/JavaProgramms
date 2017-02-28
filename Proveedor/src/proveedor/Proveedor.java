
package proveedor;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Proveedor  {


         static final SimpleDateFormat fmt=new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws InterruptedException {
        
        try{
        
        CtrlProveedor ctrlProveedor = new CtrlProveedor();
        
        ProveedorEficaz proveedor1 = new ProveedorEficaz("Marinela","Calle de los azulejos 27","56331147",fmt.parse("17/03/2016"),"Barritas Marinela");
        ProveedorEficaz proveedor2 = new ProveedorEficaz("Sabritas","Calle siempre viva 120","5622190",fmt.parse("18/03/2016"),"Ruffles");
        ProveedorEficaz proveedor3 = new ProveedorEficaz("Gamesa","Calle de los laureles 1200","56447789",fmt.parse("19/03/2016"),"Galletas quacker");
        ProveedorEficaz proveedor4 = new ProveedorEficaz("Coca-cola","Calle de los girasoles 800","56447789",fmt.parse("20/05/2016"),"Botellas sprite");

        ctrlProveedor.agregar(proveedor1);
        ctrlProveedor.agregar(proveedor2);
        ctrlProveedor.agregar(proveedor3);
        ctrlProveedor.agregar(proveedor4);
        
        proveedor1.setNombre("Pepsi");
        proveedor2.setProducto_que_vende("Churrumais");
        
        ctrlProveedor.modificar(proveedor1);
        ctrlProveedor.modificar(proveedor2);
        
        final Long idProveedor4 = proveedor4.getClave();
            System.out.println("Mostrando clave de proveedor 4:"+ctrlProveedor.buscar(idProveedor4));
            
            ctrlProveedor.eliminar(idProveedor4);
        
        
        
        
        
        }
        catch(ParseException pe){
             pe.printStackTrace();
            
        
        }
        
        
        
        
        
    }
    
}
