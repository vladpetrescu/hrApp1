<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:form action="user.htm?actionType=login">
	<fieldset style="width: 280px;">
		<label for="username"><bean:message key="login.username"/></label>
		<html:text property="username" styleId="username"/>
		<label for="password"><bean:message key="login.password"/></label>
		<html:password property="password" styleId="password"/>
		
		<html:submit/>
	</fieldset>
</html:form>


<logic:iterate name="userList" id="user">
	<bean:write name="user" property="id"/>
	<bean:write name="user" property="username"/>
	<bean:write name="user" property="password"/>
</logic:iterate>