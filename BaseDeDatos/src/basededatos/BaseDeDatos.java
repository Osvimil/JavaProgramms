
package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;


public class BaseDeDatos {

    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        
        String url = "jdbc:derby://localhost:1527/Seminario";
        String usuario = "seminario";
        String password = "seminario1";
        
        Connection c = null;
        Statement s = null;
        ResultSet rs = null;
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            c = DriverManager.getConnection(url, usuario, password);
            s = c.createStatement();
            s.executeUpdate("CREATE TABLE alumno(boleta INTEGER PRIMARY KEY,"
                    + "nombre VARCHAR(30) NOT NULL,"
                    + "fecha_nacimiento DATE NOT NULL)");
            System.out.println("Tabla creada");
            
            //s.executeUpdate("INSERT INTO alumno VALUES(20126090,'Oswaldo',{d'1993-03-26'})");
            s.executeUpdate("INSERT INTO alumno VALUES (2012,'Alfonso',{d '1991-06-14'})");
            s.executeUpdate("INSERT INTO alumno VALUES (2010,'Oswaldo',{d '1993-03-17'})");
            s.executeUpdate("INSERT INTO alumno VALUES (2009,'Guadalupe',{d '1958-03-06'})");
            s.executeUpdate("INSERT INTO alumno VALUES (2007,'Paps',{d '2015-12-09'})");
            s.executeUpdate("INSERT INTO alumno VALUES (2006,'Bertha',{d '1932-12-17'})");
            s.executeUpdate("INSERT INTO alumno VALUES (2005,'Marcelino',{d '1930-04-30'})");
            
            
            
            
            rs = s.executeQuery("SELECT * FROM alumno");
            while(rs.next()){
                System.out.println(rs.getInt("boleta")+"--"+rs.getString("nombre")+"--"+fmt.format(rs.getDate("fecha_nacimiento")));
                System.out.println("");
            
            }
            
        } finally {
          if(c!=null){
              try{
                  c.close();
              }catch(SQLException e){
                  e.getMessage();
              
              }
          }
          
          if(s!=null){
              try{
                  s.close();
              }catch(SQLException e){
                  e.getMessage();
              
              }
          }
          
          if(rs!=null){
              try{
                  s.close();
              }catch(SQLException e){
                  e.getMessage();
              
              }
          }
        }
        
        
        
        
        
    }
    
}
