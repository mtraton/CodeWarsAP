package ap;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TrollTest {
	
	@Test
	public void testShouldReturnStringWithoutWawelsWhenStringPassed() {
		
		SoftAssertions.assertSoftly(softAssertions ->
		{
			// str = "ala ma kota";
			// str = "l m kot"
			softAssertions.assertThat(Troll.disemvowel("seaouiyrtEAUOIY")).isEqualTo("srt");
		});
	}
}