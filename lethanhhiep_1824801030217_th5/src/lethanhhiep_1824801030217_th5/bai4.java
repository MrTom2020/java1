package lethanhhiep_1824801030217_th5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class bai4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai4 frame = new bai4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bai4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLUE);
		contentPane.add(panel1, BorderLayout.WEST);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.RED);
		contentPane.add(panel2, BorderLayout.NORTH);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.BLUE);
		contentPane.add(panel3, BorderLayout.EAST);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.RED);
		contentPane.add(panel4, BorderLayout.SOUTH);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.YELLOW);
		contentPane.add(panel5, BorderLayout.CENTER);
		
	}

}
