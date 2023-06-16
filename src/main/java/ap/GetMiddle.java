package ap;

public class GetMiddle {
	/**
	 * A word (string) of length 0 < str < 1000
	 * @param word
	 * @return
	 */
	public static String getMiddle(String word) {
		boolean isEven = word.length() % 2 == 0;
		if (word.length() > 0) {
			if (isEven) {
				var index = (word.length() / 2);
				return word.substring(index - 1, index + 1);
			} else {
				int index = (word.length() - 1) / 2;
				return word.substring(index, index + 1);
			}
		}
		return "";
	}
}
