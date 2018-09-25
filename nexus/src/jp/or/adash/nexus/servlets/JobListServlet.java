package jp.or.adash.nexus.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.or.adash.nexus.entity.Job;
import jp.or.adash.nexus.services.JobService;

/**
 * Servlet implementation class JobListServlet
 */
@WebServlet("/Job/list")
public class JobListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JobListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.職種大分類リストを取得する
		JobService Lservice = new JobService();
		List<Job> Llist = Lservice.getLargeJobList();
		// 2.職種大分類リストをリクエストに格納する
		request.setAttribute("Largelist", Llist);

		// 1.職種小分類リストを取得する
		JobService Sservice = new JobService();
		List<Job> Slist = Sservice.getSmallJobList();
		// 2.職種小分類リストをリクエストに格納する
		request.setAttribute("Smalllist", Slist);
		// 3.JSPにフォワードする
		request.getRequestDispatcher("/joblist.jsp").forward(request, response);
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
