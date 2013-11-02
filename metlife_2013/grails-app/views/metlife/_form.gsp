<%@ page import="metlife.Metlife" %>



<div class="fieldcontain ${hasErrors(bean: metlifeInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="metlife.address.label" default="Address" />
		
	</label>
	<g:textField name="address" value="${metlifeInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: metlifeInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="metlife.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${metlifeInstance?.name}"/>
</div>

