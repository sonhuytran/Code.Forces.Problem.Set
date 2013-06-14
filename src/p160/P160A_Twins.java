/**
 * 
 */
package p160;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P160A_Twins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// read inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			int nCoins = Integer.parseInt(reader.readLine());
			String[] coinsString = reader.readLine().split(" ");

			reader.close();
			isr.close();
			// end reading inputs

			ArrayList<Integer> coins = new ArrayList<Integer>();

			for (int i = 0; i < nCoins; i++) {
				coins.add(Integer.parseInt(coinsString[i]));
			}

			Collections.sort(coins);
			Object[] sortedCoins = coins.toArray();
			int[] coinSums = new int[nCoins];
			int sum = 0;

			for (int i = nCoins - 1; i >= 0; i--) {
				sum += (Integer) sortedCoins[i];
				coinSums[i] = sum;
			}

			int i = nCoins - 1;

			while (i >= 0 && coinSums[i] <= coinSums[0] / 2) {
				i--;
			}

			int result = nCoins - i;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
