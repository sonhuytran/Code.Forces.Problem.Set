/**
 * 
 */
package p8;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P8A_TrainAndPeter {

	private static boolean canSee(String stations, String firstWake,
			String secondWake) {
		int index1 = stations.indexOf(firstWake);

		if (index1 == -1) {
			return false;
		}

		int index2 = stations.lastIndexOf(secondWake);

		if (index2 == -1) {
			return false;
		}

		if (index1 + firstWake.length() > index2) {
			return false;
		}

		return true;
	}

	private static String reverse(String string) {
		return (new StringBuilder(string)).reverse().toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stations = scanner.nextLine();
		String firstWake = scanner.nextLine();
		String secondWake = scanner.nextLine();
		scanner.close();

		String stationsReverse = reverse(stations);

		boolean forward = canSee(stations, firstWake, secondWake);
		boolean backward = canSee(stationsReverse, firstWake, secondWake);

		if (forward && backward) {
			System.out.println("both");
		} else if (forward) {
			System.out.println("forward");
		} else if (backward) {
			System.out.println("backward");
		} else {
			System.out.println("fantasy");
		}
	}
}
