/**
 * 
 */
package p294;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P294A_ShaassAndOskols {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int nLines = scanner.nextInt();
		scanner.nextLine();
		int[] birds = new int[nLines + 1];

		for (int i = 1; i <= nLines; i++) {
			birds[i] = scanner.nextInt();
		}

		scanner.nextLine();

		int nShots = scanner.nextInt();
		scanner.nextLine();

		int[] shotLine = new int[nShots];
		int[] shotBird = new int[nShots];

		for (int i = 0; i < nShots; i++) {
			shotLine[i] = scanner.nextInt();
			shotBird[i] = scanner.nextInt();
			scanner.nextLine();
		}

		scanner.close();

		for (int i = 0; i < nShots; i++) {
			int currentShotLine = shotLine[i];
			int currentShotBird = shotBird[i];

			if (currentShotLine > 1) {
				birds[currentShotLine - 1] += currentShotBird - 1;
			}

			if (currentShotLine < nLines) {
				birds[currentShotLine + 1] += birds[currentShotLine]
						- currentShotBird;
			}

			birds[currentShotLine] = 0;
		}
		
		for (int i = 1; i <= nLines; i++) {
			System.out.println(birds[i]);
		}
	}
}
