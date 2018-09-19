package jp.or.adash.nexus.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.or.adash.nexus.entity.Staff;



/**
 * Servlet implementation class AccountRegistServlets
 */
@WebServlet("/accountregistservlets")
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	//入力された情報を登録する
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String kana = request.getParameter("kana");
		String authority = request.getParameter("authority");

	//entityのオブジェクト作成
	Staff staff = new Staff(id, name, kana, authority, null, null, null, null, null, null);

	//JSPにフォワード
	request.getRequestDispatcher("/accountregist.jsp") .forward(request, response);


	}
}

