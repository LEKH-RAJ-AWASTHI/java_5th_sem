package java_5th;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CubeServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    // Set the response content type
    response.setContentType("text/html");

    // Get the printwriter for writing the response
    PrintWriter out = response.getWriter();

    // Get the number from the request
    String strNum = request.getParameter("num");
    int num = Integer.parseInt(strNum);

    // Calculate the cube of the number
    int cube = num * num * num;

    // Write the result to the response
    out.println("<h1>The cube of " + num + " is " + cube + "</h1>");
  }
}
