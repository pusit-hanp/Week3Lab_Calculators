<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 29, 2023, 6:34:06 PM
    Author     : pusit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value=${first}><br>
            Second: <input type="text" name="second" value=${second}><br>
            <input type ="submit" value ="+" name = "operation">
            <input type ="submit" value ="-" name = "operation">
            <input type ="submit" value ="*" name = "operation">
            <input type ="submit" value ="%" name = "operation"><br><br>
            
            Result: ${result}<br>
            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
