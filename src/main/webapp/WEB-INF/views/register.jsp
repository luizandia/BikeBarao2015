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
    <div class="body-wrapper">
      <strong>Criar a conta</strong> <br/>
      <div class="link-wrapper">
        <form action="register.html" method="post">
          <label for="user-id">Nome de Usuário: </label>
          <input type="text" value="" placeholder="Nome de Usuário" id="user-id"><br/>
          <label for="user-birth">Data de aniversário: </label>
          <input type="text" value="" placeholder="XX/XX/XXXX" id="user-birth"><br/>
          <input type="submit" class="btn-submit" value="Enviar">
        </form>
      </div>
    </div>
  </body>
</html>


Listar Todas Estações


Estações
Usuários
Fornecedores
Bicicletas
Aluguéis