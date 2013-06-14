/**
 * 
 */
package p136;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P136A_Presents {

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
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
			int nFriends = Integer.parseInt(reader.readLine());
			String[] givingToStrings = reader.readLine().split(" ");
			int[] givingTos = new int[nFriends];

			for (int i = 0; i < nFriends; i++) {
				givingTos[i] = Integer.parseInt(givingToStrings[i]);
			}

			reader.close();
			isr.close();
			// end reading inputs

			// create the indexes array
			int[] given = new int[nFriends];

			for (int i = 0; i < nFriends; i++) {
				given[i] = i + 1;
			}

			// sort the givingtos array
			for (int i = 0; i < nFriends - 1; i++) {
				for (int j = i + 1; j < nFriends; j++) {
					if (givingTos[i] > givingTos[j]) {
						swap(givingTos, i, j);
						swap(given, i, j);
					}
				}
			}

			// print the output
			for (int i = 0; i < nFriends - 1; i++) {
				System.out.print(given[i] + " ");
			}

			System.out.print(given[nFriends - 1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
