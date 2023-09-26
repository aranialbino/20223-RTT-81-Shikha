package stringGlab;

public class BreakPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		int num=0;
		while (num<20) {
			num++;
			sum += num ;
			if( sum>= 40) {
				continue;
			}
			System.out.println( "sum=" + sum);
		}
	
	System.out.println( "The number is" + num );
	System.out.println( "The sum is" + sum );


	}

}
