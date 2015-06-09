<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta charset="UTF-8">
    <title>BikeBarão - 2015</title>
    <link rel="stylesheet" type="text/css" href="/BikeBarao/resources/style.css">
  </head>
  <body>
    <div class="title-wrapper">
      <a href="index.html">Bike<strong>Barão</strong></a>
    </div>
    <div class="top-menu">
      <ul>
     
        <li><a href="usuarios.html">Usuarios</a></li>
        <li><a href="bicicletas.html">Bicicletas</a></li>
        <li><a href="estacoes.html">Estações</a></li>
        <li><a href="fornecedores.html">Fornecedores</a></li>
        <li><a href="alugueis.html">Aluguéis</a></li>
      </ul>
    </div>
    <div class="body-wrapper">
      <div class="side-menu">
        <ul>
          <li><a href="#">Listar bicicletas</a></li>
          <li><a href="#">Listar bicicletas quebradas</a></li>
        </ul>
      </div>
      <div class="content-wrapper">
        <table>
          <tr>
            <th>ID</th>
            <th>Tamanho</th>
            <th>Modelo</th>
            <th>Estado</th>
            <th>Ativa</th>
            <th>CNPJ Forn</th>
            <th>Estação</th>
          </tr>
          <tr>
            <td>1</td>
            <td>Pequena</td>
            <td>Caloi</td>
            <td>Funcionando</td>
            <td>Ativa</td>
            <td>8.394.320-2</td>
            <td>3</td>
          </tr>
          <tr>
            <td>2</td>
            <td>Grande</td>
            <td>Caloi</td>
            <td>Funcionando</td>
            <td>Ativa</td>
            <td>8.394.320-2</td>
            <td>3</td>
          </tr>
          <tr>
          <c:forEach var="bike" items="${bicicletas}">
          	<td>${bike.id}</td>
            <td>${bike.tamanho}</td>
            <td>${bike.modelo}</td>
            <td>${bike.estado}</td>
            <td>${bike.ativo}</td>
            <td>${bike.fornecedor.id}</td>
            <td>${bike.estacao.id}</td>
		  </c:forEach>
          </tr>
        </table>
      </div>
    </div>
  </body>
</html>