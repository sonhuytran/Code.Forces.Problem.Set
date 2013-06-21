/**
 * 
 */
package p312;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P312A_WhoseSentenceIsIt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String freda = "lala.", rainbow = "miao.";
		boolean isFreda = false, isRainbow = false;

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		byte[] results = new byte[n];
		String[] resultOuputs = { "Freda's", "Rainbow's",
				"OMG>.< I don't know!" };

		for (int i = 0; i < n; i++) {
			String input = scanner.nextLine();
			isFreda = input.endsWith(freda);
			isRainbow = input.startsWith(rainbow);

			if (isFreda && !isRainbow) {
				results[i] = 0;
			} else if (!isFreda && isRainbow) {
				results[i] = 1;
			} else {
				results[i] = 2;
			}
		}

		scanner.close();
		
		for (int i = 0; i < n; i++) {
			System.out.println(resultOuputs[results[i]]);
		}
	}
}
