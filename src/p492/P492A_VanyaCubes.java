package p492;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P492A_VanyaCubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(1);
            return;
        }

        int length = 1,
            currentLine = 1;
        n--;

        while (n > 0) {
            currentLine = currentLine + (length + 1);
            n -= currentLine;

            if (n >= 0) {
                length++;
            }
        }

        System.out.println(length);
    }
}
