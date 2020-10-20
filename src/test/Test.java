package test;

import sn.senforage.dao.ClientImpl;
import sn.senforage.dao.IClient;
import sn.senforage.dao.IVillage;
import sn.senforage.dao.VillageImpl;
import sn.senforage.entities.Client;
import sn.senforage.entities.Village;

public class Test {
	
	public static void main(String[] args) {
		
		IClient clientdao = new ClientImpl();
		/* IVillage villagedao = new VillageImpl(); */
		
		Client client = new Client();
		client.setNomFamille("FALL");
		client.setAdresse("Petit mbao");
		client.setTelephone("771596321");
		
		int ok = clientdao.add(client);
		System.out.println(ok);
		
		/*
		 * Village village = new Village(); village.setNom("RAO");
		 * 
		 * int ok2 = villagedao.add(village); System.out.println(ok);
		 */
		
		}

}
