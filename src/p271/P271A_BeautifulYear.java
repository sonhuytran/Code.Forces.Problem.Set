/**
 * 
 */
package p271;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P271A_BeautifulYear {

	private static boolean isBeautifulYear(int year) {
		HashSet<Integer> distinctDigits = new HashSet<>();
		int digitCount = 0;

		while (year > 0) {
			distinctDigits.add(year % 10);
			year /= 10;
			digitCount++;
		}

		return (distinctDigits.size() == digitCount);
	}

	private static int getNextBeautifulYear(int currentYear) {
		do {
			currentYear++;
		} while (!isBeautifulYear(currentYear));

		return currentYear;
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
			int currentYear = Integer.parseInt(reader.readLine());

			reader.close();
			isr.close();
			// end reading inputs

			int nextBeautifulYear = getNextBeautifulYear(currentYear);
			System.out.println(nextBeautifulYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
