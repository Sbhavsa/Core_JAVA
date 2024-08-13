package core_java;

class snehal{
	int i;
	String name;
	void sneha() {
		System.out.println("enter i"+i+"enter name"+name);
	}
}
public class classObject {
	public static void main(String[] args) {
		snehal s1= new snehal();
		s1.i=24;
		s1.name="snehal bhavsar";
		s1.sneha();
		snehal s2 = new snehal();
		s2.i=25;
		s2.name="prerna";
		s2.sneha();
	}

}
