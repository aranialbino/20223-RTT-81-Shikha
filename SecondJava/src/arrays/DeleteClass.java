package arrays;

import java.util.Arrays;

public class DeleteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 0, 1, 2, 3, 4, 5 };

		int positionToDeelete = 1;
		for (int pos = positionToDeelete; pos < numbers.length - 1; pos++) {
			numbers[pos] = numbers[pos + 1];// 0, 2 3 4 
		}

		System.out.println("after move =" + Arrays.toString(numbers));

		int[] target = new int[numbers.length - 1];
		for (int pos = 0; pos < target.length ; pos++) {
			target[pos] = numbers[pos];
		}
		System.out.println("after move =" + Arrays.toString(target));

	}
}