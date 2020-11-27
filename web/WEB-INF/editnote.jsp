<%-- 
    Document   : editnote
    Created on : 30-Sep-2020, 11:52:27 AM
    Author     : ryana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit note here</title>
    </head>
    <body>
        <form method ="post" action ="">
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        
          <p><b>Title:</b> </p>
          <input type ="text" name ="title" >
        <br>
        <p><b>Contents:</b></p>
        <textarea name ="content" rows = "10" cols = "25"></textarea>
          <input type ="submit" value ="Save">
        </form>
    </body>
</html>
