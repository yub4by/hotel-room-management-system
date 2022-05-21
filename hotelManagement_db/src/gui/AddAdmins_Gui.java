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

import daoimpl.AdminDaoImpl;

import entity.Rooms;
import entity.Users;


public class AddAdmins_Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("管理员-修改权限");
		JLabel jl1=new JLabel("身份证号：");
		jl1.setBounds(50, 20, 70, 20);
		
		
		final JTextField jt1=new JTextField();
		jt1.setBounds(100, 20, 150, 20);
		
		
		JButton j1=new JButton("确定");
		j1.setBounds(100, 60, 60, 20);
		j1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String idnumber=jt1.getText();
				Users user=new Users(idnumber);
				AdminDaoImpl y=new AdminDaoImpl();
				if(y.addAdmins(user)==true){
					JOptionPane.showMessageDialog(null, "修改身份证号为："+idnumber+"为管理员成功！");
				}else{
					JOptionPane.showMessageDialog(null, "修改权限失败！请按要求填写信息！");	
				}
			}
		});
		
		
		Container con=new Container();
		con.add(jl1);
		con.add(j1);
		con.add(jt1);
		jf.add(con);
		jf.setSize(300,150);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);	
	}
}
