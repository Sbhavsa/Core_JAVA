package core_java;
class overloading{
	public void run() {
		System.out.println("hello");
	}
	public void run(int i) {
		System.out.println(i);
	}
	public void run(int i,int j) {
		System.out.println(i+j);
	}
}
public class polymorphism {
	public static void main(String[] args) {
		overloading o1=new overloading();
		o1.run();
		o1.run(12 );
		o1.run(12, 12);
		overriding s1 = new overriding();
		s1.sneha(2, 3);
		overriding1 s2 = new overriding1();
		s2.sneha(2, 3);
	}
}
class overriding{
	public void sneha(int i,int j) {
		System.out.println(i+j);
	}
}
class overriding1{
	public void sneha(int i,int j) {
		System.out.println(i-j);
	}
}