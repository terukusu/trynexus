package ji.or.adash.nexus.loginchak;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginChak
 */
@WebServlet("/LoginChak")
public class LoginChak extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginChak() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		          HttpSession session = request.getSession(false);

		          if (session == null) {
		        	  response.sendRedirect("/login.jsp");

		         } else {
		        	 //各リンク先へ変更。
		        	 request.getRequestDispatcher("/main.jsp").
				      forward(request, response);
		       }

	}

}
