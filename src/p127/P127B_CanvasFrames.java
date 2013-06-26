package p127;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P127B_CanvasFrames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> sticks = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			sticks.add(scanner.nextInt());
		}

		scanner.close();
		Collections.sort(sticks);

		int index = 0;
		int couples = 0;

		while (index < n) {
			int length = sticks.get(index);
			int count = 1;
			int i = index + 1;

			while (i < n && sticks.get(i) == length) {
				i++;
				count++;
			}

			index = i;
			couples += count / 2;
		}

		int result = couples / 2;
		System.out.println(result);
	}
}
