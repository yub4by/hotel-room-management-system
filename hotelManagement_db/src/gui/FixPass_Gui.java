package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import daoimpl.AdminDaoImpl;
import daoimpl.RoomsDaoImpl;
import daoimpl.UsersDaoImpl;
import entity.Rooms;
import entity.Users;

public class FixPass_Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("酒店预订-密码");
		
		JLabel jl=new JLabel("身份证号");
		jl.setBounds(50, 20, 70, 20);
		
		final JTextField jt=new JTextField();
		jt.setBounds(100, 20, 150, 20);
		
		JLabel jl1=new JLabel("新密码");
		jl1.setBounds(50, 50, 70, 20);
		
		final JTextField jt1=new JTextField();
		jt1.setBounds(100, 50, 150, 20);
		
		JButton j1=new JButton("确定");
		j1.setBounds(100, 80, 60, 20);
		j1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				final String idnumber=jt.getText();
				final String password=jt1.getText();
				Users user=new Users();
				user.setIdnumber(idnumber);
				user.setPassword(password);
				UsersDaoImpl c=new UsersDaoImpl();
				c.fixPass(user);
				
			}
		});
		//fixPass(Users user)
		Container con=new Container();
		con.add(jt);
		con.add(jl);
		con.add(jt1);
		con.add(jl1);
		con.add(j1);
		jf.add(con);
		jf.setSize(300,200);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
	}
	
}
