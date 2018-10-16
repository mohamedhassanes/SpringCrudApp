<%-- 
    Document   : add_student
    Created on : Oct 3, 2018, 9:37:36 AM
    Author     : mohamed_es
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css"/>
    </head>
    <body>
        <h1 align="center">Hello from Adding New Student</h1>
        
        
        <form:form action="access_adding" method="post" commandName="student">

            <table>
            <tr>
            <td> <label for="std_name">Student Name:</label> </td>
            <td> <form:input cssClass="myinput"  id="std_name" path="studentName"/> </td>
          </tr>
            
          <tr>
          <td>  <label for="std_age">Student Age:</label></td>
          <td>  <form:input cssClass="myinput" id="std_age" path="studentAge"/></td>
          </tr>
            
          
          <tr>
           <td> <label for="std_phone">Student Phone:</label></td>
           <td> <form:input cssClass="myinput" id="std_phone" path="studentPhone"/></td>
           </tr>
           
           <tr> 
           <td> <label for="std_address">Student Address:</label></td>
           <td> <form:input cssClass="myinput" id="std_address" path="studentAddress"/></td>
          </tr>
          
          <tr></tr>
          
          <tr>
              <td></td>
              
              <td>
                  <input class="button" type="submit" value="Save"/>
              </td>
          </tr>
          
           </table>
            
          
           <a href="${pageContext.request.contextPath}/student/all">Back to List</a>
          
            
        </form:form>
        
    </body>
</html>
