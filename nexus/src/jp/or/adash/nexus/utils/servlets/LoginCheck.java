package jp.or.adash.nexus.utils.servlets;

/*
@WebFilter("/*")
>>>>>>> refs/remotes/origin/#23
public class LoginCheck implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 0セッションが存在しない場合NULLを返す
        HttpSession session = ((HttpServletRequest)request).getSession();

		// 1.内作
		// Staff user = new Staff(null, null, null, null, null, null, null, null, null, null);
		// session.setAttribute("UserData", user);
		// 1.内作

        Staff userData = (Staff)session.getAttribute("UserData");

        if(userData != null){
            //　0セッションがnullでなければ、通常どおりの遷移
            chain.doFilter(request, response);
        }else{
            //　0セッションがnullならば、ログイン画面へ飛ばす
            RequestDispatcher dispatcher = request.getRequestDispatcher("/stafflogin.jsp");
            dispatcher.forward(request,response);
        }
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}
	public void destroy(){
	}
}
*/