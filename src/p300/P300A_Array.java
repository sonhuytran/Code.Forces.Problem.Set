/**
 * 
 */
package p300;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P300A_Array {

	private static String arrayToString(ArrayList<Integer> numbers) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(numbers.size());

		for (int i = 0; i < numbers.size(); i++) {
			stringBuilder.append(" ");
			stringBuilder.append(numbers.get(i));
		}

		return stringBuilder.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		scanner.close();

		ArrayList<Integer> negatives = new ArrayList<>();
		ArrayList<Integer> positives = new ArrayList<>();
		ArrayList<Integer> zeros = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int number = numbers[i];

			if (number == 0) {
				zeros.add(number);
			} else if (number > 0) {
				positives.add(number);
			} else {
				negatives.add(number);
			}
		}

		if (positives.isEmpty()) {
			int number1 = negatives.get(0);
			negatives.remove(0);

			int number2 = negatives.get(0);
			negatives.remove(0);

			positives.add(number1);
			positives.add(number2);
		}

		if (negatives.size() % 2 == 0) {
			int number1 = negatives.get(0);
			negatives.remove(0);

			zeros.add(number1);
		}
		
		System.out.println(arrayToString(negatives));
		System.out.println(arrayToString(positives));
		System.out.println(arrayToString(zeros));
	}
}
