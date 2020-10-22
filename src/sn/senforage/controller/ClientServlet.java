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
import sn.senforage.dao.IVillage;
import sn.senforage.dao.VillageImpl;
import sn.senforage.entities.Client;
import sn.senforage.entities.Village;

@WebServlet(urlPatterns = {"/Client"}, name = "client")
public class ClientServlet extends HttpServlet{
	
	private IClient clientdao;
	private IVillage villagedao;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		clientdao = new ClientImpl();
		villagedao = new VillageImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.getWriter().println("ok page trouve");
		req.setAttribute("listV", villagedao.list());
		req.setAttribute("listc", clientdao.list());
		req.getRequestDispatcher("view/client/add.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nomFamille = req.getParameter("nomFamille").toString();
        String adresse = req.getParameter("adresse").toString();
        String telephone = req.getParameter("telephone").toString();
        int id = Integer.parseInt(req.getParameter("village_id").toString());
        Village v1 = new Village();
        v1 = villagedao.getVillageById(id);
        Client client = new Client();
        
        client.setNomFamille(nomFamille);
        client.setAdresse(adresse);
        client.setTelephone(telephone);
        client.setVillage(v1);
        
        int ok = clientdao.add(client);
		
        
        doGet(req,resp);
        
	}

}
