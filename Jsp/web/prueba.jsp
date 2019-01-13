<%-- 
    Document   : prueba
    Created on : 19-may-2016, 22:27:13
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
        <h1>Java Server Page</h1>
        <% int numero=9; %>
        <% int numero2=0;%>
        
        <% for(int i=0;i<numero;i++){ %>
        <p><%=i %></p>
        <% }%>
        
        <% for(int j=10;j>numero2;j--){%>
        <p><%=j %></p>
        
        <%}%>
        
        
    </body>
</html>
