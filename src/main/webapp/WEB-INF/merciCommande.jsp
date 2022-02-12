
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- Ajouter l'entete -->
<jsp:include page="entete.jsp" />

<div class="container">
	<h2 class="text-center mb-3">Recapitulatif De la Commande</h2>
	<div class="mx-auto">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Articles</th>
					<th scope="col">Prix</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>${burgerCommande.name}</td>
					<td>${burgerCommande.prix}&euro;</td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td>${accompagnementCommande.name}</td>
					<td>${accompagnementCommande.prix}&euro;</td>
				</tr>
				<tr>
					<th scope="row">3</th>
					<td>${boissonCommande.name}</td>
					<td>${boissonCommande.prix}&euro;</td>
				</tr>
				<tr>
					<th scope="row">3</th>
					<td><b>Total a régler &nbsp;:</b></td>
					<td><b>${coutTotatl}&euro;</b></td>
				</tr>
			</tbody>
		</table>

	</div>
</div>
</body>
</html>