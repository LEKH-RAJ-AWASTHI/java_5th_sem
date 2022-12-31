<%@ page import="java.lang.Math" %>

<%
  // Calculate the area of the triangle
  double s = (3 + 4 + 5) / 2.0;
  double area = Math.sqrt(s * (s - 3) * (s - 4) * (s - 5));
%>

<!DOCTYPE html>
<html>
<head>
  <title>Triangle Area</title>
</head>
<body>
  <h1>The area of the triangle with sides 3, 4, and 5 is <%= area %></h1>
</body>
</html>
