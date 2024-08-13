package core_java;

public class commandlineargument {
 public static void main(String[] args) {
	System.out.println(args[0]);
	int num1 = Integer.parseInt(args[1]);
	int num2 = Integer.parseInt(args[2]);
	
	int add = num1+num2;
	System.out.println(add);
	
	
}
}
