package jp.or.adash.nexus.utils.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.or.adash.nexus.entity.Staff;

/**
 * Servlet Filter implementation class AdminCheck
 */
@WebFilter("/web/admin/*")
public class AdminCheck implements Filter {

    /**
     * Default constructor.
     */
    public AdminCheck() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 0セッションが存在しない場合NULLを返す
        HttpSession session = ((HttpServletRequest)request).getSession();
        Staff userData = (Staff)session.getAttribute("UserData");
        Staff staff = null;

        if(userData != null && userData.getAuthority().equals("1")){
            // ログインユーザーが管理者なら通常の処理
            chain.doFilter(request, response);
        }else{
            // セッションが存在しない、または、ユーザー権限がない場合、スタッフトップページへ
            ((HttpServletResponse)response).sendRedirect("/nexus/web/staff-top");
        }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
