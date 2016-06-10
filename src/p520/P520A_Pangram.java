package p520;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P520A_Pangram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();

        if (input.length() < 26) {
            System.out.println("NO");
            return;
        }

        input = input.toLowerCase();
        Set<Character> charSet = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            charSet.add(input.charAt(i));
        }

        System.out.println(charSet.size() >= 26 ? "YES" : "NO");
    }
}
