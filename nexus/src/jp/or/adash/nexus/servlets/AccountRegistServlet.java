package jp.or.adash.nexus.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.or.adash.nexus.entity.Staff;
import jp.or.adash.nexus.services.AccountEditService;
import jp.or.adash.nexus.services.AccountService;



/**
 * Servlet implementation class AccountRegistServlets
 */
@WebServlet("/web/account-regist")
public class AccountRegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//SimpleDateFormat sdf = new SimpleDateFormat();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountRegistServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		//入力された情報を登録する
		String name = request.getParameter("name");
		String kana = request.getParameter("kana");
		String authority = request.getParameter("kengen");
		String password = request.getParameter("password");


		//0セッション　Objectはいろんな型を入れておける　ユーザーIdとユーザー名
		HttpSession session = request.getSession(true);
		Staff sessionStaff = (Staff)session.getAttribute("UserData");

		//staffのオブジェクトにデータをセット ログインした人と、今から登録する人２人分のStaffオブジェクトが必要
		Staff staff = new Staff(null, name, kana, authority, password,
			null, sessionStaff.getId(), null, sessionStaff.getId(), "0");

		//serviceのregistAccountにstaffを渡す
		AccountService accountservice = new AccountService();
		//0		エラーチェック
				AccountEditService service = new AccountEditService();
				if (!service.errorsCheck(staff)) {

					//0	アカウント情報をセット
					request.setAttribute("staff", staff);
					request.setAttribute("messages", service.getMessages());

					//0	JSPにフォワード
					 request.getRequestDispatcher("/accountregist.jsp").forward(request, response);
					 //ここにjspを入力
					return;
				}
		boolean result = accountservice.registAccount(staff);



		//0登録が完了したら、accountregistcompletion.jspへ飛ぶ
		if(result == true) {
			request.setAttribute("staff", staff);
			request.getRequestDispatcher("/accountregistcompletion.jsp").forward(request, response);

		//0データベースアクセスに失敗した場合
		}else {
			request.setAttribute("staff", staff);
			request.setAttribute("messages", accountservice.getMessages());
			request.getRequestDispatcher("/accountregist.jsp").forward(request, response);
		}
	}
}

