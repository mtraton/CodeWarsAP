package ap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Foo {
	public static int[] arrayDiff(int[] a, int[] b) {
		if (a == b) {
			return new int[]{};
		}
		
		List<Integer> resul = new ArrayList<>(a.length);
		for (int i : a)
		{
			resul.add(i);
		}
		
		for (int bElement : b) {
			for (int aElement : resul) {
				if (bElement == aElement) {
					resul.remove((Integer) aElement);
				}
			}
		}
		return resul.stream()
				.mapToInt(i -> i)
				.toArray();
	}
}
