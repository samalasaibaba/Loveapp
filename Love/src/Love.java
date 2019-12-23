import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Love extends JFrame implements ActionListener {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	JLabel jl1, jl2, jl3, jl4, jl5;
	JButton b1, b2, b3;
	JTextField jtf;
	// I'm a new code!!!
	Love() {    
		setLayout(null);

		jl1 = new JLabel("Welcome to My World..!");
		jl2 = new JLabel("Hey Hi, I Want to Tell You Somthing..!");

		jl3 = new JLabel("Developed @Sai");
		jl4 = new JLabel("version 1.0");
		jl5 = new JLabel("Copyright © Dreamer's Softech");

		b1 = new JButton("Accept");
		b2 = new JButton("Reject");
		b3 = new JButton("Press Here to Know..!");
		jtf = new JTextField(20);

		jl1.setBounds(150, 0, 500, 50);
		jl2.setBounds(120, 20, 500, 50);
		b3.setBounds(120, 70, 200, 30);
		jtf.setBounds(120, 120, 200, 30);
		b1.setBounds(100, 180, 100, 30);
		b2.setBounds(250, 180, 100, 30);

		jl3.setBounds(280, 220, 200, 30);
		jl4.setBounds(310, 240, 200, 30);
		jl5.setBounds(200, 260, 200, 30);

		b3.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);

		add(jl1);
		add(jl2);
		add(b3);
		add(jtf);
		add(b1);
		add(b2);
		add(jl3);
		add(jl4);
		add(jl5);

		b1.setBackground(Color.green);
		b1.setForeground(Color.blue);

		b2.setBackground(Color.red);
		b2.setForeground(Color.blue);

		b3.setBackground(Color.pink);
		b3.setForeground(Color.blue);

		setSize(500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		new Love();
		System.out.println("Test Git..!");
	}

	public void actionPerformed(ActionEvent ae) {
		jtf.setText("I Love You..!");

		Object src = ae.getSource();
		if (src == b1) {
			JOptionPane.showMessageDialog(this, "Thanks for Accepting My Love proposal..!");
		}
		if (src == b2) {
			JOptionPane.showMessageDialog(this, "Thanks for Giving Ur Opinion..!");
		}
	}
}
