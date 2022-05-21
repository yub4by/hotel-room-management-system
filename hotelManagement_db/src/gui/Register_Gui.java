package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import daoimpl.UsersDaoImpl;
import entity.Users;

public class Register_Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("酒店预定-注册");
		JLabel jl1=new JLabel("身 份 证 号");
		jl1.setBounds(50, 50, 80, 20);
		JLabel jl2=new JLabel("用户名");
		jl2.setBounds(50, 80, 80, 20);
		JLabel jl3=new JLabel("密    码");
		jl3.setBounds(50, 110, 80, 20);
		JLabel jl4=new JLabel("确认密码");
		jl4.setBounds(50, 140, 80, 20);
		JLabel jl5=new JLabel("电           话");
		jl5.setBounds(50, 170, 80, 20);
		
		final JTextField jt1=new JTextField();
		jt1.setBounds(110, 50, 150, 20);
		final JTextField jt2=new JTextField();
		jt2.setBounds(110, 80, 150, 20);
		final JTextField jt3=new JTextField();
		jt3.setBounds(110, 110, 150, 20);
		final JTextField jt4=new JTextField();
		jt4.setBounds(110, 140, 150, 20);
		final JTextField jt5=new JTextField();
		jt5.setBounds(110, 170, 150, 20);
		 
		/*String t1=jt1.getText();*/
		
		
		JButton j1=new JButton("提交");
		j1.setBounds(80, 200, 60, 20);
		j1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				final String idnumber=jt1.getText();
				final String name=jt2.getText();
				final String password=jt3.getText();
				final String checkpass=jt4.getText();
				final String tel=jt5.getText();
				
				Users user1=new Users(idnumber,name,password,checkpass,tel);
				UsersDaoImpl y=new UsersDaoImpl();
				y.register(user1);
			}
		});
		
		
		final JButton j2=new JButton("重填");
		j2.setBounds(180, 200, 60, 20);
		j1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				/*jt1.setText(null);
				if(e.getSource()==j2){
					jt1.setText(" ");
					jt2.setText(" ");
					jt3.setText(" ");
					jt4.setText(" ");
					jt5.setText(" ");
				}*/
				/*this.t1.setText("");*/
			}
		});
		
		
		Container con=new Container();
		con.add(jl1);
		con.add(jl2);
		con.add(jl3);
		con.add(jl4);
		con.add(jl5);
		con.add(j1);
		con.add(j2);
		con.add(jt1);
		con.add(jt2);
		con.add(jt3);
		con.add(jt4);
		con.add(jt5);
		jf.add(con);
		jf.setSize(350,300);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		
	}

}
