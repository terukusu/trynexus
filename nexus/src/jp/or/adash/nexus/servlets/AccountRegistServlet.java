package jp.or.adash.nexus.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.or.adash.nexus.entity.Staff;
import jp.or.adash.nexus.services.AccountService;



/**
 * Servlet implementation class AccountRegistServlets
 */
@WebServlet("/account-regist")
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

	//TODO:0.セッションオブジェクトをつくり、無理やりデータをつめる。ここが友成さん　跡で消す
		HttpSession session = request.getSession(true);
		Staff staffsession = new Staff(null, null, null, null, null, null, "0001", null, "0001", "0");
		session.setAttribute("UserData", staffsession);


	//0ここからは必要	Objectはいろんな型を入れておける　ユーザーIdとユーザー名
		Staff sessionStaff = (Staff)session.getAttribute("UserData");


	//staffのオブジェクトからデータを取る

	Staff staff = new Staff("10", name, kana, authority, password,
			null, sessionStaff.getCreateuserid(), null, sessionStaff.getUpdateuserid(), "0");

	//serviceのregistAccountにstaffを渡す
	AccountService accountservice = new AccountService();
	boolean result = accountservice.registAccount(staff);

	//JSPにフォワード
	request.getRequestDispatcher("/accountregist.jsp").forward(request, response);


	}
}

