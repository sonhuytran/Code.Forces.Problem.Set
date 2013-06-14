/**
 * 
 */
package p144;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P144A_ArrivalOfTheGeneral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs
			int nSoldiers = Integer.parseInt(reader.readLine());
			int[] soldierHeights = new int[nSoldiers];
			String[] soldierHeightsString = reader.readLine().split(" ");

			for (int i = 0; i < nSoldiers; i++) {
				soldierHeights[i] = Integer.parseInt(soldierHeightsString[i]);
			}

			reader.close();
			isr.close();
			// end reading inputs

			// searching for the min and max height
			int minHeight = 101, maxHeight = 0;
			int minHeightIndex = -1, maxHeightIndex = -1;

			for (int i = 0; i < nSoldiers; i++) {
				if (soldierHeights[i] > maxHeight) {
					maxHeight = soldierHeights[i];
					maxHeightIndex = i;
				}
			}

			for (int i = nSoldiers - 1; i >= 0; i--) {
				if (soldierHeights[i] < minHeight) {
					minHeight = soldierHeights[i];
					minHeightIndex = i;
				}
			}

			int result = 0;

			// swap the min to the first
			result += maxHeightIndex;
			result += nSoldiers - 1 - minHeightIndex;

			if (maxHeightIndex > minHeightIndex) {
				result--;
			}

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
