package ap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChristmasTreeTest {
	
	@Test
	public void towerBuilder() {
		SoftAssertions.assertSoftly(softly -> {
			
			softly.assertThat(ChristmasTree.towerBuilder(1)).isEqualTo(tree1());
			softly.assertThat(ChristmasTree.towerBuilder(2)).isEqualTo(tree2());
			softly.assertThat(ChristmasTree.towerBuilder(3)).isEqualTo(tree3());
		
		});
	}
	
	private String[] tree1 () {
		return new String[]{"*"};
	}
	
	private String[] tree2 () {
		return new String[]{" * ",
							"***"};
	}
	
	private String[] tree3 () {
		return new String[]{"  *  ",
							" *** ",
							"****"};
	}
}