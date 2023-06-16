package ap;

import java.util.ArrayList;
import java.util.List;

public class Troll {
	public static String disemvowel(String str) {
		List<String> vowels = List.of("a", "e", "i", "o", "u", "y", "A", "O", "U", "E", "Y", "I");
		
		String result = str;
		for (String vowel : vowels) {
			if (str.contains(vowel)) {
				result = result.replace(vowel, "");
			}
		}
		return result;
	}
}