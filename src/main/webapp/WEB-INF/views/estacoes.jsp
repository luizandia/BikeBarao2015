<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta charset="UTF-8">
    <title>BikeBarão - 2015</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body>
    <div class="title-wrapper">
      <a href="index.html">Bike<strong>Barão</strong></a>
    </div>
    <div class="top-menu">
      <ul>
     
        <li><a href="usuarios.html">Usuarios</a></li>
        <li><a href="bicicletas.html">Bicicletas</a></li>
        <li class="active">Estações</li>
        <li><a href="fornecedores.html">Fornecedores</a></li>
        <li><a href="alugueis.html">Aluguéis</a></li>
      </ul>
    </div>
    <div class="body-wrapper">
      <div class="side-menu">
        <ul>
          <li><a href="#">Estações</a></li>
          <li><a href="#">Estações c/ bicicletas quebradas</a></li>
        </ul>
      </div>
      <div class="content-wrapper">
        <table>
          <tr>
            <th>ID</th>
            <th>Qtd</th>
            <th>Qtd Ocupada</th>
            <th>CEP</th>
            <th>Núm</th>
          </tr>
          <tr>
            <td>1</td>
            <td>30</td>
            <td>10</td>
            <td>14802-195</td>
            <td>3</td>
          </tr>
        </table>
      </div>
    </div>
  </body>
</html>