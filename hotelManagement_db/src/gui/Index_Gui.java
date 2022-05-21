package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import daoimpl.UsersDaoImpl;
import entity.Users;

public class Index_Gui extends JFrame {
	public  Index_Gui(){
		JLabel jlpic = new JLabel();
        JPanel jPanel = new JPanel();
        this.getPreferredSize();
        ImageIcon icon = new ImageIcon("picture/666.png");
        jlpic.setIcon(icon);
        jPanel.add(jlpic);
        this.add(jPanel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//1.�˵���
		JMenuBar jbar=new JMenuBar();
		this.setJMenuBar(jbar);
		//2.�˵�
		JMenu menu=new JMenu("�û�����");
		jbar.add(menu);
		JMenu menu1=new JMenu("�������");
		jbar.add(menu1);
		JMenu menu2=new JMenu("����");
		jbar.add(menu2);
		//3.�˵���
		JMenuItem item=new JMenuItem("��½");
		menu.add(item);
		item.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Login_Gui().main(null);
			}
		});
		JMenuItem item1=new JMenuItem("ע��");
		menu.add(item1);
		item1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Register_Gui().main(null);
			}
		});
		JMenuItem item7=new JMenuItem("�޸�����");
		menu.add(item7);
		item7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new FixPass_Gui().main(null);
			}
		});
		
		JMenuItem item2=new JMenuItem("����");
		menu1.add(item2);
		item2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Tenement_Gui().main(null);
			}
		});
		JMenuItem item3=new JMenuItem("�˷�");
		menu1.add(item3);
		item3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Replace_Gui().main(null);
			}
		});
		JMenuItem item4=new JMenuItem("�����Կ");
		menu1.add(item4);
		item4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new GetPass_Gui().main(null);
			}
		});
		
		JMenuItem item5=new JMenuItem("���ܼ��");
		menu2.add(item5);
		item5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new About_Gui().main(null);
			}
		});
		JMenuItem item6=new JMenuItem("��ϵ����");
		menu2.add(item6);
		item6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Contact_Gui().main(null);
			}
		});
		
		this.setTitle("�Ƶ�Ԥ��ϵͳ");
		this.setLocation(100, 100);
		//this.setSize(700, 500);
		this.setVisible(true);
	}
}
