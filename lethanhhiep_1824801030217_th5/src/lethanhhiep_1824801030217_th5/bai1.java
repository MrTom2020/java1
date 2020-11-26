package lethanhhiep_1824801030217_th5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class bai1 extends JFrame
{
	public bai1()
	{
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		bai1 b1 = new bai1();
		b1.setSize(500,500);
		JButton b21 = new JButton("hiep");
		b21.setBounds(130, 50, 100, 40);
		b1.setTitle("hhhh");
		
		b1.add(b21);
		b1.setLayout(null);
		b1.setVisible(true);
		
	}
}
