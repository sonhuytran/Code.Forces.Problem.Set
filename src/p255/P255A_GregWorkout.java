/**
 * 
 */
package p255;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P255A_GregWorkout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();
		int[] exercises = new int[n];

		for (int i = 0; i < n; i++) {
			exercises[i] = scanner.nextInt();
		}

		scanner.close();

		String[] exercicesName = { "chest", "biceps", "back" };
		int[] exercicesTotal = new int[3];

		for (int i = 0, j = 0; i < n; i++, j = (j + 1) % 3) {
			exercicesTotal[j] += exercises[i];
		}

		int iMax = -1, exercicesMax = Integer.MIN_VALUE;

		for (int i = 0; i < 3; i++) {
			if (exercicesTotal[i] > exercicesMax) {
				exercicesMax = exercicesTotal[i];
				iMax = i;
			}
		}

		System.out.println(exercicesName[iMax]);
	}
}
