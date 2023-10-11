package collection;

import java.util.ArrayList;

public class ExampleOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arl = new ArrayList<>();

		arl.add(10);// 0
		arl.add(23);// 1
		arl.add(30);// 2
		arl.add(43);// 3
		arl.add(50);// 4
		arl.add(61);// 5
		// len= 6

		int arl_size = arl.size();
		int sumOfOddIndexValues = 0;

		for (int i = 0; i <= (arl_size); i++) {
			if (i ==  i % 2) {
			sumOfOddIndexValues = sumOfOddIndexValues + arl.get(i);
		}
		}
		System.out.println(sumOfOddIndexValues);
		
		//for (int i = arl_size / 2; i < arl_size; i++) {
			//sumOfSecondHalfNumbers = sumOfSecondHalfNumbers + arl.get(i);
		

		//System.out.println("sumOfFirstHalfNumbers= " + sumOfFirstHalfNumbers + " , sumOfSecondHalfNumbers="
				//+ sumOfSecondHalfNumbers);
		//int diff = sumOfFirstHalfNumbers - sumOfSecondHalfNumbers;
		//System.out.println("diff = " + diff);
		
	}
}