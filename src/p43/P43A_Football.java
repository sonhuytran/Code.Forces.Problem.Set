package p43;

import java.util.ArrayList;
import java.util.Scanner;

public class P43A_Football {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int goals = scanner.nextInt();
		ArrayList<String> teams = new ArrayList<>(2);
		int[] goalsPerTeam = new int[2];
		scanner.nextLine();
		String teamGoal = "";

		for (int i = 0; i < goals; i++) {
			teamGoal = scanner.nextLine();

			if (teams.size() == 0) {
				teams.add(teamGoal);
				goalsPerTeam[0] = 1;
			} else if (teams.size() == 1) {
				if (teams.get(0).equals(teamGoal)) {
					goalsPerTeam[0]++;
				} else {
					teams.add(teamGoal);
					goalsPerTeam[1] = 1;
				}
			} else {
				if (teams.get(0).equals(teamGoal)) {
					goalsPerTeam[0]++;
				} else {
					goalsPerTeam[1]++;
				}
			}
		}

		scanner.close();
		
		if (goalsPerTeam[0] > goalsPerTeam[1]) {
			System.out.println(teams.get(0));
		} else {
			System.out.println(teams.get(1));
		}
	}
}
