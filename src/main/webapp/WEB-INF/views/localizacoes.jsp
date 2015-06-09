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
     	<li><a href="BikeBarao/usuarios">Usuários</a></li>
        <li><a href="BikeBarao/bicicletas">Bicicletas</a></li>
        <li><a href="BikeBarao/estacoes">Estações</a></li>
        <li><a href="BikeBarao/fornecedores">Fornecedores</a></li>
        <li><a href="BikeBarao/alugueis">Aluguéis</a></li>
      </ul>
    </div>
    <div class="body-wrapper">
      <div class="content-wrapper">
        <table>
          <tr>
            <th>CEP</th>
            <th>Rua</th>
            <th>Bairro</th>
            <th>Cidade</th>
          </tr>
          <c:forEach var="loc" items="${localizacoes}">
          	<tr>
	          	<td>${loc.cep}</td>
	            <td>${loc.rua}</td>
	            <td>${loc.bairro}</td>
	            <td>${loc.cidade}</td>
          	</tr>
		  </c:forEach>
        </table>
      </div>
    </div>
  </body>
</html>