package jp.or.adash.nexus.kyujin.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/todouhuken")
public class Todouhuken {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Todouhuken() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = null;
		no = request.getParameter("no");

		// 1.3 リクエストに求人票情報をセットする
		request.setAttribute("no", no);

		// 1.4 JSPにフォワードする
		request.getRequestDispatcher("/jobregist.jsp")
				.forward(request, response);
	}
}
