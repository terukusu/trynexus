package jp.or.adash.nexus.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.or.adash.nexus.entity.Staff;

/**
 * Servlet implementation class AccountEditDisplayServlet
 */
@WebServlet("/AccountEditCompletionServlet")
public class AccountEditCompletionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccountEditCompletionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String kana = request.getParameter("kana");
		String authority = request.getParameter("authority");
		String password = request.getParameter("password");
		//0アカウント情報のオブジェクトを作成
		Staff staff = new Staff(id, name, kana, authority, password,
				null, null, null, null, null);
		// 1.アカウントIDを元にアカウント情報を更新する。
		AccountEditService service = new AccountEditService();
		service.updateStaff(staff);
		// 2.アカウント情報をリクエストに格納する
		request.setAttribute("Staff", staff);
		request.setAttribute("messages", service.getMessages());
		// 3.JSPにフォワードする
		request.getRequestDispatcher("./accounteditcompletion.jsp").forward(request, response);

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
