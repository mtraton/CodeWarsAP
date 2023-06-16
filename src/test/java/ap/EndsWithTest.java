package ap;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class EndsWithTest {
	@Test
	public void TestEndWith() {
		EndsWith endsWith = new EndsWith();
		
		
		boolean solution = EndsWith.solution("asdsd", "d");
		boolean solution2 = EndsWith.solution("asdsd", "da");
		
		SoftAssertions.assertSoftly(softly -> {
			softly.assertThat(solution).isTrue();
			softly.assertThat(solution2).isFalse();
		});
		
		
	}
	
	
}