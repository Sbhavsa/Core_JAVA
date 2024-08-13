package core_java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Swing {
	public static void main(String[] args) {
		JFrame f = new JFrame("My project");
		JTextField tf = new JTextField();
		tf.setBounds(600, 100, 120, 100);
		f.setVisible(true);
		f.setSize(900, 900);
		f.setLayout(null);
		JButton b1 = new JButton("click");
		b1.setBounds(500, 90, 100, 99);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("welcome");
			}
		});
		f.add(b1);
		f.add(tf);
		
		
	}

}
