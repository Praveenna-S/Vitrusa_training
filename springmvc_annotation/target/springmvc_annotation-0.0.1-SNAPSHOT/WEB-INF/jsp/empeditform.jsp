<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
 
    .error{
    color:red
    }
</style>
  <form:form method="POST" action="${pageContext.request.contextPath}/editsummaryValidation"
    modelAttribute="command">

<form:errors path="*" cssClass="error" element="div"/>

<table >  
<tr>
<td></td>  
<td><form:hidden  path="id" /></td>
</tr> 
<tr>  
<td>Name : </td> 
<td><form:input path="name"  />
<form:errors path="name" cssClass="error" element="div"/>

</td>
</tr>  
<tr>  
<td>Email Id :</td>  
<td><form:input path="emailId" /></td>
</tr> 
<tr>  
<td>Last Name :</td>  
<td><form:input path="lastName" />
<form:errors path="lastName" cssClass="error" element="div"/>
</td>
</tr> 
<tr>  
<td>Expeience Level :</td>  
<td>
<form:select id="expLevel" path="selectExperienceLevel"
                        items="${expLevelList}" size="5"
                        cssStyle="font-family:monospace" >
</form:select>
</td>
</tr> 

<tr>  
<td> </td>  
<td><input type="submit" value="Edit Save" /></td>  
</tr>  
</table>  



</form:form>
 
 
</body>
</html>