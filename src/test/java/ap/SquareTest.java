package ap;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
	
	// public static int squareSum(int[] n)
	// [1, 2, 2]   1^2 + 2^2 + 2^2 = 9
	//3 = 9
	//4 = 16
	//[20 = 400]
	//[0,2] = 4
	//[0,201,5] = 40401 + 25 = 40426
	//[-3, -1] = 9 1 10
	@Test
	public void squareSumTest() {
		SoftAssertions.assertSoftly(softly -> {
			softly.assertThat(Square.squareSum(new int[]{1, 4})).isEqualTo(17);
			softly.assertThat(Square.squareSum(new int[]{-3, 0})).isEqualTo(9);
			softly.assertThat(Square.squareSum(new int[]{11, 2})).isEqualTo(125);
			softly.assertThat(Square.squareSum(new int[]{})).isEqualTo(0);
			
		});
	}
}