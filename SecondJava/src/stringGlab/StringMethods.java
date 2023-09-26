package stringGlab;

public class StringMethods {

	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		String a = "HELLO";
		String b = "java";
		String c = "";
		String d = "java";
		System.out.println(a + b);
		System.out.println(a.length());
		System.out.println("hello".length());
		System.out.println(c.isEmpty());
		System.out.println(a.isEmpty());
		System.out.println(a + "how are you");
		System.out.println(a.trim() + "how are you");
		String alower = a.toLowerCase();
		System.out.println(alower);
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(a.concat(b));
		System.out.println(a.compareTo(b));
		int result;
		result = a.lastIndexOf("Java");
		System.out.println(result);
		result = b.indexOf("v");
		System.out.println(result);
		boolean result1 = a.contains("java");
		System.out.println(result1);
		System.out.println(a.replace('L', 'H'));
		System.out.println(a.equals(c));
		System.out.println(a.compareTo(c));
		System.out.println(b == (d));
// SubStrings

		String string = "This is a string";
		String sub = string.substring(5, 7);
		System.out.println(sub);
		// substring with just a start
		String sub1 = string.substring(5);
		System.out.println(sub1);

		// sub
		String filename = "someimage.jpg";

		int lastDot = filename.lastIndexOf(".");

		String ext = filename.substring(filename.lastIndexOf(".") + 1);
		System.out.println(ext);

		// ------------01234567890
		String name = "Eric Heilig";

		int spacePosition = name.indexOf(" ");
		String firstname = name.substring(0, spacePosition);
		System.out.println(firstname);

		String lastname = name.substring(name.indexOf(" ") + 1);
		System.out.println(lastname);

		//// find the position of the first space in the string
		String example = "This is an example";
		int firstSpace = example.indexOf(" ");
		System.out.println("firstSpace ; index" + firstSpace);
		// find the position of the last space in the string

		int lastSpace = example.lastIndexOf(" ");
		System.out.println("lastSpace of index" + lastSpace);

		// substring of the characters between the first and last space of the string
		String betweenSpace = example.substring(firstSpace, lastSpace);
		System.out.println("betweenSpace:" + betweenSpace);

		// do the same thing to find the substring of the first and last vowel of the
		char[] chars = example.toCharArray();
		int length = chars.length;
		int firstVowelIndex = -1;
		int lastVowelIndex = -1;
		for (int i = 0; i < length; i++) {
			char ca = chars[i];
			if (ca == 'a' || ca == 'e' || ca == 'i' || ca == 'o' || ca == 'u') {
				firstVowelIndex = i;
				break;

			}
		}
		for (int i = length - 1; i >= 0; i--) {
			char ca = chars[i];
			if (ca == 'a' || ca == 'e' || ca == 'i' || ca == 'o' || ca == 'u') {
				lastVowelIndex = i;
				break;

			}
		}

		System.out.println(example.substring(firstVowelIndex, lastVowelIndex));

		// use the string.charAt function and use a for loop to loop over the entire
		// string
		// and print out each character with a new line after it.
		// you need to use the string.length() function also

		// using only indexOf(" ") print the substring that contains the word "is"
		// use 2 substrings to do this.
		int indexOfIS = example.indexOf("is");
		System.out.println(example.substring(indexOfIS, indexOfIS + 3));
		// https://edabit.com/challenges
		// Change to Java / Very Easy or Easy / Strings and try to do some of them
		String h = "java";
		h = "very easy";
		System.out.println(h);
	}
}
