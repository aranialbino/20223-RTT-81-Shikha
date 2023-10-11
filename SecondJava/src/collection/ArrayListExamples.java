package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {


		// TODO Auto-generated method stub
	public static void main(String[] args) {
		List<String> mylist = new ArrayList<String>();
		
		mylist.add("New Jersey");
		mylist.add("Dallas");
		mylist.add("New York");
		mylist.add("Chicago");
		mylist.add("LA");
		List<String> myList2 = new ArrayList<>();
		myList2.add("Jenny");
		myList2.add("Peter");
		myList2.add("Heena");
		System.out.println(mylist.addAll(myList2));
		System.out.println(mylist.get(5));
for(String value : mylist) {
}
System.out.println("new elwments in mylist::"+ mylist);
String removeMyList2 = mylist.remove(5);
	
		System.out.println("Return boolean :" + mylist.contains("Chicago"));
		System.out.println("Return index value of Element :" + mylist.indexOf("Chicago"));
		System.out.println("Returns the actual Element at the given index :" + mylist.get(2));
		System.out.println("Returns the length of the arraylist :" + mylist.size());
		// Remove the element at the given index. Returns the removed element.
		// remove element at index 3
		String removedElement = mylist.remove(3);
		System.out.println("Removed Element: " + removedElement);
		// remove all elements
		mylist.clear();
		System.out.println("ArrayList after clear(): " + mylist);

	}
		}
	



