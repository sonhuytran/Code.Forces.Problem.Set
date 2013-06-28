package p218;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P218B_Airport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		ArrayList<Integer> seats = new ArrayList<>(m);

		for (int i = 0; i < m; i++) {
			seats.add(scanner.nextInt());
		}

		scanner.close();
		Collections.sort(seats);

		int min = 0, temp = n, index = 0;

		while (index < m && temp > 0) {
			int seat = seats.get(index);

			if (temp >= seat) {
				temp -= seat;
				min += seat * (seat + 1) / 2;
			} else {
				for (int i = seat - temp + 1; i <= seat; i++) {
					min += i;
				}

				temp = 0;
			}

			index++;
		}

		int max = 0;
		temp = n;
		index = m - 1;

		while (temp > 0) {
			int seat = seats.get(index);
			max += seat;
			seat--;
			seats.set(index, seat);
			temp--;

			if (index > 0 && seats.get(index - 1) > seat) {
				int i = index - 1;

				while (i >= 0 && seats.get(i) > seat) {
					i--;
				}

				i++;
				int swap = seats.get(i);
				seats.set(i, seat);
				seats.set(index, swap);
			}
		}

		System.out.println(max + " " + min);
	}
}
