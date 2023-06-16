package ap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WhoLikesItTest {
	
	@Test
	public void getCount() {
		SoftAssertions.assertSoftly(softly -> {
//			softly.assertThat(WhoLikesIt.whoLikesIt())
//					.isEqualTo("no one likes this");
//			softly.assertThat(WhoLikesIt.whoLikesIt(List.of("Peter").toArray(new String[0])))
//					.isEqualTo("Peter likes this");
			softly.assertThat(WhoLikesIt.whoLikesIt(List.of("Jacob", "Alex").toArray(new String[0])))
					.isEqualTo("Jacob and Alex like this");
			softly.assertThat(WhoLikesIt.whoLikesIt(List.of("Max", "John", "Mark").toArray(new String[0])))
					.isEqualTo("Max, John and Mark like this");
			softly.assertThat(WhoLikesIt.whoLikesIt(List.of("Alex", "Jacob", "Mark", "Max").toArray(new String[0])))
					.isEqualTo("Alex, Jacob and 2 others like this");
			
		});
	}
}