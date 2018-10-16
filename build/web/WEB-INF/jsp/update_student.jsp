<%-- 
    Document   : update_student
    Created on : Oct 4, 2018, 3:59:06 PM
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
        <h1>Hello World! From Update Student</h1>
        
        <form:form action="${pageContext.request.contextPath}/student/update" method="post" commandName="student">
            
            
            <form:hidden  path="studentId"/>
          <br/>
          
          <table>
          
             <tr>
                 <td> <label for="std_name">Student Name:</label></td>
           <td> <form:input cssClass="myinput" id="std_name" path="studentName"/></td>
            </tr>
            
           <tr>
            <td><label for="std_age">Student Age:</label></td>
           <td> <form:input cssClass="myinput" id="std_age" path="studentAge"/></td>
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
                <td> <input class="button" type="submit" value="Update"/> </td>
           </tr>
          
            
            </table>
            
        </form:form>
        
    </body>
</html>
