package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	String compile;

	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		// 2. Add five Strings to your list
		strings.add("One");
		strings.add("Two");
		strings.add("Three");
		strings.add("Four");
		strings.add("Five");
		// 3. Print all the Strings using a standard for-loop
		System.out.println("Standard loop");
		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		// 4. Print all the Strings using a for-each loop
		System.out.println("For each loop");
		for (String compile : strings) {
			System.out.println(compile);
		}
		// 5. Print only the even numbered elements in the list.
		System.out.println("Evens");
		for (int i = 0; i < strings.size(); i++) {
			if (i % 2 == 1) {
				System.out.println(strings.get(i));
			}
		}
		// 6. Print all the Strings in reverse order.
		System.out.println("Reverse Numbers");
		for (int i = strings.size() - 1; i >= 0; i--) {
			System.out.println(strings.get(i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		System.out.println("If it has e");
		for (String onestring : strings) {
			if (onestring.contains("e")) {
				System.out.println(onestring);
			}
		}

	}
}
