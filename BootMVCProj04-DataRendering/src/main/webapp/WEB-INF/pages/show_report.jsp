<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- <h1 style="color:red;text-align:center">Reading simple Values</h1>
<b>name::${name}</b> <br>
<b>age::${age}</b> <br>
<b>address::${addrs}</b> <br>
 --%>
 
 
  <%-- 
 <h1 style="color:red;text-align:center">Reading Array,Collection Values</h1>

 <b> nick names :: </b>
       <c:forEach var="name" items="${nickNames}">
                    ${name} <br>   
       </c:forEach>

 <b> Phone number(set) :: </b>
       <c:forEach var="ph" items="${phonesinfo}">
                    ${ph} <br>   
       </c:forEach>
  
   <b> Course List(list) :: </b>
       <c:forEach var="courses" items="${coursesinfo}">
                    ${courses} <br>   
       </c:forEach>
   
   
    <b> ids info ( MAP ) :: </b>
       <c:forEach var="id" items="${idsinfo}">
                    ${id.key} ===> ${id.value} <br>   
       </c:forEach>
 --%>       
 
 <h1 style="color:red;text-align:center">Reading List Of Model Objects </h1>
 <table border="1" align="center">
       <tr>
         <th>eno</th> <th>ename</th><th>desg</th><th>salary</th>
       </tr>
 </table>
 <c:forEach var="emp" items="${empsinfo}">
  <br>
         <tr>
            <td>${emp.eno}</td>
            <td>${emp.ename}</td> 
            <td>${emp.desg}</td>  
            <td>${emp.salary}</td>  
            <br>       
         </tr>
 </c:forEach>
  