package jp.or.adash.nexus.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.or.adash.nexus.entity.Staff;
import jp.or.adash.nexus.services.AccountEditService;

/**
 * Servlet implementation class AccountEditServlet
 */
@WebServlet("/web/account-edit")
public class AccountEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");

		// 1、アカウントIDがある場合、アカウント詳細情報を取得
				Staff staff = null;
				if (id != null) {
					AccountEditService service = new AccountEditService();
					staff = service.getStaffAccount(id);
				}// 1.3 リクエストにアカウント情報をセットする
				request.setAttribute("Staff", staff);
		// 3.JSPにフォワードする
		request.getRequestDispatcher("/accountedit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
