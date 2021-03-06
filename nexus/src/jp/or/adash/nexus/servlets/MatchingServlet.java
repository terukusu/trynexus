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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String kyujinno = request.getParameter("kyujinno");
		String jobseekerid = request.getParameter("jobseekerid");
		String stffid = request.getParameter("staffid");
		Date interviewdt = null;
		try {
			interviewdt = sdf.parse(request.getParameter("interviewdt"));
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			interviewdt = null;
		}
		//		request.getParameter("interviewdt");
		Date enterdt = null;
		try {
			enterdt = sdf.parse(request.getParameter("enterdt"));
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			enterdt = null;
		}
		//		request.getParameter("enterdt");
		String assessment = request.getParameter("assessment");
		String note = request.getParameter("note");
		Date createdt = null;
		Date upDatedt = null;

		String createuserid = staff.getId();
		String upDateuserid = staff.getId();

		//1.2 マッチング結果オブジェクトを作成
		MatchingCase matching = new MatchingCase(kyujinno, jobseekerid, stffid, interviewdt, enterdt, assessment, note,
				createdt,
				createuserid, upDatedt, upDateuserid);

		MatchingService service = new MatchingService();

		if (!service.check(matching)) {
			//入力チェックでエラーがあった場合、エラーメッセージをセット
			request.setAttribute("Staff", staff);
			request.setAttribute("matching", matching);
			request.setAttribute("messages", service.getMessages());

			//JSPにフォワード
			request.getRequestDispatcher("/matchingregist.jsp")
					.forward(request, response);

			return;
		}

		service.insertMatchingCases(matching);

		//処理結果メッセージをリクエストに格納する
		request.setAttribute("Staff", staff);
		request.setAttribute("matching", matching);
		request.setAttribute("messages", service.getMessages());

		//1.8 JSPにフォワード
		request.getRequestDispatcher("/matchingregist.jsp")
		.forward(request, response);
	}

}
