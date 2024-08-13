package core_java;

import java.util.Scanner;

public class Arraydemo {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	for(int index = 0; index < arr.length ; index++) {
		System.out.println(arr[index]);
	}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your array size:");
		int size = sc.nextInt();
		int a[]=new int[size];
			for(int i=0;i<a.length;i++) {
				System.out.println("enter element at a["+i+"]");
				a[i]=sc.nextInt();
			}
			int addition = 0;    //addition
			for(int i=0;i<a.length;i++) {
				addition = addition + a[i];
			}
			System.out.println(addition);
			int num;
			System.out.println("enter number search  in array");
			num=sc.nextInt();
			int counter=0;
				for(int i=0;i<a.length;i++) {
					if(num == a[i]) {
						counter++;
						break;
					}
				}
				if(counter==1) {
					System.out.println("yes");
				}
				else {
					System.out.println("No");
				}	
		}
}
