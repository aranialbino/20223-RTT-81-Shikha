package arrays;

public class StringBufferExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x = "abcxyz";
String x1 = x.substring(0,3)+ "123" + x.substring(3);
//change x from abc123xyz to abcxyz


String y = x.toUpperCase();
System.out.println(x1);
StringBuffer buffer = new StringBuffer ();
buffer.append("abc");
buffer.append("xyz");
buffer .reverse();
String sub = buffer.substring(0 ,3);
buffer.insert(0," 123");
// replace some character in spring buffer


System.out.println(buffer.toString());

	}

}
