/**
 * 
 */
package p69;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P69_YoungPhysicist {

	private static boolean isEquilibre(int[][] vectors, int nVectors,
			int nDimensions) {
		for (int i = 0; i < nDimensions; i++) {
			int sumDimensions = 0;

			for (int j = 0; j < nVectors; j++) {
				sumDimensions += vectors[j][i];
			}

			if (sumDimensions != 0) {
				return false;
			}
		}

		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// reading inputs
			Scanner scanner = new Scanner(System.in);
			int nVectors = scanner.nextInt();
			int nDimensions = 3;

			int[][] vectors = new int[nVectors][nDimensions];

			for (int i = 0; i < nVectors; i++) {
				for (int j = 0; j < nDimensions; j++) {
					vectors[i][j] = scanner.nextInt();
				}
			}

			scanner.close();
			// end reading inputs

			boolean result = isEquilibre(vectors, nVectors, nDimensions);
			System.out.println(result ? "YES" : "NO");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
