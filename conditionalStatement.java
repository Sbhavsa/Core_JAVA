package core_java;

import java.util.Scanner;

public class conditionalStatement {
	public static void main(String[] args) {
		int i,j;
		System.out.println("enter first no:");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.println("enter second no:");
		j = sc.nextInt();
		
		if(i>j) {
			System.out.println("i is big");
		}
		if (i>j) {
			System.out.println("i is big");
		} else {
			System.out.println("j is small");

		}
		System.out.println("enter your age:");
		int age ;
		age = sc.nextInt();
		if(age<70) {
			if(age>30) {
				System.out.println("work");
			}
			else {
			System.out.println("not work");	
			}
		}
		else {
		System.out.println("never work");	
		}
		
		if(age<90 && age>80) {
			System.out.println("90");
		}
		else if (age<80  &&  age>70) {
			System.out.println("80");
		}
		else if (age<70 && age>60) { 
			System.out.println(   "70");
		}
		else {
			System.out.println("10");
		}
		System.out.println("enter your day number:");
		int casee;
		casee = sc.nextInt();
		switch (casee) {
		case 1: {
		 System.out.println("1 ");
		 break;
		}
		case 2:{
			System.out.println("2");
			break;
		}
		case 3:{
			System.out.println("3");
			break;
		}
		default:{
			System.out.println("noo");
		}
		}
	}
}
