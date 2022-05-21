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


public class ReduceRooms_Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("管理员-房间维护");
		JLabel jl1=new JLabel("房间号");
		jl1.setBounds(50, 20, 70, 20);
		
		
		final JTextField jt1=new JTextField();
		jt1.setBounds(100, 20, 150, 20);
		
		
		JButton j1=new JButton("确定");
		j1.setBounds(100, 60, 60, 20);
		j1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				final int number=Integer.parseInt(jt1.getText());
				Rooms room=new Rooms(number);
				AdminDaoImpl y=new AdminDaoImpl();
				y.reduceRooms(room);
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
