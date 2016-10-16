function submitform(formName, actionName) {
	var form = document.forms[formName];
	form.action = actionName;
	form.submit();
}