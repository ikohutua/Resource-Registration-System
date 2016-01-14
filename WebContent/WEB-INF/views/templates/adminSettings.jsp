<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="base"
	value="${fn:substring(url, 0, fn:length(url) - fn:length(req.requestURI))}${req.contextPath}/" />

<div class="container">
	<h4>
		<spring:message code="label.admin.settings.method" />
	</h4>
	<p>Виберіть одну з опцій:</p>
	<form:form id="сhangeReg" method="post" modelAttribute="param"
		action="settings">
		<div class="radio">
			<label><input type="radio" name="optradio" value="personal"
				required>Особиста реєстрація</label>
		</div>
		<div class="radio">
			<label><input type="radio" name="optradio" value="manual">Реєстрація
				нового користувача здійснюється виключно реєстратором</label>
		</div>
		<div class="radio">
			<label><input type="radio" name="optradio" value="mixed">Обидва
				способи реєстрації доступні</label>
		</div>
		<input type="submit" id="confirmRegistrationMethod"
			value="Підтвердити" class="btn btn-success" />
	</form:form>
</div>
<script>
$(document).ready(
		function() {
			$("#confirmRegistrationMethod").click(function() {
				alert("Метод реєстрації буде змінено на вибраний вами");
			});
});
</script>