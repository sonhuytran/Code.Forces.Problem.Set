package p451;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (08/06/2016).
 */
public class P451A_GameWithSticks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),
            m = scanner.nextInt();

        if (m < n) {
            n = m;
        }

        if (n % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }
    }
}
