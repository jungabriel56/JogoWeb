<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Palavra:</p>
	<pre>${forca.palavraFechada}</pre>
	<form action="ForcaProcessa" method="post" >
		Letra: <input type="text" name="letra"/>
		<input type="submit" value="ok"/>
		
	</form>
	<p> <img src="${forca.erros}.png" /></p>
</body>
</html>