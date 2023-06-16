package ap;

import ap.EvenOrOdd;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class EvenOrOddTest {
	
	@Test
	public void testEvenOrOdd() {
		EvenOrOdd eoo = new EvenOrOdd();
//         assertEquals("Even", eoo.even_or_odd(6));
//         assertEquals("Odd", eoo.even_or_odd(7));
//         assertEquals("Even", eoo.even_or_odd(0));
//         assertEquals("Odd", eoo.even_or_odd(-1));
		Assertions
				.assertThat(eoo.even_or_odd(2147483647))
				.isEqualTo("Odd");
		Assertions
				.assertThat(eoo.even_or_odd(2147483646))
				.isEqualTo("Even");
//         assertEquals("Even", eoo.even_or_odd(-2147483648));
	
	
	}
}