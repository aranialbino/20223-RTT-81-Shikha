package arrays;

import java.util.Arrays;

public class AdvancedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = { 3.0, 3.4, 4.3, 4.5 };
		String[] strings = { "one", "two", "three" };
		String str = "were";
		str.toUpperCase();
		//sorting method
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
		double min = numbers[0];
		double max = numbers[0];
		for (double number : numbers) {
			if (number < min) {
				min = number;
			}
			if (number > max) {
				max = number;

			}
		}
		System.out.println("min=" + min);
		System.out.println("max=" + max);

	}

}
