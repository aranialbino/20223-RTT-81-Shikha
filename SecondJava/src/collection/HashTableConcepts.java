package collection;

import java.util.Hashtable;

public class HashTableConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it is similar to hash map but it is syncronized
		//stores the value on the basic of key and value
		//Key ---> object --->Hashcode---->value
Hashtable h1 = new Hashtable ();
h1.put(1 , "Tom");
h1.put(2 , "Test");
h1.put(3 , "Java");
h1.put(4 , "lava");  

// creat a clone copy
Hashtable h2 = new Hashtable ();
h2 = (Hashtable)h1.clone();
System.out.println("The values of h1 ::"+ h1);
System.out.println("The values of h2 ::"+ h2);
// for clearing data
h1.clear();
System.out.println(" After using clear ,The values of h1 ::"+ h1);
Hashtable st = new Hashtable ();
st.put('a', "Ram");
st.put('b', "Naveen ");
st.put('c', "Selenium");
st.put('d', "budhu");
if (st.contains("Naveen"));

System.out.println("value is found");







	}

}
