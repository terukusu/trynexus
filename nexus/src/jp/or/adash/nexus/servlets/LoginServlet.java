package jp.or.adash.nexus.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.or.adash.nexus.entity.Staff;
import jp.or.adash.nexus.services.LoginService;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//TODO 削除フラグが１の場合のアカウントはログイン不可にする。
		String user = request.getParameter("id");
		String pass = request.getParameter("pass");

		//0.セッション情報を取得し、無い場合新規作成。
		HttpSession session = request.getSession(true);
		LoginService ls = new LoginService();
		//0　ユーザーID、パスワードが正しいかどうかの変数
		Staff userData = ls.getAuthUser(user, pass);

		//0 認証処理
		if (userData != null ) {
			//0 認証情報を格納する
			session.setAttribute("UserData", userData);
			// メニューバーの名前用にStaffにuserDataを格納
			request.setAttribute("Staff", userData);
			//0　メインjspにフォワード
			response.sendRedirect("/nexus/web/staff-top");
		} else {
			//0 認証失敗した場合エラーメッセージの表示
			request.setAttribute("message", "IDまたはパスワードが違います");
			request.getRequestDispatcher("/top").forward(request, response);
		}
	}
}
