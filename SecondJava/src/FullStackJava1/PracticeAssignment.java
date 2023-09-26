package FullStackJava1;

import java.util.Scanner;

public class PracticeAssignment {
//question - 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFirstMethod(args);
	}

	public static void myFirstMethod(String[] args) {
		// TODO Auto-generated method stub
		int x = 15;
		if (x < 10) {
			System.out.println("value of \t\t" + x);
		}
//2. Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
		int xx = 7;
		if (xx < 10) {
System.out.println("less than 10");
		} else if (xx > 10) {
			System.out.println("greater than 10");
		}
		// 3. Write a program that declares 1 integer variable x, and then assigns 15 to
		// it. Write an if-else-if statement that prints out “Less than 10” if x is less
		// than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and
		// “Greater than or equal to 20” if x is greater than or equal to 20. Change x
		// to 50 and notice the result.
		int xo = 15;
		if (xo < 10) {
			System.out.println("less than 10");
		} else if (xo > 10 && xo < 20) {
			System.out.println("Between 10 and 20");
		} else if (xo > 20) {
			System.out.println("greater than 20");
		}

		// 4.4. Write a program that declares 1 integer variable x, and then assigns 15
		// to it. Write an if-else statement that prints “Out of range” if the number is
		// less than 10 or greater than 20 and prints “In range” if the number is
		// between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the
		// result.
		int xl = 15;
		if (xl < 10 || xl > 20) {
			System.out.println("Out of Range");
		} else if (xl > 10 && xl < 20) {
			System.out.println("In range");
		}
		// 5. Write a program that uses if-else-if statements to print out grades A, B,
		// C, D, F, according to the following criteria:
		// A: 90-100
		// : 80-89
		// C: 70-79
		// D: 60-69
		// F: <60
		// Use the Scanner class to accept a number score from the user to determine the
		// letter grade. Print out “Score out of range” if the score is less than 0 or
		// greater than 100.

		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your score: ");
		int score = input.nextInt();
		if (score >= 90 && score <= 100) {
			System.out.println("your score\t A");
		} else if (score >= 80 && score < 90) {
			System.out.println("your score\t \'B\'");
		} else if (score >= 70 && score < 80) {
			System.out.println("your score\t \"C\"");
		} else if (score >= 60 && score < 70) {
			System.out.println("your score\t \"D\"");

		} else if (score >= 0 && score < 60) {
			System.out.println("your score\t \'f\'");

		} else {
			System.out.println("Your score is out of range.");

		};
		input.close();
		// 6:6. Write a program that accepts an integer between 1 and 7 from the user.
		// Use a switch statement to print out the corresponding weekday. Print “Out of
		// range” if the number is less than 1 or greater than 7. Do not forget to
		// include “break” statements in each of your cases.
		
		int day = 2;
		switch (day) {
		case 1:
			System.out.println(" Q:6\t Monday");
			break;
		case 2:
			System.out.println(" Q:6\t Tuesday");
			break;
		case 3:
			System.out.println(" Q:6\t Wednesday");
			break;
		case 4:
			System.out.println("  Q:6\\tThursday");
			break;
		case 5:
			System.out.println(" Q:6\\t Friday");
			break;
		case 6:
			System.out.println(" Q:6\\t Saturday");
			break;
		case 7:
			System.out.println(" Q:6\\t Sunday");
			break;
			default:
				System.out.println(" Q:6\\t Out of range");
				
				//question 7
				
	
		}
		

	}
}
