package sn.senforage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sn.senforage.entities.User;

public class UserImpl implements IUser{
	
	
	private EntityManager em;
	
	public UserImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("senforage");
		em = emf.createEntityManager();
	}
		

	@Override
	public int add(User user) {
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			return 1;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<User> list() {
		return em.createQuery("SELECT u FROM User u").getResultList();
	}


	@Override
	public User getUserByEmail(String email, String password) {
		Query query = em.createQuery("select u from User u where u.email=:email AND u.password=:password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		try {
			return (User) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
		
	}
	
	

}
