/**
 * 
 */
package p2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P2A_Winner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();
		String[] names = new String[n];
		int[] roundScores = new int[n];
		HashMap<String, Integer> scores = new HashMap<String, Integer>(n);

		for (int i = 0; i < n; i++) {
			String name = scanner.next();
			names[i] = name;

			int score = scanner.nextInt();
			scanner.nextLine();

			Integer currentScore = scores.get(name);

			if (currentScore != null) {
				score += currentScore;
			}

			roundScores[i] = score;
			scores.put(name, score);
		}

		int max = Integer.MIN_VALUE;

		for (Entry<String, Integer> entry : scores.entrySet()) {
			max = Math.max(max, entry.getValue());
		}

		scanner.close();
		
		for (int i = 0; i < n; i++) {
			if (roundScores[i] >= max && scores.get(names[i]) == max) {
				System.out.println(names[i]);
				break;
			} 
		}
	}
}