/**
 * 
 */
package p158;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P158D_IceSculptures {

	private static Integer[] polygonSizes(int n) {
		TreeSet<Integer> sizes = new TreeSet<>();
		int max = (int) Math.sqrt(n);

		for (int i = 3; i <= max; i++) {
			if (n % i == 0) {
				sizes.add(i);
				sizes.add(n / i);
			}
		}

		if (n % 2 == 0) {
			int k = n / 2;

			if (k > 2) {
				sizes.add(k);
			}
		}

		if (n > 2) {
			sizes.add(n);
		}
		
		Integer[] sizeArray = sizes.toArray(new Integer[sizes.size()]);

		return sizeArray;
	}

	private static int getMaxValue(int nSculptures, int[] attractivenessDegrees) {
		Integer[] sizes = polygonSizes(nSculptures);
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < sizes.length; i++) {
			int currentSize = sizes[i];
			int step = nSculptures / currentSize;

			for (int start = 0; start < step; start++) {
				int value = 0;

				for (int k = start; k < nSculptures; k += step) {
					value += attractivenessDegrees[k];
				}

				if (value > max) {
					max = value;
				}
			}
		}

		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int nSculptures = scanner.nextInt();
		scanner.nextLine();
		int[] attractivenessDegrees = new int[nSculptures];

		for (int i = 0; i < nSculptures; i++) {
			attractivenessDegrees[i] = scanner.nextInt();
		}

		scanner.close();

		int result = getMaxValue(nSculptures, attractivenessDegrees);
		System.out.println(result);
	}

}
