/**
 * 
 */
package p116;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P116A_Tram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			int nStops = Integer.parseInt(reader.readLine());
			int[] as = new int[nStops];
			int[] bs = new int[nStops];

			for (int i = 0; i < nStops; i++) {
				String inputString = reader.readLine();
				String[] abString = inputString.split(" ");
				int a = Integer.parseInt(abString[0]);
				int b = Integer.parseInt(abString[1]);
				as[i] = a;
				bs[i] = b;
			}
			
			reader.close();
			isr.close();
			
			int nPassengersMax = 0;
			int nPassengers = 0;
			
			for (int i = 0; i < nStops; i++) {
				nPassengers = nPassengers - as[i] + bs[i];
				
				if (nPassengers > nPassengersMax) {
					nPassengersMax = nPassengers;
				}
			}

			System.out.println(nPassengersMax);
		} catch (Exception e) {
		}
	}
}
