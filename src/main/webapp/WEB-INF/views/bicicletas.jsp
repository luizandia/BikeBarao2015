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
      <div class="side-menu" style="height: 1000px;">
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
            <th>CNPJ Fornecedor</th>
            <th>Estação</th>
            <th>Num Alugueis</th>
          </tr>
          <c:forEach var="bike" items="${bicicletas}">
	          <tr>
	          	<td>${bike.id}</td>
	            <td>${bike.tamanho}</td>
	            <td>${bike.modelo}</td>
	            <td>${bike.estado}</td>
	            <td>${bike.ativo}</td>
	            <td>${bike.fornecedor.cnpj}</td>
	            <td>${bike.estacao.id}</td>
	            <td>${bike.numAlugueis}</td>
	          </tr>
		  </c:forEach>
        </table>
      </div>
      <%--
      <div class="content-wrapper">
        <table>
          <tr>
            <th>ID</th>
            <th>Tamanho</th>
            <th>Modelo</th>
            <th>Estado</th>
            <th>Ativa</th>
            <th>CNPJ Fornecedor</th>
            <th>Estação</th>
          </tr>
          <c:forEach var="bike" items="${bicicletasConserto}">
	          <tr>
	          	<td>${bike.id}</td>
	            <td>${bike.tamanho}</td>
	            <td>${bike.modelo}</td>
	            <td>${bike.estado}</td>
	            <td>${bike.ativo}</td>
	            <td>${bike.fornecedor.cnpj}</td>
	            <td>${bike.estacao.id}</td>
	          </tr>
		  </c:forEach>
        </table>
      </div>
       --%>
    </div>
  </body>
</html>