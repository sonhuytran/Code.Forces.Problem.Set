package p479;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (08/06/2016).
 */
public class P479A_Expression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(),
            b = scanner.nextInt(),
            c = scanner.nextInt();

        if (a == 1 && b == 1 && c == 1) {
            System.out.println(3);
        } else if (a == 1 && b == 1) {
            System.out.println(c * 2);
        } else if (b == 1 && c == 1) {
            System.out.println(a * 2);
        } else if (a == 1 && c == 1) {
            System.out.println(b + 2);
        } else if (a == 1) {
            System.out.println((1 + b) * c);
        } else if (c == 1) {
            System.out.println(a * (b + 1));
        } else if (b == 1) {
            if (a < c) {
                System.out.println((a + 1) * c);
            } else {
                System.out.println(a * (1 + c));
            }
        } else {
            System.out.println(a * b * c);
        }
    }
}
