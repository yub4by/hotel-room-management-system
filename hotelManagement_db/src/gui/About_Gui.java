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
		JFrame jf=new JFrame("�Ƶ�Ԥ��-���ܼ��");
		JLabel jl1=new JLabel("��½����½��ϵͳ��ɽ��ж����˷���һϵ�в���");
		jl1.setBounds(40, 50, 300, 20);
		JLabel jl2=new JLabel("ע�᣺�ɹ�ע�����Ե�¼��ϵͳ");
		jl2.setBounds(40, 80, 250, 20);
		JLabel jl3=new JLabel("�������ɹ�ѡ����п��෿�����𵥼ۺ͸���");
		jl3.setBounds(40, 110,300, 20);
		JLabel jl4=new JLabel("�������˷��ɹ������뿪����ӭ�ٴ�ʹ��");
		jl4.setBounds(40, 140, 250, 20);
		JLabel jl5=new JLabel("���������й��ܼ�����ϵ����ģ��");
		jl5.setBounds(40, 170, 250, 20);
		
		JButton j=new JButton("ȷ��");
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
