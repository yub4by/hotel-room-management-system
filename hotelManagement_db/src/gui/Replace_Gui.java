package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import daoimpl.RoomsDaoImpl;
import daoimpl.UsersDaoImpl;
import entity.Rooms;
import entity.Users;

public class Replace_Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("酒店预订-退房");
		
		JLabel jl1=new JLabel("房间号");
		jl1.setBounds(50, 50, 80, 20);
		JLabel jl2=new JLabel("密    码");
		jl2.setBounds(50, 80, 80, 20);
		JLabel jl3=new JLabel("价    格");
		jl3.setBounds(50, 110, 80, 20);
		JLabel jl4=new JLabel("类    别");
		jl4.setBounds(50, 140, 80, 20);
		
		final JTextField jt1=new JTextField();
		jt1.setBounds(110, 50, 120, 20);
		final JTextField jt2=new JTextField();
		jt2.setBounds(110,80, 120, 20);
		final JTextField jt3=new JTextField();
		jt3.setBounds(110, 110, 120, 20);
		final JTextField jt4=new JTextField();
		jt4.setBounds(110, 140, 120, 20);
		
		
		JButton j1=new JButton("提交");
		j1.setBounds(80, 200, 60, 20);
		j1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int number=Integer.parseInt(jt1.getText());
				String roompass=jt2.getText();
				String price=jt3.getText();
				String style=jt4.getText();
				Rooms room=new Rooms(  number);
				RoomsDaoImpl m=new RoomsDaoImpl();
				if(number>0&&roompass.length()>0&&price.length()>0&&style.length()>0){
					m.replace(number);
					JOptionPane.showMessageDialog(null, "退房成功");
					System.exit(0);
					
				}else{
					JOptionPane.showMessageDialog(null, "退房失败，请按要求填写信息！");
					
				}		
			}
		});
		
		
		
		
		
		
		Container con=new Container();
		con.add(jl1);
		con.add(jl2);
		con.add(jl3);
		con.add(jl4);
		con.add(jt1);
		con.add(jt2);
		con.add(jt3);
		con.add(jt4);
		con.add(j1);
		jf.add(con);
		jf.setSize(350,300);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		
		
	}

}
