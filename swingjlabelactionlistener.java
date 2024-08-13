package core_java;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class swingjlabelactionlistener {
	JTextField t1;
	JLabel l1;
	JButton b1;
	swingjlabelactionlistener(){
		t1= new JTextField();
		 t1.setBounds(50,50, 150,20);  
		 l1 = new JLabel();
		 l1.setBounds(50, 50, 150, 20);
		 b1 = new JButton("sneha");
	     b1.setBounds(50,150,95,30);
	     b1.addActionListener(this);
	     

	}

}
