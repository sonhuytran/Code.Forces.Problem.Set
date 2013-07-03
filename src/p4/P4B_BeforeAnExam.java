package p4;

import java.util.Scanner;

public class P4B_BeforeAnExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sumTimes = scanner.nextInt();
		int[] min = new int[n];
		int[] max = new int[n];
		int sumMin = 0, sumMax = 0;

		for (int i = 0; i < n; i++) {
			min[i] = scanner.nextInt();
			max[i] = scanner.nextInt();
			sumMin += min[i];
			sumMax += max[i];
		}

		scanner.close();

		if (sumMin <= sumTimes && sumTimes <= sumMax) {
			System.out.println("YES");
			int d = sumTimes - sumMin;
			int i = 0, temp = 0;

			while (d > 0) {
				temp = max[i] - min[i];

				if (d >= temp) {
					min[i] = max[i];
					d -= temp;
				} else {
					min[i] += (temp - d);
					d = 0;
				}

				i++;
			}

			StringBuilder stringBuilder = new StringBuilder();

			for (int j = 0; j < n; j++) {
				stringBuilder.append(min[j]);
				stringBuilder.append(' ');
			}
			
			System.out.println(stringBuilder.toString().trim());
		} else {
			System.out.println("NO");
		}
	}
}
