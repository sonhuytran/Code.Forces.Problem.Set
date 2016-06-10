package p443;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P443A_AntonLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine()
            .replaceAll("\\s+", "")
            .replace("{", "")
            .replace("}", "");

        if (input.length() <= 0) {
            System.out.println(0);
            return;
        }

        String inputs[] = input.split(",");

        Set<String> charSet = new HashSet<>();
        Collections.addAll(charSet, inputs);

        System.out.println(charSet.size());
    }
}
