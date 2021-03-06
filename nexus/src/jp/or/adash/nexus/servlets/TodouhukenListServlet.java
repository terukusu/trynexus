package jp.or.adash.nexus.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.or.adash.nexus.entity.Todouhuken;
import jp.or.adash.nexus.services.TodouhukenService;

/**
 * Servlet implementation class TodouhukenListServlet
 */
@WebServlet("/todouhuken-list")
public class TodouhukenListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodouhukenListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.都道府県リストを取得する
		TodouhukenService Tservice = new TodouhukenService();
		List<Todouhuken> Tlist = Tservice.getTodouhukenList();
		// 2.都道府県リストをリクエストに格納する
		request.setAttribute("Todouhukenlist",Tlist);
		// 3.JSPにフォワードする
		request.getRequestDispatcher("/todouhukenlist.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
