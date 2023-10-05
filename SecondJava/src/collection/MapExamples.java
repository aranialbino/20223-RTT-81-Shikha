package collection;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String ,Integer> stringMap = new HashMap<>();

		stringMap.put("one", 1);
		stringMap.put("two", 2);

		Integer a = stringMap.get("one");
		Integer b = stringMap.get("two");
//Hash maps allows null
		System.out.println(stringMap.get("one"));
		System.out.println(stringMap.get("two"));

		stringMap.put("one", 1000);

		System.out.println(stringMap.get("one"));

		Map<String, String> strings = new HashMap<>();
		strings.put("one", "This is a single item");
		strings.put("two", "This is two things");

		Map<Integer, String> numbers = new HashMap<>();
		numbers.put(1, "1st");
		numbers.put(2, "2nd");
		numbers.put(3, "3rd");
		numbers.put(4, "4th");

		System.out.println("=============================");
//it will override
		// it will not have duplicates
		
		
		// to loop over a map .. we have to loop over the set of keys
		// for each key in the keyset .. do something
		for (Integer key : numbers.keySet()) {
			// we have to use the key to look up the value
			String value = numbers.get(key);
			System.out.println(numbers.get(key));
		}

	}

}
