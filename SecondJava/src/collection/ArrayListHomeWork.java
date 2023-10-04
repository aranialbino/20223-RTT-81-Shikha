package collection;

import java.util.ArrayList;

public class ArrayListHomeWork {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
//fetching for length
		System.out.println(ar.size());//Getting length
		System.out.println(ar.indexOf(20));//Getting index number
		System.out.println(ar.get(3));// getting value
		System.out.println(ar.remove(3));//removing number 3
		
for(int i =0 ; i < ar.size(); i++) {

	System.out.print(","+ar.get(i));//index 3 will not come because we removed it
}
//for loop for getting all values together.

	//Generic examples
	//only for ientegers
	ArrayList <Integer> ar1 =  new ArrayList<Integer>();
	ar1.add(100);//correct,  it will take only integer
	//ar1.add("cat");// wrong ,no String value
	ArrayList<String>ar2 = new ArrayList<String>();
	ar2.add("Car");// String ArrayList
	
	// for unkown data type
	//ArrayList<E> ar3 = new ArrayList();
	//ar3.add(100);




	}

}
