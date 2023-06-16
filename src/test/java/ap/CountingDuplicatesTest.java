package ap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class CountingDuplicatesTest {
	
	
	@Test
	public void testCountingDuplcaites() {
		SoftAssertions.assertSoftly(softly -> {
			softly.assertThat(CountingDuplicates.duplicateCount("gghj")).isEqualTo(1);
			softly.assertThat(CountingDuplicates.duplicateCount("gghhj")).isEqualTo(2);
			softly.assertThat(CountingDuplicates.duplicateCount("gghHj")).isEqualTo(2);
			softly.assertThat(CountingDuplicates.duplicateCount("1123")).isEqualTo(1);
			softly.assertThat(CountingDuplicates.duplicateCount("")).isEqualTo(0);
		});
	}
}