
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- Ajouter l'entete -->
<jsp:include page="entete.jsp" />

<div class="container mx-auto">
	<div class="row justify-content-md-center">
		<div class="col-md-auto">
			<h2 class="text-center">Commande de restauration rapide</h2>
			<form method="POST" action="commande" class="d-flex flex-column">
				<div id="lieuDeMangerWrapper" class="mb-3 text-center">
					<input type="radio" name="lieuDeManger" value="Sur Place" />
					&nbsp;Sur Place <input type="radio" name="lieuDeManger"
						value="A emporter" /> &nbsp;A emporter
				</div>

				<div class="d-flex flex-column justify-content-center jumbotron">
					<div class="d-flex flex-row">
						<div id="burgerWrapper" class="mb-3 mr-2">
							<label for="votre-burger" class="mr-2">Votre Burger</label> <select
								name="votre_burger" id="votre-burger">
								<c:forEach var="burgerLists" items="${burgerLists}">
									<option value="${burgerLists.id}">${burgerLists.name}</option>
								</c:forEach>
							</select>
						</div>

						<div id="accompagnementWrapper" class="mb-3">
							<label for="votre-accompagnement" class="mr-2">Votre
								Accompagnement</label> <select name="votre_accompagnement"
								id="votre-accompagnement">
								<c:forEach var="accompagnementLists"
									items="${accompagnementLists}">
									<option value="${accompagnementLists.id}">
										${accompagnementLists.name}</option>
								</c:forEach>
							</select>
						</div>
					</div>

					<div id="boissonWrapper" class="mb-3">
						<label for="votre-boisson" class="mr-2">Votre Boisson</label> <select
							name="votre_boisson" id="votre-boisson">
							<c:forEach var="boissonLists" items="${boissonLists}">
								<option value="${boissonLists.id}">${boissonLists.name}</option>
							</c:forEach>
						</select>
					</div>

				</div>

				<div class="d-flex flex-column align-items-center">
					<div id="remarquesWrapper" class="mb-3">
						<label for="remarques" class="mr-2">Remarques sur votre
							commande:</label><br />
						<textarea id="remarques" name="remargues" rows="5" cols="33"></textarea>
					</div>

					<div id="sauceWrapper" class="mb-3">
						<label> Sauce(s) </label>
						<c:forEach var="sauceLists" items="${sauceLists}">
							<input type="checkbox" name="saucedisponible"
								value="${sauceLists.name}" /> &nbsp;${sauceLists.name} 
				    </c:forEach>
					</div>
				</div>
				<div class="d-flex flex-column justify-content-center jumbotron">
					<div class="mb-3">
						<label for="numeroCB" class="mr-2">Numéro CB</label> <input
							type="text" name="numeroCB" id="numeroCB" />
					</div>
					<div class="d-flex flex-row justify-content-center">
						<div id="moisWrapper" class="mb-3 mr-2">
							<label for="mois" class="mr-2">Mois</label> <select name="mois"
								id="mois">
								<c:forEach var="mois" items="${mois}">
									<option value="${mois}">${mois}</option>
								</c:forEach>
							</select>
						</div>

						<div id="anneeWrapper">
							<label for="annee" class="mr-2">Annee</label> <select
								name="annee" id="annee">
								<c:forEach var="annee" items="${annees}">
									<option value="${annee}">${annee}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div id="cryptogrammeWrapper" class="mb-3">
						<label for="cryptogramme" class="mr-2">Cryptogramme</label> <input
							type="text" name="cryptogramme" id="cryptogramme" />
					</div>
				</div>

				<div class="text-center">
					<input type="submit" value="Commander" class="btn btn-success" />
				</div>
			</form>
		</div>

	</div>

</div>
</body>
</html>