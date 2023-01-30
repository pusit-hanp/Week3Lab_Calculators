<%-- 
    Document   : agecalculator
    Created on : Jan 29, 2023, 5:49:36 PM
    Author     : pusit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age:<input type="text" name="age" value=${age}><br>
            <input type="submit" value="Age next birthday"><br>
            ${message}
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
