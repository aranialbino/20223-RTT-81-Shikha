package practiceAssignment303_7_1;

import java.util.Arrays;

public class AssignmentOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1: Write a program that creates an array of integers with a length of 3.
		// Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		int[] i = { 1, 2, 3 };
		System.out.println("value of first index ::\t" + i[0]);
		System.out.println("value of first index ::\t" + i[1]);
		System.out.println("value of first index ::\t" + i[2]);

		for (int j = 0; j < i.length; j++) {
			System.out.println("j=" + i[j]);

			// Task 2: Write a program that returns the middle element in an array. Give the
			// following values to the integer array: {13, 5, 7, 68, 2} and produce the
			// following output: 7
		}
		int[] a = { 13, 5, 7, 68, 2 };
		int len = a.length;

		int middleElement = len / 2;
		System.out.println("middleElement:\t" + a[middleElement]);

		// Task 3: Write a program that creates an array of String type and initializes
		// it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array
		// length. Make a copy using the clone( ) method. Use the Arrays.toString( )
		// method on the new array to verify that the original array was copied.
		String[] str = { " red", "green", "blue", "yellow" };
		int str_length = str.length;
		System.out.println(str_length);
		String[] targetArray = str.clone();
		System.out.println("targetArray values:\t " + Arrays.toString(targetArray));
		System.out.println("str values:\t " + Arrays.toString(str));

//Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers). 
		// The numbers can be any integers. Print out the value at the first index and
		// the last index using length
		// - 1 as the index. Now try printing the value at index = length (e.g.,
		// myArray[myArray.length] ).
		// Notice the type of exception which is produced. Now try to assign a value to
		// the array index 5.
		// You should get the same type of exception.

		int[] integer = { 1, 2, 3, 4, 5 };
		System.out.println("First index = " + integer[0]);

		System.out.println("last index = " + integer[integer.length - 1]);

		// Task 6: Write a program where you create an integer array of 5 numbers.
		// Loop through the array and assign the value of the loop control variable
		// multiplied by 2
		// to the corresponding index in the array.

		int[] num = { 1, 2, 3, 4, 5 };
		for (int j = 0; j < num.length; j++) {
			num[j] = j * 2;
		}
		System.out.println(Arrays.toString(num));

		// Task 7: Write a program where you create an array of 5 elements.
		// Loop through the array and print the value of each element, except for the
		// middle (index 2) element.
		int[] num1 = new int[] { 1, 2, 3, 4, 5 };
		int length = num1.length;
		int middleIndex = length / 2;//2
		for (int j = 0; j < length; j++) {
			int k = num1[j];
			if (j != middleIndex) {
				System.out.println( k);
			}
		}
	}

}
