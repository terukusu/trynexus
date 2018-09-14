package jp.or.adash.nexus.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.or.adash.nexus.entity.SimpleKyujin;
import jp.or.adash.nexus.services.JobSerarchService;

/**
 * Servlet implementation class KyujinServlet
 */
@WebServlet("/jobsearch")
public class JobSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JobSearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.1 リクエストから職種を取得
		String job = null;
		job = request.getParameter("job");

		// 1.2 職業小分類コード1を取得
		String jobsmallcd1 = null;
		jobsmallcd1 = request.getParameter("jobsmallcd1");

		// 1.3  職業小分類コード2を取得
		String jobsmallcd2 = null;
		jobsmallcd2 = request.getParameter("jobsmallcd2");

		// 1.4  職業小分類コード3を取得
		String jobsmallcd3 = null;
		jobsmallcd3 = request.getParameter("jobsmallcd3");

		// 1.5 職業大分類コード1を取得
		String joblargecd1 = null;
		joblargecd1 = request.getParameter("joblargecd1");

		// 1.6 職業大分類コード2を取得
		String joblargecd2 = null;
		joblargecd2 = request.getParameter("joblargecd2");

		// 1.7 職業大分類コード3を取得
		String joblargecd3 = null;
		joblargecd3 = request.getParameter("joblargecd3");

		// 1.8基本給下限を取得
		int salarymin = -1;
		if (!"".equals(request.getParameter("salarymin"))
				&& request.getParameter("salarymin") != null) {
			salarymin = Integer.parseInt(request.getParameter("salarymin"));
		}
		// 1.9 基本給上限を取得
		int salarymax = -1;
		if (!"".equals(request.getParameter("salarymax"))
				&& request.getParameter("salarymax") != null) {
			salarymax = Integer.parseInt(request.getParameter("salarymax"));
		}

		// 1.10　就業場所コードを取得
		String addresscd = null;
			addresscd = request.getParameter("addresscd");


		// 1.11 雇用形態コードを取得
		int koyoukeitaicd = -1;
		if (!"".equals(request.getParameter("koyoukeitaicd"))
				&& request.getParameter("koyoukeitaicd") != null) {
			koyoukeitaicd = Integer.parseInt(request.getParameter("koyoukeitaicd"));
		}


		// 2.求人票の取得
		List<SimpleKyujin> kj = new ArrayList<SimpleKyujin>();
		if (salarymin >= 0 && salarymax >= 0  && koyoukeitaicd >= 0) {
			JobSerarchService service = new JobSerarchService();
			kj = service.getKyujin(job, addresscd,jobsmallcd1, jobsmallcd2, jobsmallcd3, joblargecd1, joblargecd2, joblargecd3,
					salarymin, salarymax ,koyoukeitaicd);
		}

		// 1.3 リクエストに求人票情報をセットする
		request.setAttribute("kyujin", kj);

		// 1.4 JSPにフォワードする
		request.getRequestDispatcher("/jobsearch.jsp")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
