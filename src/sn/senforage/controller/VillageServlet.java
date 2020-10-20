package sn.senforage.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senforage.dao.IVillage;
import sn.senforage.dao.VillageImpl;
import sn.senforage.entities.Village;

@WebServlet(urlPatterns = "/Village", name = "village")
public class VillageServlet extends HttpServlet{
	
	private IVillage villagedao;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		villagedao = new VillageImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("view/village/add.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom").toString();
        
        Village village = new Village();
        
        village.setNom(nom);
        
        int ok = villagedao.add(village);
        resp.getWriter().println(ok);
	}

}
