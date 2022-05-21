package dao;

import entity.Rooms;
import entity.Users;

public interface AdminDao {
	public boolean addRooms(Rooms room);
	public void reduceRooms(Rooms room);
	public boolean addAdmins(Users user);
	public void reduceUsers(Users user);
	
}
