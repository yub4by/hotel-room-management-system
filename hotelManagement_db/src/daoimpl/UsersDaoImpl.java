package daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import dao.UsersDao;
import entity.Users;
import gui.Login_Gui;

public class UsersDaoImpl implements UsersDao {

	@Override
	public boolean login(Users user) {
		// TODO Auto-generated method stub
		boolean flag=false;
		//JDBC�������ݿ�
		try {
			String name1=user.getName();
			String password1=user.getPassword();
			//1.���������ļ�Jar���е��ļ�
			Class.forName("com.mysql.jdbc.Driver");
			//2.�����������ݿ�
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
			//3.��������
			String sql="select * from users where name=? and password=?";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			pstmt.setString(1, name1);
			pstmt.setString(2, password1);
			//4.�����
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{ 
               if(rs.getString(1).length()>0)
               {
            	   flag=true;
               }
               else
               {
            	   flag=false;
               }
			}
		} 
		catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return flag;
	}

	@Override
	public void register(Users user1) {
		// TODO Auto-generated method stub
		String idnumber1=user1.getIdnumber();
		String name1=user1.getName();
		String password1=user1.getPassword();
		String checkpass1=user1.getCheckpass();
		String tel1=user1.getTel();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
			String sql="insert into users(idnumber,name,password,tel) values(?,?,?,?)";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			pstmt.setString(1, user1.getIdnumber());
			pstmt.setString(2, user1.getName());
			pstmt.setString(3, user1.getPassword());
			pstmt.setString(4, user1.getTel());
				if((idnumber1.length()>0)&&(name1.length()>0)&&(password1.length()>0)&&(tel1.length()>0)&&(checkpass1.equals(password1)))
			   {
					if(user1.getName().equals("admin"))
					{
						JOptionPane.showMessageDialog(null, "ע��ʧ�ܣ��û����Ƿ�������");
					}
					else{
						pstmt.executeUpdate();
		            	   JOptionPane.showMessageDialog(null, "ע��ɹ������½��");
						   new Login_Gui().main(null);
					}
		 
               }
               else
               {
            	   JOptionPane.showMessageDialog(null, "ע��ʧ�ܣ��밴Ҫ����д��Ϣ��");
               }
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void fixPass(Users user) {
		// TODO Auto-generated method stub
		String idnumber= user.getIdnumber();
		String password= user.getPassword();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
			String sql="update  users set password=? where  idnumber=?";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, idnumber);
			 pstmt.executeUpdate();
			if(user.getIdnumber().length()>0&&user.getPassword().length()>0){
	         	   pstmt.executeUpdate();
	         	  JOptionPane.showMessageDialog(null, "�޸�����ɹ�!");
			}
	        else
	            {
	            	JOptionPane.showMessageDialog(null, "�޸�ʧ�ܣ��밴Ҫ����д��Ϣ��");
	            }
			
		}
		catch (Exception e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
