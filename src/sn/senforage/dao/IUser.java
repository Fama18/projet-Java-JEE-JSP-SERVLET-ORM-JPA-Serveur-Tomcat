package sn.senforage.dao;

import java.util.List;

import sn.senforage.entities.User;

public interface IUser {
	
	public int add(User user);
	public List<User> list();

}
