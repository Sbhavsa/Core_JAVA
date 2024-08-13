package core_java;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class swingDemo implements ActionListener{
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4;
	public  swingDemo() {
		JFrame fr = new JFrame("my project");
		fr.setVisible(true);
		fr.setSize(600, 500);
		fr.setLayout(null);
		
		l1 = new JLabel("Id:");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);
		l2 = new JLabel("Name:");
		l2.setBounds(100, 120, 120, 20);
		fr.add(l2);
		l3 = new JLabel("Email:");
		l3.setBounds(100, 140, 120, 20);
		fr.add(l3);
		l4 = new JLabel("Address:");
		l4.setBounds(100, 160, 120, 20);
		fr.add(l4);
		t1 = new JTextField();
		t1.setBounds(200, 100, 120, 20);
		fr.add(t1);
		t2 = new JTextField();
		t2.setBounds(200, 120, 120, 20);
		fr.add(t2);
		t3 = new JTextField();
		t3.setBounds(200, 140, 120, 20);
		fr.add(t3);
		t4 = new JTextField();
		t4.setBounds(200, 160, 120, 20);
		fr.add(t4);
		b1=new JButton("Insert");
		b1.setBounds(150, 180, 120, 30);
		fr.add(b1);
		b2=new JButton("search");
		b2.setBounds(280, 180, 120, 30);
		fr.add(b2);
		b3=new JButton("update");
		b3.setBounds(150, 220, 120, 30);
		fr.add(b3);
		b4=new JButton("delete");
		b4.setBounds(280, 220, 120, 30);
		fr.add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
//		b1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				t1.setText(null);
//				
//			}
//		});
	}
	public static void main(String[] args) {
		new swingDemo();		
		}
	public static Connection Createconection() {
		Connection conn = null;
		try {
			class.ForName()
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
