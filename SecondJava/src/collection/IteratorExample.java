package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> strings = new ArrayList<>();

		
		// pos 012345
				// val abcdef


				strings.add("a");
				strings.add("b");
				strings.add("c");
				strings.add("d");
				strings.add("e");
				strings.add("f");

				for (String string : strings) {
					System.out.println(string);
				}
				
				System.out.println("==========");

				Iterator <String> itr = strings.iterator();
				while (itr.hasNext()) {
					String string = (String)itr.next();
					System.out.println(itr.next());
				}
	}

}
