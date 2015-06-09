<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
      <div class="side-menu">
        <ul>
          <li><a href="#">Listar Fornecedores</a></li>
        </ul>
      </div>
      <div class="content-wrapper">
        <table>
          <tr>
            <th>CNPJ</th>
            <th>Nome</th>
          </tr>
          <c:forEach var="forn" items="${fornecedores}">
          	<tr>
	          	<td>${forn.cnpj}</td>
	            <td>${forn.nome}</td>
          	</tr>
		  </c:forEach>
        </table>
      </div>
    </div>
  </body>
</html>