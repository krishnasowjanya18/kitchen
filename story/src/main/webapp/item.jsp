<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<title>View items</title>
</head>
<body>
	<h2>items list</h2>
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>Name</th>
				<th>price</th>
				<th>quantity</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="itemValue" items="${itemsList}">
				<tr>
					<td>${itemValue.id}</td>
					<td>${itemValue.itemName}</td>
					<td>${itemValue.price}</td>
					<td>${itemValue.quantity}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>