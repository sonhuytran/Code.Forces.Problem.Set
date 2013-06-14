/**
 * 
 */
package p231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P231A_Team {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			int nProblem = Integer.parseInt(reader.readLine());
			int nPlayers = 3;
			int minSolution = 2;
			int[][] problems = new int[nProblem][3];

			for (int i = 0; i < nProblem; i++) {
				String inputString = reader.readLine();
				String[] inputStrings = inputString.split(" ");

				for (int j = 0; j < nPlayers; j++) {
					problems[i][j] = Integer.parseInt(inputStrings[j]);
				}
			}

			reader.close();
			isr.close();

			int problemsSolved = 0;

			for (int i = 0; i < nProblem; i++) {
				int countSolution = 0;

				for (int j = 0; j < nPlayers; j++) {
					countSolution += problems[i][j];
				}

				if (countSolution >= minSolution) {
					problemsSolved++;
				}
			}

			System.out.println(problemsSolved);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
