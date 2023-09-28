package arrays;

public class StringJoiners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"a"," b"," c ","d ","e" };
		for(int pos =0 ; pos < arr.length; pos++) {
			System.out.print(arr[pos]);
			if(pos< arr.length-1) {
				System.out.print(",");
				// we dont want , in last
				

			}
		}

	}

}
