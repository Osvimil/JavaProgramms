<%-- 
    Document   : consultar
    Created on : 13-mar-2017, 20:58:30
    Author     : oswaldosaldivar
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <table border="2" bordercolor="black" align="center">
            <c:forEach var="registros" items="${datos}">
                <tr>
                    <c:forEach var="variables" items="${registros}" >
                        <td>
                            ${variables}
                            
                        </td>
                    </c:forEach>
                </tr>
            </c:forEach>
            
        </table>
        <br>
                <br>
                <br>
                <a href="index.xhtml">Regresar</a>
    </center>
    </body>
</html>
