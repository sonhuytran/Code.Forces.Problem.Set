package p344;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P344A_Magnets {

	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);
			String last = "", line = "";

			// reading inputs
			int n = Integer.parseInt(reader.readLine());
			int result = 0;

			for (int i = 0; i < n; i++) {
				line = reader.readLine();
				if (!last.equals(line)) {
					result++;
					last = line;
				}
			}

			reader.close();
			isr.close();
			// end reading inputs

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
