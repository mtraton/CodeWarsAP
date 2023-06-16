package ap;

import java.util.List;

public class CountVovels2 {
	
	public static int getCount(String str) {
		int numOfVovels = 0;
		List<String> vowels = List.of("a", "e", "i", "o", "u");
		if (str == null) {
			return 0;
		}
		for (String vovel : vowels) {
			if (str.contains(vovel)){
				char[] stringAsArray = str.toCharArray();
				for (char c : stringAsArray) {
					if ((String.valueOf(c)).equals(vovel)) {
						numOfVovels++;
					}
				}
			}
		}
		return numOfVovels;
		
	}
}
