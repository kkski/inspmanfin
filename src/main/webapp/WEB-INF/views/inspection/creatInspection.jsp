<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--@elvariable id="inspection" type="com.example.inspmanfin.domain.Inspection"--%>
<form:form action="/inspection/form" method="post" modelAttribute="inspection">
    <form:hidden path="id"/>
    <form:label path="dateOfInspection">Data inspekcji:</form:label>
    <form:input path="dateOfInspection"/>
    <form:errors path="dateOfInspection" cssClass="error" element="div"/>
    <form:label path="inspectionMessage">Notatka inspekcji:</form:label>
    <form:input path="inspectionMessage"/>
    <form:errors path="inspectionMessage" cssClass="error" element="div"/>
    <form:label path="approved">Zatwierdzono:</form:label>
    <form:input path="approved"/>
    <form:errors path="approved" cssClass="error" element="div"/>


    <input type="submit"/>
</form:form>
