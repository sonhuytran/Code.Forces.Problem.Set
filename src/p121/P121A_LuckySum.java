package p121;

import java.util.Arrays;

public class P121A_LuckySum {

	private static int[] first(int number) {
		int firstInt = number % 10, count = 1;
		number /= 10;

		while (number > 0) {
			firstInt = firstInt * 10 + 4;
			number /= 10;
			count++;
		}

		int[] result = new int[count];

		for (int i = 0; i < count; i++) {
			result[i] = firstInt % 10;
			firstInt /= 10;
		}

		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(first(18)));
	}
}
