package daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JComboBox;

import dao.RoomsDao;
import entity.Rooms;

public class RoomsDaoImpl implements RoomsDao {

	@Override
	public int show(int number) {//µ•º€
		int n=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
			String sql="select price from rooms where number=?";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			pstmt.setInt(1, number);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				n=rs.getInt("price");
			} 
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int getPass(int number) {//√ÿ‘ø
		int m=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
			String sql="select roompass from rooms where number=?";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			pstmt.setInt(1, number);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				m=rs.getInt("roompass");
			} 
		}
		catch (Exception e) {
				e.printStackTrace();
			}
		return m;
	
	}
	
	@Override
	public void replace(int number) {//ÕÀ∑ø
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
			String sql="update  rooms set status='Œ¥∂©' where status='“—∂©' and number=? ";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			pstmt.setInt(1, number);
			pstmt.executeUpdate();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void borrow(int number) {//∂©∑ø
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
			String sql="update  rooms set status='“—∂©' where  status='Œ¥∂©' and number=? ";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			pstmt.setInt(1, number);
			pstmt.executeUpdate();
		}
		catch (Exception e) {
				e.printStackTrace();
		}
	}

}
