package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import daoimpl.UsersDaoImpl;
import entity.Users;

public class Login_Gui {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("�Ƶ�Ԥ��-��¼");
		JLabel jl1=new JLabel("�û���");
		jl1.setBounds(50, 50, 70, 20);
		JLabel jl2=new JLabel("��     ��");
		jl2.setBounds(50, 80, 70, 20);
		
		final JTextField jt1=new JTextField();
		jt1.setBounds(100, 50, 150, 20);
		final JTextField jt2=new JTextField();
		jt2.setBounds(100, 80, 150, 20);
		
		JButton j1=new JButton("��½");
		j1.setBounds(90, 150, 60, 20);
		j1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=jt1.getText();
				String password=jt2.getText();
	
				Users user=new Users(name,password);
				UsersDaoImpl x=new UsersDaoImpl();
				if(x.login(user)==true){
					JOptionPane.showMessageDialog(null, "��½�ɹ���");
					if(name.equals("admin")){
						new Indexadmin_Gui();
					}
					else{
						new Index_Gui();
					}
				}else{
					JOptionPane.showMessageDialog(null, "δ�鵽��Ч��Ϣ������ע�ᣡ");
					new Register_Gui().main(null);
				}
			}
		});
		JButton j2=new JButton("ע��");
		j2.setBounds(190, 150, 60, 20);
		j2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					new Register_Gui().main(null);
			}
		});
		
		Container con=new Container();
		con.add(jl1);
		con.add(jl2);
		con.add(j1);
		con.add(j2);
		con.add(jt1);
		con.add(jt2);
		jf.add(con);
		jf.setSize(350,300);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
	}

}
