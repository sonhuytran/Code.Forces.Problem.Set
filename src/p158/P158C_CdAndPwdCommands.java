/**
 * 
 */
package p158;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P158C_CdAndPwdCommands {

	private static Stack<String> folders = null;

	private static String pwd() {
		StringBuilder stringBuilder = new StringBuilder();

		for (String folder : folders) {
			stringBuilder.append("/");
			stringBuilder.append(folder);
		}

		stringBuilder.append("/");
		return stringBuilder.toString();
	}

	private static void cd(String pathString) {
		if (pathString.startsWith("/")) {
			folders.clear();
		}

		String[] folderStrings = pathString.split("/");

		for (String string : folderStrings) {
			if (string.equals("..")) {
				folders.pop();
			} else if (!string.isEmpty()) {
				folders.push(string);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int nCommands = scanner.nextInt();
		String[] commands = new String[nCommands];

		scanner.nextLine();

		for (int i = 0; i < nCommands; i++) {
			commands[i] = scanner.nextLine();
		}

		scanner.close();

		folders = new Stack<>();

		for (int i = 0; i < nCommands; i++) {
			if (commands[i].startsWith("pwd")) {
				System.out.println(pwd());
			} else if (commands[i].startsWith("cd")) {
				cd(commands[i].split(" ")[1]);
			}
		}
	}

}
