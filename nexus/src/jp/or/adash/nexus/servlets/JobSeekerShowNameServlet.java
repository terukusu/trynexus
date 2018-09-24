package jp.or.adash.nexus.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.or.adash.nexus.entity.Jobseeker_simple_entity;
import jp.or.adash.nexus.services.JobSeekerService;

/**
 * Servlet implementation class JobSeekerShowNameServlet
 */
@WebServlet("/jobseekershowservletname")
public class JobSeekerShowNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String js_name;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobSeekerShowNameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.検索する求職者IDを取得する
		this.js_name = request.getParameter("js_name");
		// 2.求職者情報一覧を取得する
		JobSeekerService service = new JobSeekerService();
		List<Jobseeker_simple_entity> list = service.getJobSeeker(js_name);
		// 3.求職者情報を初期化
		request.removeAttribute("list");
		// 4.求職者情報をリクエストに格納する
		request.setAttribute("list", list);
		// 5.JSPにフォワードする
		request.getRequestDispatcher("/applicant_list.jsp").forward(request, response);

		//response.getWriter().append("Served at: ").append(request.getContextPath());

	}

}
