<%-- 
    Document   : index
    Created on : 12/07/2015, 01:06:00 PM
    Author     : alumno
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Programa</h1>
        <form action="${pageContext.request.contextPath}/programa/guardar" method="post">
            <input type="hidden" name="id" value="${programa.id}" />
            
            Nombre: <input type="text" name="nombre" value="${programa.nombre}" />
            <br/>
            Código: <input type="text" name="codigo" value="${programa.codigo}" />
            <br/>
            Descripción: <textarea cols="12" rows="3" name="descripcion">${programa.descripcion} </textarea>
            <br/>
            <input type="submit" value="Guardar" />
        </form>       
        
        <hr>
        <table>
            <tr>
                <td>Codigo</td>
                <td>Nombre</td>
                <td>Descripción</td>
            </tr>
            <c:forEach items="${programas}" var="p" varStatus="i">
            <tr>
                <td>${p.nombre}</td>
                <td>${p.codigo}</td>
                <td>${p.descripcion}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/programa/editar?id=${p.id}" >Editar</a>
                    <a href="${pageContext.request.contextPath}/programa/eliminar?id=${p.id}" >Eliminar</a>
                </td>
            </tr>
            </c:forEach>
        </table> 
    </body>
</html>
