/**
 * 
 */
package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class CodeForcesUtils {
	public static int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	public static void readStandardInput2() {
		Scanner scanner = new Scanner(System.in);
		scanner.close();
	}

	public static void readStandardInput() {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs

			reader.close();
			isr.close();
			// end reading inputs
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}