<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>


<logic:iterate name="customersList" id="customer">
	<bean:write name="customer" property="id"/>
	<bean:write name="customer" property="username"/>
	<bean:write name="customer" property="password"/>
</logic:iterate>