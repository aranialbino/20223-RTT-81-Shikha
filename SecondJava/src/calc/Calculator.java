package calc;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a small calculator .. it will be able to do 4 operations - add,
		// subtract, multiply and divide.
		// Each of these will be a single method that does that operation.
		// Ask the user for 2 numbers and then ask the user which operation they want to
		// do.
		// Then do that operation and print the result. Each operation should not print
		// its own results.
		// All operations should work with double values. (edited)
		// So this should be a main function with probably 6 methods ( 4 operations, 1
		// menu, 1 input )
		// each operation should take 2 parameters and return a double ...

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		System.out.println("Enter a operator + , - ,  /  , * ");
		String str = input.next();
		double result;
		switch (str) {

		case "+":
			result = num1 + num2;
			
			System.out.println( num1+" + " +num2+ " = " +result);
			break;

		case "-":
			result = num1 - num2;
			System.out.println ( num1+ " - " +num2+ " = " +result);

			break;

		case "/":
			result = num1 / num2;
			System.out.println( num1+ " / " +num2+ " = " +result);
			break;

		case "*":
			result = num1 * num2;
			System.out.println( num1+ " / " +num2+ " = " +result);
			break;

		default:
			System.out.println(" invalid input");
		}

	}

}
