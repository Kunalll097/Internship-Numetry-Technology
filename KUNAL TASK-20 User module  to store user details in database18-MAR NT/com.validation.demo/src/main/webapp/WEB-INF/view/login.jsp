<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
  .bt
  {
    color: red;
    position: fixed;
    text-align: left;
    margin-left: 20px;
  }
</style>
</head>
<body>
   <form:form action="process-menu" modelAttribute="userinfo">
   
      <p align="center">User Name : <form:input path="un" id="un"/>
                                    <form:errors path="un" id="un" cssClass="bt" />
      </p>
      <p align="center">User Pass:  <form:password path="ps" />
                                    <form:errors path="ps" cssClass="bt" />
      </p>
              <p align="center">    <input type="submit" name="login" value="Login" >
                                    <a href="showregister">Register</a>
      </p>
           
       <p align="center">Terms & Conditions :       <form:checkbox path="TermsandConditions"/>  
                                                    <form:errors path="TermsandConditions" cssClass="bt"/>
       </p>
   </form:form>
</body>
</html>