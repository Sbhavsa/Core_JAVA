package core_java;

class aa{
	int i,j;
	aa(){
		System.out.println("default");
	}
	aa(int i,int j){
		this.i=i;
		this.j=j;
		System.out.println("para cons..");
	}
	aa(String p){
		System.out.println("string cons...");
	}
	public void call() {
		System.out.println(i+","+j);
	}
}
class a{
	int i,j;
	a(aa s){
		this.i=s.i;
		this.j=s.j;
		System.out.println("copy cons...");
	}
	public void calling() {
		System.out.println("i="+i+"j="+j);
		
	}
	
}

public class constructor {
  public static void main(String[] args) {
	aa a1=new aa(1,3);
	a1.call();
	a a2 = new a(a1);
	a2.calling();
}
}
