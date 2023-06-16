package ap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class MorseCodeDecoderTest {
	
	
	@Test
	public void testShouldDecodeMorseCode() {
		SoftAssertions.assertSoftly(softly -> {
			
			//softly.assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")).isEqualTo("HEY JUDE");
			
			softly.assertThat(MorseCodeDecoder.decode(".... . -.--         .--- ..- -.. .")).isEqualTo("HEY   JUDE");
			
			//softly.assertThat(MorseCodeDecoder.decode("----- .---- ..--- ...-- ....- ..... -.... --... ---.. ----. ----- .- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.."))
					//.isEqualTo("01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			
			
		});
	}
}