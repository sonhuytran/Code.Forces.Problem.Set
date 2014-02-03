/**
 * 
 */
package spoj.classical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Huy
 * 
 */
class P42_AddingReversedNumbers {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);

		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			String[] inputs = reader.readLine().split(" ");
			int charIndex = 0, n1 = 0, n2 = 0, sum = 0;
			StringBuilder resultBuilder = new StringBuilder();

			while (charIndex < inputs[0].length()
					&& charIndex < inputs[1].length()) {
				n1 = Character.getNumericValue(inputs[0].charAt(charIndex));
				n2 = Character.getNumericValue(inputs[1].charAt(charIndex));

				sum += (n1 + n2);

				if (sum < 10) {
					resultBuilder.append(sum);
					sum = 0;
				} else {
					resultBuilder.append(sum - 10);
					sum = 1;
				}

				charIndex++;
			}

			while (charIndex < inputs[0].length()) {
				n1 = Character.getNumericValue(inputs[0].charAt(charIndex));
				sum += n1;

				if (sum < 10) {
					resultBuilder.append(sum);
					sum = 0;
				} else {
					resultBuilder.append(sum - 10);
					sum = 1;
				}

				charIndex++;
			}

			while (charIndex < inputs[1].length()) {
				n2 = Character.getNumericValue(inputs[1].charAt(charIndex));
				sum += n2;

				if (sum < 10) {
					resultBuilder.append(sum);
					sum = 0;
				} else {
					resultBuilder.append(sum - 10);
					sum = 1;
				}

				charIndex++;
			}

			while (sum > 0) {
				resultBuilder.append(sum);
				sum = 0;
			}

			while (resultBuilder.length() > 0
					&& resultBuilder.charAt(0) == '0') {
				resultBuilder.deleteCharAt(0);
			}

			if (resultBuilder.length() <= 0) {
				resultBuilder.append('0');
			}
			
			System.out.println(resultBuilder);
		}

		reader.close();
		isr.close();
	}
}
