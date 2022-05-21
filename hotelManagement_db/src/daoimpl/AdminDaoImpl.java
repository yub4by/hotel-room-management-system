package daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import dao.AdminDao;
import dao.RoomsDao;
import entity.Rooms;
import entity.Users;

public class AdminDaoImpl implements AdminDao {

	@Override
	
	public boolean addRooms(Rooms room) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int number1= room.getNumber();
		int roompass1=room.getRoompass();
		int price1=room.getPrice();
		String style1=room.getStyle();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
			String sql="insert into rooms(number,roompass,price,style) values(?,?,?,?)";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			pstmt.setInt(1, number1);
			pstmt.setInt(2, roompass1);
			pstmt.setInt(3, price1);
			pstmt.setString(4, style1);
			if((number1>0)&&(roompass1>0)&&(price1>0)&&(style1.length()>0)){
         	   pstmt.executeUpdate();
         	   flag=true;
            }
            else
            {
         	   flag=false;
            }
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public  void reduceRooms(Rooms room) {
		// TODO Auto-generated method stub
		int number= room.getNumber();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
			String sql="delete  from rooms where number=?";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			pstmt.setInt(1, number);
			if(number>0){
	         	  pstmt.executeUpdate();
	         	  JOptionPane.showMessageDialog(null, "移除房间成功！");   
	            }
	            else
	            {
	            	JOptionPane.showMessageDialog(null, "移除失败，请按要求填写信息！");	
	            }
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean addAdmins(Users user) {
		// TODO Auto-generated method stub
		boolean flag=false;
		String idnumber= user.getIdnumber();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
			String sql="update  users set name='admin' where name!='admin' and idnumber=?";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			pstmt.setString(1, idnumber);
			if(idnumber.length()>0){
	         	   pstmt.executeUpdate();
	         	   flag=true;
	            }
	            else
	            {
	         	   flag=false;
	            }
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public void reduceUsers(Users user1) {
		// TODO Auto-generated method stub

		String name= user1.getName();
		String idnumber= user1.getIdnumber();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
			String sql="delete  from users where idnumber=?";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			pstmt.setString(1, idnumber);
			if(user1.getIdnumber().length()>0){
	         	   pstmt.executeUpdate();
	         	  JOptionPane.showMessageDialog(null, "拉黑用户成功！");
			}
	         else
	            {
	            	JOptionPane.showMessageDialog(null, "拉黑用户失败，请按要求填写信息！");
	            }
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
