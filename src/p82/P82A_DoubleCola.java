/**
 * 
 */
package p82;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P82A_DoubleCola {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			long input = Integer.parseInt(reader.readLine());
			String[] persons = { "Sheldon", "Leonard", "Penny", "Rajesh",
					"Howard" };
			int queueLength = 5;

			while (input > queueLength) {
				input -= queueLength;
				queueLength *= 2;
			}

			int canPerPeson = queueLength / 5;
			int personIndex = 0;

			while (input > canPerPeson) {
				input -= canPerPeson;
				personIndex++;
			}

			System.out.println(persons[personIndex]);

			reader.close();
			isr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
