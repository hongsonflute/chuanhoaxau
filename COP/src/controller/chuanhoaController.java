package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.glass.ui.GestureSupport;

import chuanhoa.chuanhoaxau;
import service.chuanhoa;

@WebServlet("/chuanhoaController")
public class chuanhoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public chuanhoaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.sendRedirect("index.jsp");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		response.setContentType("text/html;charset=UTF-8"); 
		request.setCharacterEncoding("UTF-8");
		
			String input=request.getParameter("input");
			if(input.equals("")) {
				request.setAttribute("rong", "Không có đoạn văn bản nào để chuẩn hóa!");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}
		
		chuanhoa chuan=new chuanhoa();
		chuan.getRes(input);
		String kq=null;
		kq=chuan.getRes(input.toLowerCase()).toString();
	
		request.setAttribute("dauvao",input);
		request.setAttribute("ketqua",kq);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);	

	}

}
