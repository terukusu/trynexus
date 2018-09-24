package jp.or.adash.nexus.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.or.adash.nexus.entity.JobSeeker;
import jp.or.adash.nexus.entity.Staff;
import jp.or.adash.nexus.entity.Todouhuken;
import jp.or.adash.nexus.services.TodouhukenService;



/**
 * Servlet implementation class JobSeekerRegistDisplay
 */
@WebServlet("/jobseeker-disp")
public class JobSeekerRegistDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobSeekerRegistDisplay() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		Staff staff = (Staff) session.getAttribute("UserData");

		// 1.1 リクエストから求職者情報を取得
		JobSeeker seeker = null;
		// 1.都道府県リストを取得する
				TodouhukenService service = new TodouhukenService();
				List<Todouhuken> todouhukenlist = service.getTodouhukenList();
				// 2.都道府県リストをリクエストに格納する
				request.setAttribute("todouhuken",todouhukenlist);
				// 3.JSPにフォワードする
//				request.getRequestDispatcher("/todouhukenlist.jsp").forward(request,response);
//				String id = request.getParameter("id");

/*
				// 1.2 求職者IDがある場合、求職者情報を取得
				JobSeeker seeker = null;
				if (id != "") {
					JobSeekerService service = new JobSeekerService();
					seeker = service.getJobSeeker(id);
				}
*/
				// 1.3 リクエストに求職者情報をセットする
				request.setAttribute("Staff", staff);
				request.setAttribute("seeker", seeker);

				// 1.4 JSPにフォワードする
				request.getRequestDispatcher("/applicantregist.jsp")
					.forward(request, response);
			}

	}


