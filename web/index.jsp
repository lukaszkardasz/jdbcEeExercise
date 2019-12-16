<%--
  Created by IntelliJ IDEA.
  User: n2god
  Date: 16/12/2019
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
      pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Państwa miasta</title>
  </head>
  <body>
    <h1>Witaj!</h1>
  <div>
    Wybierz opcję:
    <br>
    <a href="SqlServlet?get=show">Pokaż wszystkie miasta</a> <%--parametr odpowiedni nadajemy - Yodaa--%>
    <br/>
    <a href="SqlServlet?getSorted=show">Pokaż wszystkie miasta posortowane</a> <%--parametr odpowiedni nadajemy - Yodaa--%>

  </div>
  </body>
</html>
