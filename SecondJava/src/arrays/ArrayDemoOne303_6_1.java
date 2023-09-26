package arrays;

public class ArrayDemoOne303_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1arraydemoOne

		// create an array
		int[] age = { 12, 4, 5, 2, 5 };
		// access each array elements
		System.out.println("Accessing Elements of an Array:");
		System.out.println("First Element: " + age[0]);
		System.out.println("Second Element: " + age[1]);
		System.out.println("Third Element: " + age[2]);
		System.out.println("Fourth element:" + age[3]);
		System.out.println("Fifth element:" + age[4]);

		// arraydemoTwo
		// create an array
		int[] age1 = { 12, 4, 5 };
		// loop through the array
		// using for loop
		System.out.println("Using for Loop:");
		for (int i = 0; i < age1.length; i++) {
			System.out.println(age[i]);
			//EnhancedForLoop 
			String[] names = { "New York", "Dallas", "Las Vegas", "Florida" };
	           for (String name1:	names ){
	        	   System.out.println(" String names::+name1");
	        	   
	           }
	}

}
