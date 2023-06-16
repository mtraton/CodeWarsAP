package ap;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class VirtualCasinoMoneyMoneyMoneyTest {
	
	@Test
	public void testVirtualCasino() {
		
		/*
		 assertEquals(
            0,
            Solution.fruit(new String[][]{new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                                                       "Cherry", "Bar", "King", "Queen", "Jack"},
                                          new String[]{"Bar", "Wild", "Queen", "Bell", "King",
                                                       "Seven", "Cherry", "Jack", "Star", "Shell"},
                                          new String[]{"Bell", "King", "Wild", "Bar", "Seven",
                                                       "Jack", "Shell", "Cherry", "Queen", "Star"}},
                           new int[]{5, 4, 3}));
		 */
		
		String[] firstReel = {"Wild", "Star", "Bell", "Shell", "Seven",
				"Cherry", "Bar", "King", "Queen", "Jack"};
		String[] secordReel = {"Bar", "Wild", "Queen", "Bell", "King",
				"Seven", "Cherry", "Jack", "Star", "Shell"};
		String[] thirdReel = {"Bell", "King", "Wild", "Bar", "Seven",
				"Jack", "Shell", "Cherry", "Queen", "Star"};
		String[][] reels = {
				firstReel,
				secordReel,
				thirdReel};
		
		/**
		 * Item	Three of the same	Two of the same	Two of the same plus one Wild
		 * Wild	100	10	N/A
		 * Star	90	9	18
		 * Bell	80	8	16
		 * Shell	70	7	14
		 * Seven	60	6	12
		 * Cherry	50	5	10
		 * Bar	40	4	8
		 * King	30	3	6
		 * Queen	20	2	4
		 * Jack	10	1	2
		 */
		
		
		Assertions
				.assertThat(VirtualCasinoMoneyMoneyMoney.fruit(reels,
						new int[]{5, 4, 3}))
				.isEqualTo(0);
		
		
		assertEquals(
				100,
				VirtualCasinoMoneyMoneyMoney.fruit(new String[][]{new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
								"Cherry", "Bar", "King", "Queen", "Jack"},
								new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
										"Cherry", "Bar", "King", "Queen", "Jack"},
								new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
										"Cherry", "Bar", "King", "Queen", "Jack"}},
						new int[]{0, 0, 0}));
		
		assertEquals(
				0,
				VirtualCasinoMoneyMoneyMoney.fruit(new String[][]{new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
								"Cherry", "Bar", "King", "Queen", "Jack"},
								new String[]{"Bar", "Wild", "Queen", "Bell", "King",
										"Seven", "Cherry", "Jack", "Star", "Shell"},
								new String[]{"Bell", "King", "Wild", "Bar", "Seven",
										"Jack", "Shell", "Cherry", "Queen", "Star"}},
						new int[]{5, 4, 3}));
		
		assertEquals(
				3,
				VirtualCasinoMoneyMoneyMoney.fruit(new String[][]{new String[]{"King", "Cherry", "Bar", "Jack", "Seven",
								"Queen", "Star", "Shell", "Bell", "Wild"},
								new String[]{"Bell", "Seven", "Jack", "Queen", "Bar",
										"Star", "Shell", "Wild", "Cherry", "King"},
								new String[]{"Wild", "King", "Queen", "Seven", "Star",
										"Bar", "Shell", "Cherry", "Jack", "Bell"}},
						new int[]{0, 0, 1}));
		
		assertEquals(
				6,
				VirtualCasinoMoneyMoneyMoney.fruit(new String[][]{new String[]{"King", "Jack", "Wild", "Bell", "Star",
								"Seven", "Queen", "Cherry", "Shell", "Bar"},
								new String[]{"Star", "Bar", "Jack", "Seven", "Queen",
										"Wild", "King", "Bell", "Cherry", "Shell"},
								new String[]{"King", "Bell", "Jack", "Shell", "Star",
										"Cherry", "Queen", "Bar", "Wild", "Seven"}},
						new int[]{0, 5, 0}));
		
	}
}