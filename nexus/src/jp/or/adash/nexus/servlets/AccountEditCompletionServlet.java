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
 * Servlet implementation class AccountEditDisplayServlet
 */
@WebServlet("/web/account-editcomp")
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

		//0		アカウント更新情報を取得
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String kana = request.getParameter("kana");
		String authority = request.getParameter("authority");
		String password = request.getParameter("password");



		//0		アカウント情報のオブジェクトを作成
		Staff staff = new Staff(id, name, kana, authority, password,
				null, null, null, null, null);



		//0		エラーチェック
		AccountEditService service = new AccountEditService();
		if (!service.errorsCheck(staff)) {
			staff = service.getStaffAccount(id);
			//0	アカウント情報をセット
			request.setAttribute("staff", staff);
			request.setAttribute("messages", service.getMessages());

			//0	JSPにフォワード
			 request.getRequestDispatcher("/accountedit.jsp").forward(request, response);
			 //ここにjspを入力
			return;
		}



		//0		アカウント情報を更新する。
		service.updateStaff(staff);
		//	0.アカウント情報をセット
		request.setAttribute("Staff", staff);
		request.setAttribute("messages", service.getMessages());
		//0	JSPにフォワードする
		request.getRequestDispatcher("/accounteditcompletion.jsp").forward(request, response);

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
