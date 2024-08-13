package core_java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Swingprac {
	public static void main(String[] args) {
		JFrame f1 = new JFrame("snehal");
		JTextField tf = new JTextField();
		Icon i = new ImageIcon("C:\\eclipse\\12345678.jpg");
		JButton b1 = new JButton(i);

		b1.setBounds(50,100,120, 120);
		tf.setBounds(133, 340, 180, 50);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("welcome");
				
			}
		});
		
		
		
		f1.setVisible(true);
		f1.setSize(900, 600);
		f1.setLayout(null);
		f1.add(b1);
		f1.add(tf);
	
	
	}

}
