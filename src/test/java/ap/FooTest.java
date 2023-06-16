package ap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FooTest {
	@Test
	public void getCount() {
		SoftAssertions.assertSoftly(softly -> {
			softly.assertThat(Foo.arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2,4})).isEqualTo(new int[]{1, 3});
			softly.assertThat(Foo.arrayDiff(new int[]{}, new int[]{})).isEqualTo(new int[]{});
			softly.assertThat(Foo.arrayDiff(new int[]{1, 2, 3}, new int[]{4})).isEqualTo(new int[]{1, 2, 3});
			softly.assertThat(Foo.arrayDiff(new int[]{1, 2, 3}, new int[]{1, 2, 3})).isEqualTo(new int[]{});
		});
	}
}