<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
	<main class="container mt-6">
		<div class="columns is-centered">
			<div class="column is-6">
				<form method="POST" action="">
					<div class="card">
						<div class="card-header has-background-primary">
							<span class="card-header-title">Ingrese Datos</span>
						</div>
						<div class="card-content">
							<div class="field">
								<label class="label" for="rut-txt">RUT Cliente</label>
								<div class="control">
									<input type="text" class="input" is="rut-txt" name="rut-txt"
										placeholder="xxxxxxxx-x" />
								</div>
							</div>
							<div class="field">
								<label class="label" for="nombre-txt">Nombre</label>
								<div class="control">
									<input type="text" class="input" is="nombre-txt"
										name="nombre-txt" placeholder="Nombre" />
								</div>
							</div>
							<div class="field">
								<label class="label" for="apellido-txt">Apellido</label>
								<div class="control">
									<input type="text" class="input" is="apellido-txt"
										name="apellido-txt" placeholder="Apellido" />
								</div>
							</div>
							<div class="field">
								<label class="label" for="edad-txt">Edad</label>
								<div class="control">
									<input type="text" class="input" is="edad-txt"
										name="edad-txt"/>
								</div>
							</div>
							<div class="field">
								<label class="label" for="empresa-txt">Empresa</label>
								<div class="control">
									<input type="text" class="input" is="empresa-txt"
										name="empresa-txt" />
								</div>
							<div class="field">
								<label class="label" for="estado-select">Estado</label>
								<div class="control">
									<div class="select">
										<select name="estado-select" id="estado-select">
											<option>Pagada</option>
											<option>Con deuda</option>
										</select>
									</div>
								</div>
							</div>
							<div class="field">
								<label class="label" for="region-select">Region</label>
								<div class="control">
									<div class="select">
										<select name="region-select" id="region-select">
											<option>Valparaiso</option>
											<option>Santiago</option>
											<option>Norte de chile</option>
											<option>Sur de chile</option>
											<option>internacional</option>
										</select>
									</div>
								</div>
							</div>
						</div>
					</div>
				  </div>
				</form>
				<div class="card">
					<form method="GET" action="">
						<div class="card-content has-text-centered">
							<div class="card-footer-item">
								<button type="submit" name="ingresar"
									class="button has-background-primary">Ingresar</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
</main>
</body>
</html>