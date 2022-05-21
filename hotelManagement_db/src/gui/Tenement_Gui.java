
package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import daoimpl.RoomsDaoImpl;
import daoimpl.UsersDaoImpl;
import entity.Rooms;
import entity.Users;

public class Tenement_Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("�Ƶ�Ԥ��-����");
		
		JLabel jl=new JLabel("�û���");
		jl.setBounds(50, 20, 70, 20);
		JLabel jl1=new JLabel("�绰��");
		jl1.setBounds(50, 50, 70, 20);
		JLabel jl2=new JLabel("֤����");
		jl2.setBounds(50, 80, 70, 20);
		JLabel jl3=new JLabel("�����");
		jl3.setBounds(50, 110, 70, 20);
		JLabel jl4=new JLabel("��סʱ��");
		jl4.setBounds(50, 140, 70, 20);
		JLabel jl5=new JLabel("�뿪ʱ��");
		jl5.setBounds(50, 170, 70, 20);
		
		final JTextField jt=new JTextField();
		jt.setBounds(100, 20, 150, 20);
		final JTextField jt1=new JTextField();
		jt1.setBounds(100, 50, 150, 20);
		final JTextField jt2=new JTextField();
		jt2.setBounds(100, 80, 150, 20);
		final JTextField jt3=new JTextField();
		jt3.setBounds(100, 110, 150, 20);
		final JTextField jt4=new JTextField();
		jt4.setBounds(100, 140, 150, 20);
		final JTextField jt5=new JTextField();
		jt5.setBounds(100, 170, 150, 20);

		JButton j1=new JButton("�ύ");
		j1.setBounds(90, 200, 60, 20);
		j1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=jt.getText();
				String tel=jt1.getText();
				String idnumber=jt2.getText();
				
				int number=Integer.parseInt(jt3.getText());//��ȡ�����
				String day1=jt4.getText();
				String day2=jt5.getText();
				int day=Integer.parseInt(day2)-Integer.parseInt(day1);//��ȡ����
				
				Rooms room=new Rooms(number);
				RoomsDaoImpl m=new RoomsDaoImpl();
		
				int money=m.show(number);//��ȡ����
				if(number>0&&day>0&&name.length()>0&&tel.length()>0&&idnumber.length()>0){
					JOptionPane.showMessageDialog(null, "Ԥ���ɹ����ܼۣ�"+money*day+" �븶�");
					m.borrow(number);
					new Pay_Gui().main(null);
				}else{
					JOptionPane.showMessageDialog(null, "Ԥ��ʧ�ܣ��밴Ҫ����д��Ϣ��");
				}
			}
		});
		JButton j2=new JButton("����");
		j2.setBounds(190, 200, 60, 20);
		j2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				/*jt1.setText(null);
				if(e.getSource()==j2){
					jt1.setText(" ");
					jt2.setText(" ");
					jt3.setText(" ");
					jt4.setText(" ");
					jt5.setText(" ");
				}*/
			}
		});
		JTable jTable1 = new javax.swing.JTable();
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { 
						{ 1, 11, "�󴲷�",99+"+" },
						{ 2, 22, "���˼�",99+"+" }, 
						{ 3, 33, "˫�˼�",99+"+"},
						{ 4, 44, "�������˼�",99+"+" },
						{ 5, 55, "�����󴲷�",99+"+" },
						{ 6, 66, "����˫�˼�",99+"+" },
						{ 7, 77, "��ͳ�׷�",99+"+" },
						}, 
						new String[] 
						{ "�����","�۸�", "���","ʣ��" }));
		jTable1.setAlignmentX(1.0F);
		jTable1.setBounds(50, 250, 250, 80);
		JScrollPane js=new JScrollPane(jTable1);
		js.setBounds(50, 250, 250, 80);
		Container con=new Container();
		con.add(js);
		con.add(jl);
		con.add(jl1);
		con.add(jl2);
		con.add(jl3);
		con.add(jl4);
		con.add(jl5);
		con.add(j1);
		con.add(j2);
		con.add(jt);
		con.add(jt5);
		con.add(jt1);
		con.add(jt2);
		con.add(jt3);
		con.add(jt4);
		jf.add(con);
		jf.setSize(350,400);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		
		
	}

}
