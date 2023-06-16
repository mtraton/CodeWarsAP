package ap;

import java.util.Map;

public class RgbToHex {
	
	static Map<Integer, String> hexLetters = Map.of(
			10, "A",
			11, "B",
			12, "C",
			13, "D",
			14, "E",
			15, "F"
	);
	
	public static String rgb(int r, int g, int b) {
		
		///
		// convert each number to hex
		// divide by 16
		// take remainder
		
		// repeat until remainder is less then 16
		String redHexes = decToHex(r);
		String greenHexes = decToHex(g);
		String blueHexes = decToHex(b);
		return redHexes + greenHexes + blueHexes;
	}
	
	private static String decToHex(int dec) {
		if (dec > 255) {
			dec = 255;
		}
		int hexes = dec / 16;
		String tempResult;
		if (hexes >= 10) {
			tempResult = hexLetters.get(hexes);
		} else {
			tempResult = String.valueOf(hexes);
		}
		int ones = dec % 16;
		String tempOnes;
		if (ones >= 10) {
			tempOnes = hexLetters.get(ones);
		} else {
			tempOnes = String.valueOf(ones);
		}
		
		return tempResult + tempOnes;
	}
}
