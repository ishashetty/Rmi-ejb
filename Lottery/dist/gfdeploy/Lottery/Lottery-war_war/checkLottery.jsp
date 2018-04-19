<%-- 
    Document   : checkLottery
    Created on : 5 Apr, 2018, 9:25:29 PM
    Author     : Acer PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>Lottery System</title>
    </head>
    <body>
         <div class="w3-container w3-teal">
            <h1>Lottery System</h1>
            <h4 style="float:right"><a href="Lotjsp.jsp" style="text-decoration: none">Logout</a></h4>
        </div>
        <div class="w3-container">
         <form action="checkLottery" method="post">
             <label>Enter your lottery number:</label><br><br>
             <input type="text" name="val"/><br><br>
            <input type="submit" value="show Lottery"/>
        </form>
        </div>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <div class="w3-container w3-teal">
            <p>My footer information</p>
        </div>
    </body>
</html>
