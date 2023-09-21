package variables;

import java.util.Scanner;

public class ScannerC {

	public static void main(String[] strs) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int myInt1 = scanner.nextInt();
		int myInt2 = scanner.nextInt();
		int myInt3 = scanner.nextInt();

		scanner.close();

		System.out.println("myString is: " + myInt1);
		System.out.println("myString is: " + myInt2);
		System.out.println("myString is: " + myInt3);

		System.out.println("myInt is: " + myInt1);

	}

}
