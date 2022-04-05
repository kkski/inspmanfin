<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--@elvariable id="inspector" type="pl.coderslab.persistence.entities.Inspector"--%>



<spring:message code="app.title"/>
//<h3><spring:message code="hello.message" arguments="${inspector.firstName}"/></h3>



<form:form action="/inspector/form" method="post" modelAttribute="inspector">
  <form:hidden path="id"/>
  <form:label path="firstName">Imię inspektora:</form:label>
  <form:input path="firstName"/>
  <form:errors path="firstName" cssClass="error" element="div"/>
  <form:label path="lastName">Imię inspektora:</form:label>
  <form:input path="lastName"/>
  <form:errors path="lastName" cssClass="error" element="div"/>
  <form:label path="email">Email:</form:label>
  <form:input path="email"/>
  <form:errors path="email" cssClass="error" element="div"/>
  <form:input path="password" type="password"/>
  <form:errors path="password" cssClass="error" element="div"/>

  <input type="submit"/>
</form:form>
