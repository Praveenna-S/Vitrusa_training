<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      

     <h1>Add New Employee</h1>

           <form:form method="get" action="save">  

                      <table >  
                     <tr>  

                      <td>Name : </td> 
						<td><form:input path="name"/> </td>

                     </tr>
<tr>  

                      <td>Last Name : </td> 
						<td><form:input path="lastname"/> </td>

                     </tr>
<tr>  

                      <td>Email : </td> 
						<td><form:input path="emailId"/> </td>

                     </tr>  

                  

                      <td><input type="submit" value="Save" /></td>  


                    </table> 
  

       </form:form>
