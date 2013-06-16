/**
 * 
 */
package p266;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P266B_QueueAtTheSchool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs
			String[] line = reader.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int t = Integer.parseInt(line[1]);

			String queue = reader.readLine();

			reader.close();
			isr.close();
			// end reading inputs

			for (int i = 0; i < t; i++) {
				StringBuilder nextQueue = new StringBuilder(queue);

				for (int j = 0; j < n - 1; j++) {
					if (queue.charAt(j) == 'B' && queue.charAt(j + 1) == 'G') {
						nextQueue.setCharAt(j, 'G');
						nextQueue.setCharAt(j + 1, 'B');
						j++;
					}
				}

				queue = nextQueue.toString();
			}

			System.out.println(queue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
