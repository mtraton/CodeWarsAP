package ap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class SumOfMultiplesOf3Or5Test {
	
	@Test
	public void squareDigits() {
		SoftAssertions.assertSoftly(softly -> {
			softly.assertThat(new SumOfMultiplesOf3Or5().sumMultiplesOf3Or5(9)).isEqualTo(14);
			softly.assertThat(new SumOfMultiplesOf3Or5().sumMultiplesOf3Or5(16)).isEqualTo(60);
			softly.assertThat(new SumOfMultiplesOf3Or5().sumMultiplesOf3Or5(0)).isEqualTo(0);
			softly.assertThat(new SumOfMultiplesOf3Or5().sumMultiplesOf3Or5(2)).isEqualTo(0);
			
			
		});
	}
	
}