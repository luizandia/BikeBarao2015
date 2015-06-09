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
          <li><a href="#">Listar CPF e Nome</a></li>
          <li><a href="#">Listar todas infos</a></li>
        </ul>
      </div>
      <div class="content-wrapper">
        <table>
          <tr>
            <th>CPF</th>
            <th>Nome</th>
            <th>Data Nasc.</th>
            <th>Número Cartão</th>
          </tr>
          <c:forEach var="user" items="${usuarios}">
          	<tr>
	          	<td>${user.cpf}</td>
	            <td>${user.nome}</td>
	            <td>${user.data_nascimento}</td>
	            <td>${user.cartao.numero}</td>
          	</tr>
		  </c:forEach>
        </table>
      </div>
    </div>
  </body>
</html>