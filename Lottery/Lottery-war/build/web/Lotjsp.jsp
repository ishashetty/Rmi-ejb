<%-- 
    Document   : Lotjsp
    Created on : 5 Apr, 2018, 9:03:20 PM
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
            <h4 style="float:right"><a href="index.html" style="text-decoration: none">Back</a></h4>
        </div>
         <div class="w3-container">
        <form action="Lotteryservlet" method="post">
            <label>Enter your Username:</label><br><br>
            <input type="text" name="t1"/>
             <br><br>
             <a href="index.html"></a>
            <label>Enter your Password:</label><br><br>
            <input type="password" name="t2"/>
              <br><br>
            <input type="submit" value="Login"/>
        </form>
         </div>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <div class="w3-container w3-teal">
          <p>My footer information</p>
       </div>
    </body>
</html>
