/**
 * 
 */
package p155;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P155A_ILoveUsername {

	private static int countAmazingPerformances(int nPerformances,
			int[] performances) {
		if (nPerformances < 1) {
			return 0;
		}

		int minPerformance = performances[0];
		int maxPerformance = performances[0];
		int amazingPerformances = 0;

		for (int i = 1; i < nPerformances; i++) {
			int currentPerformance = performances[i];

			if (currentPerformance > maxPerformance) {
				amazingPerformances++;
				maxPerformance = currentPerformance;
			} else if (currentPerformance < minPerformance) {
				amazingPerformances++;
				minPerformance = currentPerformance;
			}
		}

		return amazingPerformances;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int nPerformances = scanner.nextInt();
		int[] performances = new int[nPerformances];

		for (int i = 0; i < nPerformances; i++) {
			performances[i] = scanner.nextInt();
		}

		scanner.close();

		int result = countAmazingPerformances(nPerformances, performances);
		System.out.println(result);
	}
}
