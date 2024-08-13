package core_java;

import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age:");
		s = sc.nextInt();
		System.out.println(s);
		float f;
		System.out.println("enter float number: ");
		f = sc.nextFloat();
		System.out.println(f);
		double d;
		System.out.println("enter double no:");
		d = sc.nextDouble();
		System.out.println(d);
		char c;
		System.out.println("enter your name's fist alphabate:");
		c = sc.next().charAt(0);
		System.out.println(c);
		String p;
		System.out.println("enter name:"); 
		p = sc.next();
		System.out.println(p);
		userInput u1 = new userInput();
		u1.snehal();
	}
public  void snehal() {
	System.out.println("method inside");
}
}
