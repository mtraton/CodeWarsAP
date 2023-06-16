package ap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class RgbToHexTest {
	
	
	@Test
	public void rgfoob() {
		System.out.println(0/0);
		System.out.println(0%0);
		
	}
	
	@Test
	public void rgb() {
		
		SoftAssertions.assertSoftly(softly -> {
			
			softly.assertThat(RgbToHex.rgb(71, 71, 71)).isEqualTo("474747");
			softly.assertThat(RgbToHex.rgb(255, 255, 255)).isEqualTo("FFFFFF");
			softly.assertThat(RgbToHex.rgb(255, 255, 300)).isEqualTo("FFFFFF");
			softly.assertThat(RgbToHex.rgb(0, 0, 0)).isEqualTo("000000");
			softly.assertThat(RgbToHex.rgb(148, 0, 211)).isEqualTo("9400D3");
			
			/**
			 * RgbToHex.rgb(255, 255, 255) // returns FFFFFF
			 * RgbToHex.rgb(255, 255, 300) // returns FFFFFF
			 * RgbToHex.rgb(0, 0, 0)       // returns 000000
			 * RgbToHex.rgb(148, 0, 211)   // returns 9400D3
			 */
		});
	}
}