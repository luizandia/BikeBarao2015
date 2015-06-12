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
       	<li><a href="usuarios">Usuários</a></li>
        <li><a href="bicicletas">Bicicletas</a></li>
        <li><a href="estacoes">Estações</a></li>
        <li><a href="fornecedores">Fornecedores</a></li>
        <li><a href="alugueis">Aluguéis</a></li>
      </ul>
    </div>
    <div class="body-wrapper">
      <div class="side-menu" style="height: 700px;">
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
            <th>Num</th>
          </tr>
           <c:forEach var="est" items="${estacoes}">
          	<tr>
	          	<td>${est.id}</td>
	            <td>${est.qtd_armazenamento}</td>
	            <td>${est.qtd_ocupada}</td>
	            <td>${est.localizacao.cep}</td>
	            <td>${est.num}</td>
          	</tr>
		  </c:forEach>
        </table>
      </div>
      <div class="content-wrapper">
      	<h3>Estações c/ bicicletas quebradas</h3>
        <table>
          <tr>
            <th>ID</th>
          </tr>
           <c:forEach var="est" items="${estacoesDefeito}">
          	<tr>
	          	<td>${est.id}</td>
          	</tr>
		  </c:forEach>
        </table>
      </div>
    </div>
  </body>
</html>