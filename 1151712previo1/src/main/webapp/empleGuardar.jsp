<%-- 
    Document   : empleGuardar
    Created on : 19 abr. 2022, 9:40:20
    Author     : ANDRU
--%>

<%@page import="com.previo.imc.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="negocio" class="com.previo.imcfundacion.NegocioFundacion"
            scope="session"></jsp:useBean>
<!DOCTYPE html>
<%  
    String nombre = request.getParameter("nombre");
    String cargo = request.getParameter("cargo");
    String edad = request.getParameter("edad");
    String peso = request.getParameter("peso");
    String altura = request.getParameter("estatura");
   
   Empleado empleado = new Empleado(nombre, cargo, edad, peso, altura);
   

   String msg = negocio.guardarEmpleado(empleado);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleado</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body>
         <div class="card text-center">
            <div class="card-header">
                <h1>Guardar Usuario</h1>
            </div>
            <div class="card-body">
                
               
                <div class="alert alert-success">
                    <%= msg %>
                </div>
                
            <div class="table-responsive">
                <table class="table table-bordered">
                    <tr>
                        <td>Nombre </td>
                        <td><%= empleado.getNombre()  + " " + empleado.getCargo() %></td>
                    </tr>
                    
                    <tr>
                        <td>Peso </td>
                        <td><%= empleado.getPeso()%></td>
                    </tr>
                    
                    <tr>
                        <td>Estatura </td>
                        <td><%= empleado.getAltura() %></td>
                    </tr>
                    
                    <tr>
                        <td>IMC </td>
                        <td><%= empleado.getImc() %></td>
                    </tr>
                </table>
                
            </div>
            </div>
            <div class="card-footer text-muted">
               <input type="button" value="Ir a inicio"
                       onclick="location.href='index.html'"
                       class="btn btn-success"/> 
            </div>
        </div>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
