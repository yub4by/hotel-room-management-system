package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import daoimpl.RoomsDaoImpl;
import entity.Rooms;

public class GetPass_Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("�Ƶ�Ԥ��-��Կ");
		
		JLabel jl=new JLabel("�����");
		jl.setBounds(50, 20, 70, 20);
		
		final JTextField jt=new JTextField();
		jt.setBounds(100, 20, 150, 20);
		
		JButton j1=new JButton("ȷ��");
		j1.setBounds(100, 60, 60, 20);
		j1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				int number=Integer.parseInt(jt.getText());
				Rooms room=new Rooms(number);
				RoomsDaoImpl a=new RoomsDaoImpl();
				int roompass1=a.getPass(number);
				if(roompass1>0||jt.getText().length()>0){
					JOptionPane.showMessageDialog(null, number+"�ŷ������Կ��"+roompass1);
				}else{
					JOptionPane.showMessageDialog(null, "��ѯʧ�ܣ��밴Ҫ����д��Ϣ��");
				}	
			}
		});
		Container con=new Container();
		con.add(jt);
		con.add(jl);
		con.add(j1);
		jf.add(con);
		jf.setSize(300,150);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
	}

}
