package jp.or.adash.nexus.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.or.adash.nexus.entity.Staff;

/**
 * Servlet implementation class AccountDisplayServlets
 */
@WebServlet("/web/account-disp")
public class AccountDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountDisplayServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		Staff staff = (Staff) session.getAttribute("UserData");

		request.setAttribute("Staff", staff);
		//フォワードする
		request.getRequestDispatcher("/accountregist.jsp")
		.forward(request, response);



	}

}
