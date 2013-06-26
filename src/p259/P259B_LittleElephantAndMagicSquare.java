/**
 * 
 */
package p259;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P259B_LittleElephantAndMagicSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] square = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				square[i][j] = scanner.nextInt();
			}
		}

		scanner.close();

		square[1][1] = (square[0][2] + square[1][2] + square[1][0]
				+ square[2][0] - square[0][1] - square[2][1]) / 2;
		square[0][0] = square[0][2] + square[1][2] - square[1][1];
		square[2][2] = square[1][0] + square[2][0] - square[1][1];

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				stringBuilder.append(square[i][j]);
				stringBuilder.append(' ');
			}

			stringBuilder.append('\n');
		}
		
		System.out.println(stringBuilder);
	}
}
