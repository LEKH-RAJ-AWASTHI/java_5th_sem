package java_5th;
import javax.servlet.http.*;

import javax.servlet.*;

public class ToAnotherServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		String un= req.getParameter("un");
		String pw= req.getParameter("pw");
		HttpSession session= req.getSession();
		
		
		if(un.equals("lekhraj") && pw.equals("12345")) {
			
			RequestDispatcher rd= req.getRequestDispatcher("success");
			
			try {
				session.setAttribute("username", un);
			
				rd.forward(req, res);
				
			}
			catch(Exception e) {
				
			}
		}
	}
}
