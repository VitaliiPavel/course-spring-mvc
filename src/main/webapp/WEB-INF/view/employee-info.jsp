<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Employee info</h2>
<br>
<form:form action="saveEmployee" modelAttribute="employee">
    <form:hidden path="id"/>

    name <form:input path="name"/>
    <br><br>
    surName <form:input path="surName"/>
    <br><br>
    department <form:input path="department"/>
    <br><br>
    salary <form:input path="salary"/>
    <br><br>
    <input type="submit" value="ok">
</form:form>


</body>
</html>
