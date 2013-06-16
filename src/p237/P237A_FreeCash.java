/**
 * 
 */
package p237;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P237A_FreeCash {

	private int nVisitors;
	private int[] hours;
	private int[] minutes;

	private void readInputs() {
		Scanner scanner = new Scanner(System.in);

		nVisitors = scanner.nextInt();
		hours = new int[nVisitors];
		minutes = new int[nVisitors];

		for (int i = 0; i < nVisitors; i++) {
			hours[i] = scanner.nextInt();
			minutes[i] = scanner.nextInt();
		}

		scanner.close();
	}

	private P237A_FreeCash() {
		this.readInputs();
	}

	public int getNumberOfCashes() {
		int minCashes = 0;
		int index = 0;

		while (index < nVisitors) {
			int i = index + 1, count = 1;

			while (i < nVisitors && hours[i] == hours[index]
					&& minutes[i] == minutes[index]) {
				i++;
				count++;
			}

			if (count > minCashes) {
				minCashes = count;
			}

			index = i;
		}

		return minCashes;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		P237A_FreeCash p237 = new P237A_FreeCash();
		System.out.println(p237.getNumberOfCashes());
	}
}
