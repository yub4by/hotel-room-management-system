package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aboutadmin_Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("管理员-功能简介");
		JLabel jl1=new JLabel("拉黑用户：删除有不良记录的顾客不允许再次登录");
		jl1.setBounds(40, 50, 300, 20);
		JLabel jl2=new JLabel("设置权限：设置新加入内部的系统工作人员为管理员");
		jl2.setBounds(40, 80, 300, 20);
		JLabel jl3=new JLabel("房间维护：房间设施维修或装修时暂不提供外订");
		jl3.setBounds(40, 110,300, 20);
		JLabel jl4=new JLabel("增加房间：添加新装修好的或新类型房间以供外订");
		jl4.setBounds(40, 140, 300, 20);
		JLabel jl5=new JLabel("帮助：内有功能简介和联系我们模块");
		jl5.setBounds(40, 170, 250, 20);
		
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