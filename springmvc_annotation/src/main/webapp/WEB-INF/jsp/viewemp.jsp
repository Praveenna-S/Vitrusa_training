<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      



     <h1> Employee List</h1>
	

<table border="2" width="70%" cellpadding="2">

<tr>
<th>Id</th>
<th>Name</th>
<th>LastName</th>
<th>Email Id</th>

<th>Edit</th>
<th>Delete</th>
</tr>


<c:forEach var="emp" items="${list}"> 
<tr><td>${emp.id }</td>
<td id="name">${emp.name}</td>
<td>${emp.lastname}</td>
<td>${emp.emailId}</td>
</tr>
</c:forEach>
</table>