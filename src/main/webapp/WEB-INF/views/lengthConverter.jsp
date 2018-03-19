<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="/convert">Length Converter</a>
			</div>
		</div>
	</nav>

	<div class="container">
		<div>
			<form:form method="post" modelAttribute="converterForm"
				action="convert">
				<table>
					<tr>
						<td align="right"><form:input path="kilometers" value="${kilometers}" /></td>
						<td align="left">Kilometers</td>
					</tr>
					<tr>
						<td align="right"><form:input path="convertedValue" value="${convertedValue}" /></td>
						<td align="left">
							<select name="units" id="units">
								<c:forEach items="${converterForm.dropdown}" var="unitId">
									<option value="${unitId}"
										${unitId == converterForm.units ? 'selected' : ''}>${unitId}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td><input type="submit" value="Submit" /></td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>
	<br />
	<br />

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js">
	</script>

</body>

</html>