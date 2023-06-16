package ap;

public class ChristmasTree {
	public static String[] towerBuilder(int nFloors)
	{
		 //DEBUG ME
		
		String[] tree = new String[nFloors];
		int numberOfSpaces = nFloors-1;
		int numberOfStars = 1;
		if (nFloors == 1) {
			return new String[]{"*"};
		}
		for (int i = 0; i < nFloors; i++) {
			String s = "*".repeat(numberOfStars);
			String spaces = " ".repeat(numberOfSpaces);
			String floor = spaces + s + spaces;
			tree[i] = floor;
			numberOfSpaces--;
			numberOfStars += 2;
	}
		
		return tree;
	}
}
