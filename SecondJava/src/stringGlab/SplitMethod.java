package stringGlab;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String vowels = "a::b::c::d:e";

	    // splitting the string at "::"
	    // storing the result in an array of strings
	    String[] result = vowels.split("::");

	    // converting array to string and printing it
	    System.out.println("result = " + Arrays.toString(result));
	    String csv = "a,b,c,d,e,f,g,h,i";
	 String [] commas = csv.split(",");
	    System.out.println("commas = " + Arrays.toString(commas));
	    String name = "Firstname Lastname";
	    String[] names = name.split("");
	    System.out.println("names = " + Arrays.toString(names));

	}

}
