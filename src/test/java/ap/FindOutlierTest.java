package ap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindOutlierTest {
	
	@Test
	public void test() {
		SoftAssertions.assertSoftly(softly -> {
			softly.assertThat(FindOutlier.find(new int[]{2,2, 1})).isEqualTo(1);
			softly.assertThat(FindOutlier.find(new int[]{2, 4, 0, 100, 4, 11, 2602, 36})).isEqualTo(11);
			softly.assertThat(FindOutlier.find(new int[]{160, 3, 1719, 19, 11, 13, -21})).isEqualTo(160);
			softly.assertThat(FindOutlier.find(new int[]{10,10,10,3})).isEqualTo(3);
		});
	}
	
}