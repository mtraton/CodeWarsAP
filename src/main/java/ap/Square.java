package ap;

public class Square {
	
	
		public static int squareSum(int[] n)
		{
			int finalResult = 0;
			
			if (n.length == 0) {
				return 0;
			}
			for (int i : n) {
				int result = (int) Math.pow(i, 2);
				finalResult += result;
			}
		
			return finalResult;
			
			
		}
	
}
