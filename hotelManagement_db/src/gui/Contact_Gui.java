package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import daoimpl.UsersDaoImpl;
import entity.Users;

public class Contact_Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("联系我们");
		JLabel jl1=new JLabel("TEL：18745011192");
		jl1.setBounds(50, 50, 200, 20);
		JLabel jl2=new JLabel("Q Q：1196006753");
		jl2.setBounds(50, 80, 200, 20);
		JLabel jl3=new JLabel("WeChat：18745011192");
		jl3.setBounds(50, 110, 200, 20);
		JLabel jl4=new JLabel("WeiBo：请叫我Mr海飛飛");
		jl4.setBounds(50, 140, 200, 20);
		JLabel jl5=new JLabel("E-mail：1196006753@qq.com");
		jl5.setBounds(50, 170, 200, 20);
		
		JButton j=new JButton("确定");
		j.setBounds(250, 200, 60, 20);
		j.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		Container con=new Container();
		con.add(jl1);
		con.add(jl2);
		con.add(jl3);
		con.add(jl4);
		con.add(jl5);
		con.add(j);
		jf.add(con);
		jf.setSize(350,300);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
	}

}
