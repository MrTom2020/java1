package lethanhhiep_1824801030217_th5;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class bai3 extends JFrame
{
	public bai3()
	{
		super();
		JPanel p = new JPanel();
		p.setSize(400, 500);
		p.setBackground(Color.black);
		JButton btn = new JButton("THEM");
		JTextArea txt = new JTextArea(60,40);
		txt.setBounds(300,10,200,100);
		btn.setBounds(100,40,200,100);
		
		btn.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				JButton btn1 = new JButton(txt.getText().toString());
				p.add(btn1);
			}
		});
		p.add(txt);
		p.add(btn);
		
		Container con = getContentPane();
		con.add(p);
		
	}
	public static void main(String[] args)
	{
		bai3 b3 = new bai3();
		b3.setSize(600, 700);
		b3.setVisible(true);
	}
}
