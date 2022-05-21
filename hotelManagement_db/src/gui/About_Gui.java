package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About_Gui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("酒店预定-功能简介");
		JLabel jl1=new JLabel("登陆：登陆本系统后可进行订房退房等一系列操作");
		jl1.setBounds(40, 50, 300, 20);
		JLabel jl2=new JLabel("注册：成功注册后可以登录本系统");
		jl2.setBounds(40, 80, 250, 20);
		JLabel jl3=new JLabel("订房：可供选择的有空余房间号类别单价和付款");
		jl3.setBounds(40, 110,300, 20);
		JLabel jl4=new JLabel("还房：退房成功即可离开，欢迎再次使用");
		jl4.setBounds(40, 140, 250, 20);
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
