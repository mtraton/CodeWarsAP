package ap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareDigitTest {
	
	@Test
	public void squareDigits() {
		SoftAssertions.assertSoftly(softly -> {
			softly.assertThat(new SquareDigit().squareDigits(8)).isEqualTo(64);
			softly.assertThat(new SquareDigit().squareDigits(44)).isEqualTo(1616);
			softly.assertThat(new SquareDigit().squareDigits(-44)).isEqualTo(1616);
			softly.assertThat(new SquareDigit().squareDigits(0)).isEqualTo(0);
			softly.assertThat(new SquareDigit().squareDigits(206)).isEqualTo(4036);
			softly.assertThat(new SquareDigit().squareDigits(325)).isEqualTo(9425);
			
		});
	}
}