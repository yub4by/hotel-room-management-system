package gui;

/*import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pay_Gui {

	*//**
	 * @param args
	 *//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("酒店预订-付款");
		new Pay_Gui();
		
		JLabel jl1=new JLabel("房间号："+number);
		jl1.setBounds(50, 50, 200, 20);
		JLabel jl2=new JLabel("类    别："+style);
		jl2.setBounds(50, 80, 200, 20);
		JLabel jl3=new JLabel("单    价："+price);
		jl3.setBounds(50, 110, 200, 20);
		JLabel jl4=new JLabel("天    数："+day);
		jl4.setBounds(50, 140, 200, 20);
		JLabel jl5=new JLabel("需    付："+day*price);
		jl5.setBounds(50, 170, 200, 20);
		JLabel jl=new JLabel();
		Image im=new ImageIcon("picture\3.png").getImage();
		jl.setIcon(new ImageIcon(im));
		jl.setBounds(50, 100, 200, 200);
		JLabel jlpic = new JLabel();
        JPanel jPanel = new JPanel();

 
        //jf.setLayout(null);
        //jf.getPreferredSize();
        jf.setSize(1000,500);
        ImageIcon icon = new ImageIcon("picture/1.jpg");
        jlpic.setIcon(icon);
        jPanel.add(jlpic);
        jf.add(jPanel);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    
	
		JButton j=new JButton("确定付款");
		j.setBounds(200, 200, 100, 20);
		j.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "付款成功，请按时持有效证件入住！");
				System.exit(0);
			}
		});
		
		Container con=new Container();
		con.add(jl1);
		con.add(jl2);
		con.add(jl3);
		con.add(jl4);
		con.add(jl5);
		con.add(jl);
		con.add(j);
		jf.add(con);
		/*jf.setSize(350,300);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		jf.add(con);
		
	}

}
*/
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Pay_Gui {


	/**
	 * @param args
	 */
    public static void main(String[] args) {
        new Pay_Gui();
        JLabel jlpic = new JLabel();
        JPanel jPanel = new JPanel();
        JFrame jframe = new JFrame("酒店预订-付款");
        //jframe.setLayout(null);
        //jframe.getPreferredSize();
        jframe.setSize(1000,200);
        ImageIcon icon = new ImageIcon("picture/1.png");
        //jframe.pack();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JButton j=new JButton("确定付款");
//		j.setBounds(200, 200, 100, 20);
//		j.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				JOptionPane.showMessageDialog(null, "付款成功，请按时持有效证件入住！");
//				System.exit(0);
//			}
//		});
//		jlpic.add(j);
		jlpic.setIcon(icon);
        jPanel.add(jlpic);
        jframe.add(jPanel);
        jframe.setVisible(true);
//        Container con=new Container();
//        con.add(j);
       
    }	
}

