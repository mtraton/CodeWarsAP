package ap;

public class FindOutlier {
	static int find(int[] integers) {
		int evenInts = 0;
		int oddInts = 0;
		int lastEven = Integer.MIN_VALUE;
		int lastOdd = Integer.MAX_VALUE;
		int count = 0;
		boolean passedThreeElements = false;
		boolean findingEven = false;
		
		for (int i : integers) {
			count++;
			if (i % 2 == 0) {
				evenInts++;
				lastEven = i;
			} else {
				lastOdd = i;
				oddInts++;
			}
			
			if (evenInts >= 2) {
				findingEven = false;
			} else if (oddInts >= 2) {
				findingEven = true;
				
			}
			
			if(count >= 3) {
				if (findingEven) {
					if (lastEven != Integer.MIN_VALUE) {
						return lastEven;
					}
					
				} else {
					if (lastOdd != Integer.MAX_VALUE) {
						return lastOdd;
					}
					
				}
			}
			
		}
		
		
		throw new IllegalStateException("I cannot compute!");
	}
	
}
