/**
 * 
 */
package p119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P119A_EpicGame {

	private static int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			String inputString = reader.readLine();
			String[] inputStrings = inputString.split(" ");

			int a = Integer.valueOf(inputStrings[0]);
			int b = Integer.valueOf(inputStrings[1]);
			int n = Integer.valueOf(inputStrings[2]);

			reader.close();
			isr.close();

			boolean SimonWins = true;
			boolean gameOver = false;

			int gcd = 0;

			do {
				gcd = greatestCommonDivisor(a, n);

				if (gcd > n) {
					SimonWins = false;
					gameOver = true;
				} else {
					n -= gcd;
					gcd = greatestCommonDivisor(b, n);

					if (gcd > n) {
						SimonWins = true;
						gameOver = true;
					} else {
						n -= gcd;
					}
				}
			} while (!gameOver);

			System.out.println(SimonWins ? 0 : 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
