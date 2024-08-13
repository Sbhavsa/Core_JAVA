package core_java;

public class variable {
	static int s=12;//local variable
	void in() {
		int ss=13;//local variable
		System.out.println(ss);
	}
	public static void main(String[] args) {
		int sss=11;//instance variable
		System.out.println(s);
		System.out.println(sss);
		variable v1 = new variable();
		v1.in();
	
		
	}

}
