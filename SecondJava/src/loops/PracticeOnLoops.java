package loops;

public class PracticeOnLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write a for loop that calculates the sum of all the numbers between 1 and 100
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			int prev_sum = sum;
			sum = sum + i;


		}
		System.out.println("sum +i =" + sum);
//2. write a for loop that calculates the sum of the remainders of each number divided by 2 between 1 and 100
int sum1 = 0;
for( int i = 0; i <=100 ; i++ ) {
	int pre_sum = sum1;
	sum1 = sum1 + i % 2 ;
	System.out.println(i + "pre_sum ="+ pre_sum +"new sum = "+sum1 );
}

System.out.println( sum1);

//  write a for loop that calculates the sum of the divisor of each number divided by 2 between 1 and 100

		int sum3 = 0;
		for (int i = 0; i <= 100; i++) {
			sum3 = sum3 + i / 2;

		}
		System.out.println("sum3 +i / 2 =" + sum1);
//write a while loop ...  while a number is greater than 0 subtract 1 from the number starting at 10.

	}
}