package p448;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P448A_Rewards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;

        for (int i = 0; i < 3; i++) {
            a += scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            b += scanner.nextInt();
        }

        int n = scanner.nextInt(),
            minShelves = (int) Math.ceil(a * 1.0 / 5) +
                (int) Math.ceil(b * 1.0 / 10);

        System.out.println(n >= minShelves ? "YES" : "NO");
    }
}
