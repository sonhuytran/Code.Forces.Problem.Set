/**
 * 
 */
package p3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P3A_ShortestPathOfTheKing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String t = scanner.nextLine();
		scanner.close();

		char sColumn = s.charAt(0);
		char sRow = s.charAt(1);
		char tColumn = t.charAt(0);
		char tRow = t.charAt(1);

		ArrayList<String> steps = new ArrayList<>();
		int stepCount = 0;

		while (sRow > tRow && sColumn < tColumn) {
			steps.add("RD");
			sColumn++;
			sRow--;

			stepCount++;
		}

		while (sRow > tRow && sColumn > tColumn) {
			steps.add("LD");
			sColumn--;
			sRow--;

			stepCount++;
		}

		while (sRow > tRow) {
			steps.add("D");
			sRow--;

			stepCount++;
		}

		while (sRow < tRow && sColumn < tColumn) {
			steps.add("RU");
			sColumn++;
			sRow++;

			stepCount++;
		}

		while (sRow < tRow && sColumn > tColumn) {
			steps.add("LU");
			sColumn--;
			sRow++;

			stepCount++;
		}

		while (sRow < tRow) {
			steps.add("U");
			sRow++;

			stepCount++;
		}

		while (sColumn < tColumn) {
			steps.add("R");
			sColumn++;

			stepCount++;
		}

		while (sColumn > tColumn) {
			steps.add("L");
			sColumn--;

			stepCount++;
		}

		System.out.println(stepCount);

		for (String string : steps) {
			System.out.println(string);
		}
	}
}
