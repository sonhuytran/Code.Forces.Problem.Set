package p56;

import java.util.Scanner;

public class P56A_BAR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String alcools = "ABSINTH,BEER,BRANDY,CHAMPAGNE,GIN,RUM,SAKE,TEQUILA,VODKA,WHISKEY,WINE";
		int limit = 18;

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), count = 0;
		scanner.nextLine();
		String input;

		while (n > 0) {
			input = scanner.next();

			if (Character.isDigit(input.charAt(0))) {
				if (Integer.parseInt(input) < limit) {
					count++;
				}
			} else {
				if (alcools.indexOf(input) > -1) {
					count++;
				}
			}

			n--;
		}

		scanner.close();
		System.out.println(count);
	}
}
