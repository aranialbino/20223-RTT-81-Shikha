package exceptions;

import java.util.Scanner;

public class ExceptionExamples { 

	public static void main(String[] args) {
			ExceptionExamples ee = new ExceptionExamples();
			try {
				ee.readNumber();
				String x = null;
				x.toUpperCase();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		// TODO Auto-generated method stub
		public void readNumber()throws Exception{
Scanner scanner = new Scanner(System.in);


try {
	System.out.println("Please enter a number:");
	int x = scanner.nextInt();
	System.out.println("you entered a number:"+ x);

} catch (Exception e) {
	System.out.println("You did not enter a number");
	throw new Exception("The user did not enter a number");
}finally {
	//this code executes no matter what
	System.out.println("this executes no matter what:");

}
		
	}

}
