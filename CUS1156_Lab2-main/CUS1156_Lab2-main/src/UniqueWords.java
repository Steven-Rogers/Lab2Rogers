
/**
 * Project:		Lab2
 * Class:		UniqueWords.java
 * Author:		Steven Rogers
 * Date:		October 5, 2021
 * This program looks through an arraylist of words
 *  and counts how many unique words there are in it	
 */
import java.util.ArrayList;

public class UniqueWords {
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */
	public static int countUnique(ArrayList<String> list) {
		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			String currWord = list.get(i);
			int checker = 0;

			for (int j = 0; j < list.size(); j++) {
				String otherWord = list.get(j);

				if (currWord.equals(otherWord) && i != j) {
					checker = 1;
				}
			}

			if (checker == 0) {
				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}
