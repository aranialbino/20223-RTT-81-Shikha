package arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraysize = 10;
		double[] doublearray = new double[arraysize];
		String[] stringarray = new String[arraysize];
		stringarray[1] = "one";
		stringarray[2] = "two";
		stringarray[3] = "zero";
		stringarray[4] = "nine";
		

		for (int pos = 0; pos < stringarray.length; pos++) {

			System.out.println("the value in position " + pos + "is+" + stringarray[pos]);

		} // enhanced forloop
		System.out.println("====================");
		for (String value : stringarray) {
			System.out.println("The value = " + value);

			System.out.println("====================");
		}
//for(String value ;stringArray){

		int nullCount = 0;
		for (String value : stringarray) {
			if (value == null) {
				nullCount++;
			}
		}
		System.out.println("Number of nulls is " + nullCount);

		int firstNull = -1;
		for (int pos = 0; pos < stringarray.length; pos++) {
			if (stringarray[pos] == null) {
				firstNull = pos;
				break;
			}
		}
		//HOMEWORK
		System.out.println("Index of first nulls is  " + firstNull);

//value of which are not null
		int nullNotCount = 0;
		for (String value : stringarray) {
			if (value != null) {
				nullNotCount++;
			}
		}
		System.out.println("Number of not nulls is " + nullNotCount);

		// // write a for loop that tells me the last position of null in the array
		int lastNullIndex = -1;
		for (int pos = 0; pos < stringarray.length; pos++) {
			if (stringarray[pos] == null) {
				lastNullIndex = pos;
				continue;
			}

		}			System.out.println("Index of last nulls is  " + lastNullIndex);


	}

}