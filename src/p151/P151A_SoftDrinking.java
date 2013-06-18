/**
 * 
 */
package p151;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P151A_SoftDrinking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int l = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int p = scanner.nextInt();
		int nl = scanner.nextInt();
		int np = scanner.nextInt();

		scanner.close();

		int drink = k * l;
		int limes = c * d;

		int toastsForDrink = drink / nl;
		int toastsForLimes = limes;
		int toastsForSalt = p / np;

		int toastsTotal = Math.min(Math.min(toastsForDrink, toastsForLimes),
				toastsForSalt);
		int toastsPerPerson = toastsTotal / n;

		System.out.println(toastsPerPerson);
	}
}
