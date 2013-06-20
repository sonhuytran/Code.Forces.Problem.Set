/**
 * 
 */
package p4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P4A_ChatServerOutgoingTraffic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs
			String line = null;
			int countPeople = 0;
			int sumTraffic = 0;
			
			do {
				line = reader.readLine();
				
				if (line != null && !line.isEmpty()) {
					if (line.startsWith("+")) {
						countPeople++;
					} else if (line.startsWith("-")) {
						countPeople--;
					} else {
						int index = line.indexOf(':');
						
						if (index > 0) {
							String message = line.substring(index + 1);
							int length = message.length();
							sumTraffic += length * countPeople;
						}
					}
				}
			} while (line != null && !line.isEmpty());

			reader.close();
			isr.close();
			// end reading inputs
			
			System.out.println(sumTraffic);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
