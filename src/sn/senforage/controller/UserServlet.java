package sn.senforage.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senforage.dao.ClientImpl;
import sn.senforage.dao.IClient;
import sn.senforage.dao.IUser;
import sn.senforage.dao.UserImpl;
import sn.senforage.entities.User;

@WebServlet(urlPatterns = {"/", "/User"}, name = "user")
public class UserServlet extends HttpServlet{
	
	private IUser userdao;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		userdao = new UserImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("view/user/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
        String password = req.getParameter("password");
        System.out.println(email);
        System.out.println(password);
        
        User ok = userdao.getUserByEmail(email,password);
        resp.getWriter().println(ok);
        
        
	}

}
