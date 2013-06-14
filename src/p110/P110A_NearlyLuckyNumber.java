/**
 * 
 */
package p110;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P110A_NearlyLuckyNumber {

	private static boolean isLuckyNumber(int number) {
		if (number <= 0) {
			return false;
		}
		
		while (number > 0) {
			int digit = number % 10;

			if (digit != 4 && digit != 7) {
				return false;
			}
			
			number /= 10;
		}

		return true;
	}

	private static boolean isNearlyLuckyNumber(String numberString) {
		int countLuckyDigit = 0;

		for (int i = 0; i < numberString.length(); i++) {
			char ch = numberString.charAt(i);

			if (ch == '4' || ch == '7') {
				countLuckyDigit++;
			}
		}

		return isLuckyNumber(countLuckyDigit);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs
			String inputNumber = reader.readLine();

			reader.close();
			isr.close();
			// end reading inputs

			boolean result = isNearlyLuckyNumber(inputNumber);
			System.out.println(result ? "YES" : "NO");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
