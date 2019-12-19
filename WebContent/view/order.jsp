<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body BGCOLOR = "#FDF5E6">
	Order.jsp
	<br>
	<table border="1">
	<tr BGCOLOR = "#FFAD00">
		<td>Parameter Name</td>
		<td>Parameter Value(s)</td>
	</tr>

	<tr>
		<td>cardNum</td>
		<td>${order.cardNum}</td>
	</tr>

	<tr>
		<td>cardType</td>
		<td>${order.cardType}</td>
	</tr>

	<tr>
		<td>price</td>
		<td>${order.price}</td>
	</tr>

	<tr>
		<td>initial</td>
		<td>${order.initial}</td>
	</tr>

	<tr>
		<td>itemNum</td>
		<td>${order.itemNum}</td>
	</tr>

	<tr>
		<td>address</td>
		<td>${order.address}</td>
	</tr>

	<tr>
		<td>firstName</td>
		<td>${order.firstName}</td>
	</tr>

	<tr>
		<td>description</td>
		<td>${order.description}</td>
	</tr>

	<tr>
		<td>lastName</td>
		<td>${order.lastName}</td>
	</tr>

</table>
</body>
</html>