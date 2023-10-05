package stringGlab;

public class StringBufferAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb = new StringBuffer("135");
		System.out.println(sb);
		sb.replace(0, 5, "6789");
		System.out.println(sb);

		sb.insert(0, "12345");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		sb.delete(0, 5);
		System.out.println(sb);

		
		System.out.println(sb.toString());

	}
}
		// TODO Auto-generated method stub
		
	


