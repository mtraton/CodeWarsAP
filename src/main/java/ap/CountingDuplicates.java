package ap;

import java.util.ArrayList;
import java.util.List;

public class CountingDuplicates {
	// TODO: optimize current solution
	// TODO: use maps instead of double iteration
	// TODO: show bug with == instead of equals
	
	public static int duplicateCount(String text) {
		int duplicatedCount = 0;
		int finalCount = 0;
		List<String> alphabet = List.of(
				"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
				"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
		List<String> ints = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
		
		for (String alphabetLetter : alphabet) {
			duplicatedCount = 0;
			String lowerCase = text.toLowerCase();
			for (Character i : lowerCase.toCharArray()) {
				String stringLetter = String.valueOf(i);
				if (alphabetLetter.equals(stringLetter)) {
					duplicatedCount++;
				}
				
			}
			if (duplicatedCount >= 2) {
				finalCount++;
			}
			
		}
		
		
		for (String inte : ints) {
			duplicatedCount = 0;
			String lowerCase = text.toLowerCase();
			for (Character i : lowerCase.toCharArray()) {
				String stringLetter = String.valueOf(i);
				if (inte.equals(stringLetter)) {
					duplicatedCount++;
				}
				
			}
			
			if (duplicatedCount >= 2) {
				finalCount++;
			}
		}
		return finalCount;
	}
}
