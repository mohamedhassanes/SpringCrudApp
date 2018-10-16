<%-- 
    Document   : all_students
    Created on : Oct 2, 2018, 6:58:10 PM
    Author     : mohamed_es
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css"/>
        
    </head>
    <body>
        <h1 align="center">Hello from All Students</h1>
        
        
        
        <a class="add_link" href="${pageContext.request.contextPath}/student/add">Add New Student</a> 
        
        <br/><br/>
        
        <table class="all" border="1">
            
            <thead>
                <th>Id</th>
                <th>Name</th>
                <th>Age</th>
                <th>Phone</th>
                <th>Address</th>
                <th colspan="2">Action</th>
            </thead>
            
            <tbody>
                
                <c:forEach items="${students}" var="student">
                
                    <tr class="all">
                        <td>${student.studentId}</td>
                        <td>${student.studentName}</td>
                        <td>${student.studentAge}</td>
                        <td>${student.studentPhone}</td>
                        <td>${student.studentAddress}</td>
                        
                        <td><a href="${pageContext.request.contextPath}/student/update/${student.studentId}">Update</a></td>
                        <td><a href="${pageContext.request.contextPath}/student/delete/${student.studentId}">Delete</a></td>
                        
                        
                        
                        
                    </tr>
                
            </c:forEach>
                
            </tbody>
        </table>
        
        
        
        
    </body>
</html>
