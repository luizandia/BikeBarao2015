<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC -HelloWorld</title>
</head>
<body>
	<center>
		<h2>Hello World</h2>
		<h2>
			${message} ${name}
		</h2>
	</center>
<%-- 	<h1>List of All Localizaoes</h1>
    <ul>
        <c:forEach var="l" items="${pizza}">
            <li>${l.cep} - ${p.rua} - ${p.bairro} - ${p.cidade}</li>
            
        </c:forEach>
    </ul> --%>
</body>
</html>