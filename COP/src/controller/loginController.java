package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.userDAO;
import model.user;

@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.sendRedirect("login.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		user u=new user();
		u.setUserName(username);
		u.setUserPassword(password);
		userDAO ud=new userDAO();
		
		if(ud.checkUser(u)==true)
		{
			HttpSession ss=request.getSession();
			ss.setAttribute("user", u);
			response.sendRedirect("index.jsp");
		}
		else {
			
			request.setAttribute("erroLogin", "Sai tên tài khoản hoặc mật khẩu!");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
	
	}

}
