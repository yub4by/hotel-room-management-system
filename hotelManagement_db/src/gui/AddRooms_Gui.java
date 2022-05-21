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
import daoimpl.UsersDaoImpl;
import entity.Rooms;
import entity.Users;

public class AddRooms_Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("����Ա-���ӷ���");
		JLabel jl1=new JLabel("�����");
		jl1.setBounds(50, 50, 80, 20);
		JLabel jl2=new JLabel("����");
		jl2.setBounds(50, 80, 80, 20);
		JLabel jl3=new JLabel("�۸�");
		jl3.setBounds(50, 110, 80, 20);
		JLabel jl4=new JLabel("����");
		jl4.setBounds(50, 140, 80, 20);
		
		final JTextField jt1=new JTextField();
		jt1.setBounds(110, 50, 150, 20);
		final JTextField jt2=new JTextField();
		jt2.setBounds(110, 80, 150, 20);
		final JTextField jt3=new JTextField();
		jt3.setBounds(110, 110, 150, 20);
		final JTextField jt4=new JTextField();
		jt4.setBounds(110, 140, 150, 20);
		
		JButton j1=new JButton("�ύ");
		j1.setBounds(80, 200, 60, 20);
		j1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int number=Integer.parseInt(jt1.getText());
				int roompass=Integer.parseInt(jt2.getText());
				int price=Integer.parseInt(jt3.getText());
				String style=jt4.getText();
				
				
				Rooms room=new Rooms(number,roompass,price,style);
				AdminDaoImpl y=new AdminDaoImpl();
				if(y.addRooms(room)==true){
					JOptionPane.showMessageDialog(null, "��ӳɹ���");
				}else{
					JOptionPane.showMessageDialog(null, "���ʧ�ܣ��밴Ҫ����д��Ϣ��");
					
					
				}
			}
		});
		
		
		JButton j2=new JButton("����");
		j2.setBounds(180, 200, 60, 20);
		j1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Container con=new Container();
		con.add(jl1);
		con.add(jl2);
		con.add(jl3);
		con.add(jl4);
		con.add(j1);
		con.add(j2);
		con.add(jt1);
		con.add(jt2);
		con.add(jt3);
		con.add(jt4);
		jf.add(con);
		jf.setSize(350,300);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		
	}

}
