/**
 * 
 */
package p63;

import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P63A_SinkingShip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] crewType = { "rat", "woman", "child", "man", "captain" };
		String newLine = "\n";
		StringBuilder[] crew = new StringBuilder[4];

		for (int i = 0; i < 4; i++) {
			crew[i] = new StringBuilder();
		}

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < n; i++) {
			String name = scanner.next();
			String type = scanner.next();
			scanner.nextLine();

			if (type.equals(crewType[0])) {
				crew[0].append(name);
				crew[0].append(newLine);
			} else if (type.equals(crewType[1]) || type.equals(crewType[2])) {
				crew[1].append(name);
				crew[1].append(newLine);
			} else if (type.equals(crewType[3])) {
				crew[2].append(name);
				crew[2].append(newLine);
			} else if (type.equals(crewType[4])) {
				crew[3].append(name);
				crew[3].append(newLine);
			}
		}

		scanner.close();

		for (int i = 0; i < 4; i++) {
			if (crew[i].length() > 0) {
				System.out.println(crew[i].toString().trim());
			}
		}
	}
}
