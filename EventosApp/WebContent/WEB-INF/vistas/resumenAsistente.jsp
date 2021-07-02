<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<main class="container mt-6">
	
	<div class="columns is-centered mb-6">
		<div class="column is-3">
			<form method="GET" action="ResumenAsistenteController.do">
				<label for="filtro-txt">filtrar por estado</label>
					<div class="control">
						<div class="select">
							<select name="filtro-txt">
								<option value=""> </option>
								<c:forEach items="registros" var="registros">
									<option value="${registros.estado}">${registros.estado}</option>
								</c:forEach>
							</select>
						</div>
					</div>
			</form>
		</div>
	</div>


	<div class="columns is-centered">
		<div class="column is-8">
			<table class="table is-hovered is-bordered is-fullwidth">
				<thead class="has-bakcground-primary">
					<tr>
						<th>Nombre completo</th>
						<th>Empresa</th>
						<th>Region</th>
						<th>Estado</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="registros" items="${registros}">
						<tr>
							<td>${registros.nombre} ${registros.apellido}</td>
							<td>${registros.empresa}</td>
							<td>${registros.region}</td>
							<td>${registros.estado}</td>
						</tr>
					</c:forEach>			
				</tbody>
			</table>
		</div>
	</div>
</main>
</body>
</html>