package dao;

import java.util.ArrayList;

import javax.sound.sampled.Port.Info;

import entity.Rooms;

public interface RoomsDao {
	
	public int show(int number);
	public int getPass(int number);
	public void borrow(int number);
	public void replace(int number);
	
	
}
