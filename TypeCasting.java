package core_java;

public class TypeCasting {
	public static void main(String[] args) {
		int i;
		i=10;
		System.out.println(i );
		String s = String.valueOf(i);
		System.out.println(s);
		float f = 10.3f;
		double d = 34.78;
		String w = String.valueOf(f);
		String q = String.valueOf(d);
		System.out.println(w);
		System.out.println(q);
		String name="123";
		int u = Integer.parseInt(name);
		System.out.println(u);
		int h = (int)f;
		System.out.println(h);
		
	}

}
