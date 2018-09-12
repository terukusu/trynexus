package jp.or.adash.nexus.utils.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.LoginService;


/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = request.getParameter("id");
		String pass = request.getParameter("pass");

		//0.セッション情報を取得し、無い場合新規作成。
		HttpSession session = request.getSession(true);

		LoginService ls = new LoginService(user,pass);
		//0　ユーザーID、パスワードが正しいかどうかの変数
		boolean authCheck = ls.authUser(user,pass);
		//0 認証処理
		if(authCheck == true) {
			 //0 認証情報を格納する
		      session.setAttribute("loginuser", user);
		      //0　メインjspにフォワード
		      request.getRequestDispatcher("/main.jsp").
		      forward(request, response);
		}else{
			//0 認証失敗した場合エラーメッセージの表示
			request.getRequestDispatcher("/message.jsp").
		      forward(request, response);
			}
		}
}
