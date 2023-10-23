<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	#conteudo{
	width: 80%;
	height: 500px;
	background-color: darkgreen;
	margin: auto;
	}
	
	#topo{
	width: 80%;
	margin: auto;
	height: 150px;
	border: 1px solid yellow;
	}
	
	#meio{
	width:50%;
	margin:auto;
	height: 150px;
	border: 1px solid red;
	margin-top: 10px;
	display:flex;
	justify-content:center;
	align-items:center;
	}
	
	#rodape{
	width:80%;
	margin: auto;
	height: 150px;
	border: 1px solid yellow;
	margin-top: 10px;
	}
	
</style>
</head>
<body>
	<div id="conteudo">
		<div id="topo"	></div>
		<div id="meio"	>
			<a href="ViraCarta"><img src="img/b2fv.png"/></a>
		</div>
		<div id="rodape">
			<img  src="img/${carta.imagem}">
		</div>
	</div>
</body>
</html>