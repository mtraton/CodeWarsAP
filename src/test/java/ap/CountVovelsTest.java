package ap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountVovelsTest {
	
	@Test
	//	public static int getCount(String str) {
	// a, e, i, o, u
	// wafafafsio -> 5
	// null -> 0
	// "" -> 0
	//aioue = 5
	public void getCount() {
		SoftAssertions.assertSoftly(softly -> {
			//softly.assertThat(CountVovels.getCount("aioue")).isEqualTo(5);
			softly.assertThat(CountVovels.getCount("wafafafsio")).isEqualTo(5);
			//softly.assertThat(CountVovels.getCount("")).isEqualTo(0);
			//softly.assertThat(CountVovels.getCount(null)).isEqualTo(0);
		});
	}
}