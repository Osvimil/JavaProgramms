<%-- 
    Document   : agregar
    Created on : 13-mar-2017, 20:52:47
    Author     : oswaldosaldivar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <center>
        <form action="AgregarServlet" method="post">
            <center>
                <table align="center">
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" nombre="nombre"></td>
                    </tr>
                    
                    <tr>
                        <td>Apellidos</td>
                        <td><input type="text" nombre="apellidos"></td>
                    </tr>
                    
                    <tr>
                        <td></td>
                        <td><input type="submit" value="guardar"></td>
                    </tr>
                    
                </table>
                <br>
                <br>
                <br>
                <a href="index.jsp">Regresar</a>
                    
            </center>
                
            
        </form>
    </center>
    </body>
</html>
