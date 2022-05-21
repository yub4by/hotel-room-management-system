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

public class Indexadmin_Gui extends JFrame {
	public  Indexadmin_Gui(){
		JLabel jlpic = new JLabel();
        JPanel jPanel = new JPanel();
        this.getPreferredSize();
        ImageIcon icon = new ImageIcon("picture/666.png");
        jlpic.setIcon(icon);
        jPanel.add(jlpic);
        this.add(jPanel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//1.菜单栏
		JMenuBar jbar=new JMenuBar();
		this.setJMenuBar(jbar);
		//2.菜单
		JMenu menu=new JMenu("用户管理");
		jbar.add(menu);
		JMenu menu1=new JMenu("房间管理");
		jbar.add(menu1);
		JMenu menu2=new JMenu("帮助");
		jbar.add(menu2);
		//3.菜单项
		JMenuItem item=new JMenuItem("房间维护");
		menu1.add(item);
		item.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ReduceRooms_Gui().main(null);
			}
		});
		JMenuItem item1=new JMenuItem("增加房间");
		menu1.add(item1);
		item1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new AddRooms_Gui().main(null);
			}
		});
		JMenuItem item2=new JMenuItem("拉黑用户");
		menu.add(item2);
		item2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ReduceUsers_Gui().main(null);
			}
		});
		JMenuItem item3=new JMenuItem("设置权限");
		menu.add(item3);
		item3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new AddAdmins_Gui().main(null);
			}
		});
		JMenuItem item5=new JMenuItem("功能简介");
		menu2.add(item5);
		item5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Aboutadmin_Gui().main(null);
			}
		});
		JMenuItem item6=new JMenuItem("联系我们");
		menu2.add(item6);
		item6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Contact_Gui().main(null);
			}
		});
		
		this.setTitle("酒店预订系统-管理员");
		this.setLocation(100, 100);
		//this.setSize(700, 500);
		this.setVisible(true);
	}
}
