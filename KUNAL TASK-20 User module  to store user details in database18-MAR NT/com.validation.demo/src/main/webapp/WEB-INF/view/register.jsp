<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <style type="text/css">
   .pt
   {
   color: red;
   position: fixed;
   text-align: left;
   margin-left: 20px;
   }
   
   .tx
   {
      position: fixed;
      margin-left: 30px;
   }
   </style>
</head>
<body>
    <form:form action="process-register" modelAttribute="reginfo">
      <p align="center">User Name : <form:input path="un" id="un"/>
                                    <form:errors path="un" id="un" cssClass="pt" />
      </p>
      <p align="center">User Pass:  <form:password path="ps" />
                                    <form:errors path="ps" cssClass="pt" />
      </p>
      <p align="center">Employee Name: <form:input path="empname" />
                                    <form:errors path="empname" cssClass="pt" />
      </p>
      <p align="center">Email:      <form:input path="email" />
                                    <form:errors path="email" cssClass="pt" />
      </p>
      <p align="center">Mobile:     <form:input path="mobile" />
                                    <form:errors path="mobile" cssClass="pt" />
      </p>
      <p align="center">City:       <form:input path="city" />
                                    <form:errors path="city" cssClass="pt" />
      </p>
      <p align="center">Age:        <form:input path="age" />
                                    <form:errors path="age" cssClass="pt" />
      </p>
      <p align="center">     <input type="submit" name="login" value="Register"> </p>
     </form:form>
</body>
</html>