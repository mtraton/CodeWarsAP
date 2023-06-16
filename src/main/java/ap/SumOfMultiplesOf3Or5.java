package ap;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SumOfMultiplesOf3Or5 {
	
	/**
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * <p>
	 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).
	 * <p>
	 * Note: If the number is a multiple of both 3 and 5, only count it once.
	 *
	 * @param number
	 * @return
	 */
	
	public int sumMultiplesOf3Or53(int number) {
		
		List<Integer> multipleOf3 = new LinkedList<>();
		List<Integer> multipleOf5 = new LinkedList<>();
		for (int i = 1; i * 3 < number; i++) {
			int product = i * 3;
			multipleOf3.add(product);
		}
		for (int i = 1; i * 5 < number; i++) {
			int product = i * 5;
			multipleOf5.add(product);
		}
		//for every number check if it is in 2nd lists
		for (int multiple : multipleOf3) {
			if (multipleOf5.contains(multiple)) {
				multipleOf5.remove((Integer) multiple);
			}
		}
		int result3 = 0;
		for (int i : multipleOf3) {
			result3 += i;
		}
		int result5 = 0;
		for (int i : multipleOf5) {
			result5 += i;
		}
		return result3 + result5;
	}
	
	public int sumMultiplesOf3Or54(int number) {
		
		List<Integer> multiples = new LinkedList<>();
		
		for (int k = 1; k < number; k++) {
			if (k % 3 == 0 && k % 5 == 0) {
				multiples.add(k);
				continue;
			}
			
			if (k % 3 == 0) {
				multiples.add(k);
			}
			
			if (k % 5 == 0) {
				multiples.add(k);
			}
		}
		
		int result = 0;
		for (int i : multiples) {
			result += i;
		}
		return result;
	}
	
	public int sumMultiplesOf3Or5(int number) {
		Set<Integer> multiples = new HashSet<>();
		for (int k = 1; k < number; k++)  {
			if (k % 3 == 0 || k % 5 == 0) {
				multiples.add(k);
			}
		}
		int result = 0;
		
		for (int i : multiples) {
			result += i;
		}
		return result;
	}
}
