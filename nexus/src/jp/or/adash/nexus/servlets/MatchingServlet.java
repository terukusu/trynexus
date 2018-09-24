package jp.or.adash.nexus.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.or.adash.nexus.entity.MatchingCase;
import jp.or.adash.nexus.entity.Staff;
import jp.or.adash.nexus.services.MatchingService;

//import jp.or.adash.sample.entity.Item;
//import jp.or.adash.sample.services.ItemService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/web/match-regist")
public class MatchingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	* @see HttpServlet#HttpServlet()
	*/
	public MatchingServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {

		HttpSession session = request.getSession(true);
		Staff staff = (Staff) session.getAttribute("UserData");

		//1.1 リクエストから値を取得する
		//int id = Integer.parseInt(request.getParameter("id"));
		//int id=100;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String kyujinno = request.getParameter("kyujinno");
		String jobseekerid = request.getParameter("jobseekerid");
		String stffid = request.getParameter("staffid");
		Date interviewdt = null;
		try {
			interviewdt = sdf.parse(request.getParameter("interviewdt"));
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
//		request.getParameter("interviewdt");
		Date enterdt = null;
		try {
			enterdt = sdf.parse(request.getParameter("enterdt"));
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
//		request.getParameter("enterdt");
		String assessment = request.getParameter("assessment");
		String note = request.getParameter("note");
		Date createdt = null;
		Date upDatedt = null;


		String createuserid = staff.getId();
		String upDateuserid = staff.getId();

		//1.2 マッチング結果オブジェクトを作成
		MatchingCase matching = new MatchingCase(kyujinno,jobseekerid,stffid,interviewdt,enterdt,assessment,note,createdt,
				createuserid,upDatedt,upDateuserid);
		MatchingService service =new MatchingService();





		boolean matchingAll= service.insertMatchingCases(matching);
		// 1.3 入力チェック
		/*MaService service = new MaService();
		if (!service.check(matching)) {
			// 1.4 入力チェックでエラーがあった場合、エラーメッセージをセット
			request.setAttribute("id", matching);
			request.setAttribute("messages", service.getMessages());

			// 1.5 JSPにフォワード
			request.getRequestDispatcher("/input.jsp")
					.forward(request, response);

			return;
		}

		if ("".equals(hiddenCode)) {
			// 1.6 商品コードがない場合、商品を登録する
			service.insertMatchingCases(matching);
		} else {
			// 1.7 商品コードがある場合、商品を更新する
			service.updateItem(item);
		}
*/
		//1  処理結果メッセージをリクエストに格納する
		request.setAttribute("matching", matching);
		request.setAttribute("messages", service.getMessages());



		//1.8 JSPにフォワード
		request.getRequestDispatcher("/matchingregist.jsp")
				.forward(request, response);
	}


}
