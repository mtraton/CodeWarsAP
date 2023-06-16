package ap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;


public class VirtualCasinoMoneyMoneyMoney {
	public static class ReelValues implements Iterable<String> {
		private final String reel1;
		private final String reel2;
		private final String reel3;
		
		public ReelValues(String reel1, String reel2, String reel3) {
			this.reel1 = reel1;
			this.reel2 = reel2;
			this.reel3 = reel3;
		}
		
		public static int calcspin(int spin) {
			while (spin > 10) {
				spin -= 10;
			}
			return spin;
			
		}
		
		public Iterator<String> iterator() {
			return new Iterator<String>() {
				private int currentIndex = 0;
				
				public boolean hasNext() {
					return currentIndex < 3;
				}
				
				public String next() {
					switch (currentIndex++) {
						case 0: return reel1;
						case 1: return reel2;
						case 2: return reel3;
						default: throw new NoSuchElementException();
					}
				}
			};
		}
	}
	
	public static final String JOKER = "Wild";
	
	
	// spin1 = 25
	// 25 - 10 = 15 15
	
	public static int fruit(final String[][] reels, final int[] spins) {
		Map<String, Integer> imgToValue = Map.of(
				JOKER, 10,
				"Star", 9,
				"Bell", 8,
				"Shell", 7,
				"Seven", 6,
				"Cherry", 5,
				"Bar", 4,
				"King", 3,
				"Queen", 2,
				"Jack", 1
		);
		
		String[] reel1 = reels[0];
		String[] reel2 = reels[1];
		String[] reel3 = reels[2];
		ReelValues reelValues = new ReelValues(
				reel1[ReelValues.calcspin(spins[0])],
				reel2[ReelValues.calcspin(spins[1])],
				reel3[ReelValues.calcspin(spins[2])]);
		
		
		Map<String,Integer> imgToCount = new HashMap<>();
		
		for (String reelvalue : reelValues) {
			if (imgToCount.containsKey(reelvalue)) {
				Integer currentValue = imgToCount.get(reelvalue);
				// TODO: complete doing histogram
			}
		}
		
		
		if (reelValues.reel1.equals(reelValues.reel2) && reelValues.reel2.equals(reelValues.reel3)) {
			var value = imgToValue.get(reelValues.reel1);
			return value * 10;
		}
		
		// TODO: use histogram instead of conditions
		String notTempJoker = null;
		boolean oneAndTwoAndJoker = reelValues.reel1.equals(reelValues.reel2) && reelValues.reel3.equals(JOKER);
		boolean twoAndThreeAndJoker = reelValues.reel2.equals(reelValues.reel3) && reelValues.reel1.equals(JOKER);
		boolean oneAndThreeAndJoker = reelValues.reel1.equals(reelValues.reel3) && reelValues.reel2.equals(JOKER);
		
		
		if (oneAndTwoAndJoker) notTempJoker = reelValues.reel1;
		if (twoAndThreeAndJoker) notTempJoker = reelValues.reel2;
		if (oneAndThreeAndJoker) notTempJoker = reelValues.reel3;
		
		if (oneAndTwoAndJoker || twoAndThreeAndJoker || oneAndThreeAndJoker) {
			
			var value = imgToValue.get(notTempJoker);
			return value * 2;
		}
		
		boolean oneAndTwoAndNotJoker = reelValues.reel1.equals(reelValues.reel2);
		boolean twoAndThreeAndNotJoker = reelValues.reel2.equals(reelValues.reel3);
		boolean oneAndThreeAndNotJoker = reelValues.reel1.equals(reelValues.reel3);
		
		if (oneAndTwoAndNotJoker) notTempJoker = reelValues.reel1;
		if (twoAndThreeAndNotJoker) notTempJoker = reelValues.reel2;
		if (oneAndThreeAndNotJoker) notTempJoker = reelValues.reel3;
		
		if (oneAndTwoAndNotJoker || twoAndThreeAndNotJoker || oneAndThreeAndNotJoker) {
			
			return imgToValue.get(notTempJoker);
		}
		return 0; // Code here
	}
}
