package stringGlab;

public class StringMethods {

	public static void main(String[] args) {
		// 1& 2 // TODO Auto-generated method stub
		String a = "HELLO";
		String b = "java";
		String c = "";
		String d = "java";
		System.out.println(a + b);
		System.out.println(a.length());
		System.out.println("hello".length());
		System.out.println(c.isEmpty());
		System.out.println(a.isEmpty());
		System.out.println(a + "how are you");
		System.out.println(a.trim() + "how are you");
		String alower = a.toLowerCase();
		System.out.println(alower);
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(a.concat(b));
		System.out.println(a.compareTo(b));
		int result;
		result = a.lastIndexOf("Java");
		System.out.println(result);
		result = b.indexOf("v");
		System.out.println(result);
	boolean result1 = a.contains("java");
	System.out.println(result1);
	System.out.println(a.replace('L','H'));
	System.out.println(a.equals(c));
	System.out.println(a.compareTo(c));
	System.out.println(b==(d));

}}
