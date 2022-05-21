package dao;

import entity.Users;

public interface UsersDao {
	public boolean login(Users user);
	public void register(Users user);
	public void fixPass(Users user);
	
	
}
