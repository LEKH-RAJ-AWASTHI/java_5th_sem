package java_5th;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SumServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    // Set the response content type
    response.setContentType("text/html");

    // Get the printwriter for writing the response
    PrintWriter out = response.getWriter();

    // Calculate the sum of all numbers from 10 to 50
    int sum = 0;
    for (int i = 10; i <= 50; i++) {
      sum += i;
    }

    // Write the sum to the response
    out.println("<h1>The sum of all numbers from 10 to 50 is " + sum + "</h1>");
  }
}
