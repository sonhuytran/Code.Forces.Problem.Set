package p474;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P474A_Keyboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int step = scanner.nextLine().equals("L") ? 1 : -1;
        String message = scanner.nextLine(),
            keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        StringBuilder initial = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            int index = keyboard.indexOf(message.charAt(i));
            initial.append(keyboard.charAt(index + step));
        }

        System.out.println(initial);
    }
}
