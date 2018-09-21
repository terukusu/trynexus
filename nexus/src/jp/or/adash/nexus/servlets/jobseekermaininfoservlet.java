package jp.or.adash.nexus.servlets;
/* 求職者情報の詳細情報を求職者IDを元に表示するservlet
 *
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.or.adash.nexus.entity.JobSeekerMain;
import jp.or.adash.nexus.services.JobSeekerService;

/**
 * Servlet implementation class jobseekermaininfoservlet
 */
@WebServlet("/jobseekermaininfoservlet")
public class jobseekermaininfoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String js_id;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jobseekermaininfoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.js_id = request.getParameter("js_id");
		// 1.求職者情報一覧を取得する
		JobSeekerService service = new JobSeekerService();
		JobSeekerMain js_info = service.getJobseekermaininfo(js_id);

		// 2.求職者情報をリクエストに格納する
		request.setAttribute("info", js_info);
		// 3.JSPにフォワードする
		request.getRequestDispatcher("/applicant_maininfo.jsp").forward(request, response);
	}

}
