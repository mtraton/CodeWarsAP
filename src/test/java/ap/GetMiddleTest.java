package ap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetMiddleTest {
	@Test
	public void testGetMiddle() {
		//A word (string) of length 0 < str < 1000
		SoftAssertions.assertSoftly(softly -> {
			softly.assertThat(GetMiddle.getMiddle("test")).isEqualTo("es");
			softly.assertThat(GetMiddle.getMiddle("testing")).isEqualTo("t");
			softly.assertThat(GetMiddle.getMiddle("t")).isEqualTo("t");
			softly.assertThat(GetMiddle.getMiddle("t t")).isEqualTo(" ");
			softly.assertThat(GetMiddle.getMiddle("12345")).isEqualTo("3");
		});
	}
}