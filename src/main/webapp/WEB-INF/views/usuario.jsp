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
       	<li><a href="/BikeBarao/usuarios">Usuários</a></li>
        <li><a href="/BikeBarao/bicicletas">Bicicletas</a></li>
        <li><a href="/BikeBarao/estacoes">Estações</a></li>
        <li><a href="/BikeBarao/fornecedores">Fornecedores</a></li>
        <li><a href="/BikeBarao/alugueis">Aluguéis</a></li>
      </ul>
    </div>
    <div class="body-wrapper">
      <div class="side-menu" style="height: 700px;">
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
	       	<tr>
	        	<td>${user.cpf}</td>
	          	<td>${user.nome}</td>
	          	<td>${user.data_nascimento}</td>
	         	<td>${user.cartao.numero}</td>
	       	</tr>
        </table>
      </div>
      <div class="content-wrapper">
      	<h3>Alugueis deste usuário</h3>
        <table>
          <tr>
            <th>ID</th>
            <th>Id Bicicleta</th>
            <th>Nome Usuario</th>
            <th>Data Inicio</th>
            <th>Data Fim</th>
            <th>Num Estacao Inicio</th>
            <th>Num Estacao Fim</th>
          </tr>
          <c:forEach var="aluguel" items="${alugueis}">
	          <tr>
	          	<td>${aluguel.id}</td>
	            <td>${aluguel.bicicleta.id}</td>
	            <td>${aluguel.usuario.nome}</td>
	            <td>${aluguel.data_inicio}</td>
	            <td>${aluguel.data_fim}</td>
	            <td>${aluguel.estacaoInicio.id}</td>
	            <td>${aluguel.estacaoFim.id}</td>
	          </tr>
		  </c:forEach>
        </table>
      </div>
    </div>
  </body>
</html>