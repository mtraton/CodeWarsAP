package ap;

public class EvenOrOdd {
	public static String even_or_odd(int number) {
		//
//		float remainder = number;
		int remainder = number % 2;
		boolean niemamanzway = remainder == 0;
		String result = "";
		if (niemamanzway) {
			result = "Even";
		} else {
			result = "Odd";
		}
		System.out.println(result);
		return result;
	}
}