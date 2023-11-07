package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListHomeWork {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList(20);
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(100);
//fetching for length
		System.out.println(ar.size());// Getting length
		System.out.println(ar.indexOf(20));// Getting index number
		System.out.println(ar.get(3));// getting value
		System.out.println(ar.remove(3));// removing number 3

		for (int i = 0; i < ar.size(); i++) {

			System.out.println("," + ar.get(i));// index 3 will not come because we removed it
		}
			// Generic types
			ArrayList<Integer> marksList = new ArrayList<>();
			marksList.add(20);
			// marksList.add("sita");you can not put String value in it.
			ArrayList<Double> marksList1 = new ArrayList<>();
			marksList1.add(10.23);
			// marksList1.add(10); // store only double value

			// how to iterrate
			ArrayList<String> studentList = new ArrayList<>();
			studentList.add("Tom");
			studentList.add("Naveen");
			studentList.add("Steve");
			studentList.add("Lisa");
			// typical for loop
			for (int j = 0; j < studentList.size(); j++) {
				System.out.println(studentList.get(j));
			}
			System.out.println("-----------------");

			// for enhance loop
			for( String st : studentList ) {
				System.out.println(st);
			}	
			System.out.println("*****------------");

				// stream with lambda function
				studentList.stream().forEach(ele ->  System.out.println(ele));
				
				System.out.println("########");
				
				 // iterator :
			Iterator<String> it = studentList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
				
				
				//list with other collections
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
	
