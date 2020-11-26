package baiswingdautien;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class bai1
{
	public static void main(String[] args) 
	{
		JFrame f;
		f = new JFrame();
		JButton b = new JButton("YES");
		JTextArea t = new JTextArea();
		t.setBounds(100,50,100,40);
		b.setBounds(120,50,100,40);
		f.add(b);
		f.add(t);
		f.setSize(500,600);
		f.setLayout(null);
		f.setVisible(true);
	}
}
