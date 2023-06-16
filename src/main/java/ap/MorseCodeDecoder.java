package ap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO: handle when there are more spaces between words
public class MorseCodeDecoder {
	
	public static final String WORD_SEPARATOR = "   ";
	public static final String LETTER_SEPARATOR = " ";
	
	public static String decode(String morseCode) {
		if (morseCode == null) {
			return "";
		}
		morseCode = morseCode.trim();
		StringBuilder result = new StringBuilder();
		String[] words = morseCode.split(WORD_SEPARATOR);
		List<String> wordsAsList = Arrays.stream(words).toList();
		for (var word : wordsAsList) {
			String[] letters = word.split(LETTER_SEPARATOR);
			for (String letter : letters) {
				String asciiletter = get(letter);
				result = new StringBuilder(result.toString().concat(asciiletter));
			}
			result.append(" ");
		}
		return result.substring(0, result.length()-1);
	}
	
	private static final Map<String, String> morseCodeMap = new HashMap<>();
	
	static {
		morseCodeMap.put(WORD_SEPARATOR, LETTER_SEPARATOR);
		morseCodeMap.put(".-", "A");
		morseCodeMap.put("-...", "B");
		morseCodeMap.put("-.-.", "C");
		morseCodeMap.put("-..", "D");
		morseCodeMap.put(".", "E");
		morseCodeMap.put("..-.", "F");
		morseCodeMap.put("--.", "G");
		morseCodeMap.put("....", "H");
		morseCodeMap.put("..", "I");
		morseCodeMap.put(".---", "J");
		morseCodeMap.put("-.-", "K");
		morseCodeMap.put(".-..", "L");
		morseCodeMap.put("--", "M");
		morseCodeMap.put("-.", "N");
		morseCodeMap.put("---", "O");
		morseCodeMap.put(".--.", "P");
		morseCodeMap.put("--.-", "Q");
		morseCodeMap.put(".-.", "R");
		morseCodeMap.put("...", "S");
		morseCodeMap.put("-", "T");
		morseCodeMap.put("..-", "U");
		morseCodeMap.put("...-", "V");
		morseCodeMap.put(".--", "W");
		morseCodeMap.put("-..-", "X");
		morseCodeMap.put("-.--", "Y");
		morseCodeMap.put("--..", "Z");
		morseCodeMap.put(".----", "1");
		morseCodeMap.put("..---", "2");
		morseCodeMap.put("...--", "3");
		morseCodeMap.put("....-", "4");
		morseCodeMap.put(".....", "5");
		morseCodeMap.put("-....", "6");
		morseCodeMap.put("--...", "7");
		morseCodeMap.put("---..", "8");
		morseCodeMap.put("----.", "9");
		morseCodeMap.put("-----", "0");
	}
	
	public static String get(String key) {
		String s = morseCodeMap.get(key);
		if (s == null) {
			throw new RuntimeException("I cannot map letter: \"%s\" to morse code!".formatted(key));
		}
		return s;
	}
}
