<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<script type="text/javascript">
function checkForm(){
	var form = document.order;
	if(form.cardNumber.value != form.cardNumber2.value){
		alert("카드번호를 확인해주세요.");
		form.cardNumber2.select();
		return;
	}
	form.submit();
}

</script>


<body BGCOLOR = "#FDF5E6">
<form name="order" action="/hw1/doOrder" method="post">

		Item Number: <input type="text" name="itemNumber"> <br>
		Description: <input type="text" name="description"> <br>
		Price Each: <input type="text" name="price">
		<hr>
		First Name: <input type="text" name="firstName"> <br>
		Last Name: <input type="text" name="lastName"> <br>
		Middle Initial: <input type="text" name="middleInitial"> <br>
		Shipping Address:
		<textarea name="shippingAddress"></textarea>
		<br> 
		Credit Card:<br> 
		<input type="radio" name="creditCard"
			value="Visa" checked>Visa<br> <input type="radio"
			name="creditCard" value="MasterCard">MasterCard<br> <input
			type="radio" name="creditCard" value="American Express">American
		Express<br> <input type="radio" name="creditCard"
			value="Discover">Discover<br> <input type="radio"
			name="creditCard" value="Java SmartCard">Java SmartCard<br>
			
		Credit Card Number: <input type="password" name="cardNumber"><br> 
		Repeat Credit Card Number: <input type="password" name="cardNumber2"> <br> 
		<%-- 
		<input type="submit" value="Submit Order">
	 	--%>
		<input type="button" value="Submit Order" onclick = checkForm()>
	
</body>
</html>