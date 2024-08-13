package core_java;

public class StringClassDemo {
	public static void main(String[] args) {
		String s1 = "snehal bhavsar";
		String s2 = "Snehal Bhavsar";
		System.out.println(s1);
		String name = new String("Snehal bhavsar");
		System.out.println(name);
		System.out.println(s1.charAt(7));
		System.out.println(s1.codePointBefore(3));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.indexOf(5));
		System.out.println(s1.concat(name));
		System.out.println(s1);
		System.out.println(s1.contains("rr"));
		System.out.println(s1.endsWith("r"));
		System.out.println(s2.isEmpty());
	    String s3 =" ";
	    System.out.println(s3);
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		System.out.println(s2.replace("s", "e"));
		System.out.println(s2.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
	}
	
	

}
