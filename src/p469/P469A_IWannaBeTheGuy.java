package p469;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (08/06/2016).
 */
public class P469A_IWannaBeTheGuy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        boolean[] passed = new boolean[n + 1];

        for (int i = 0; i < p; i++) {
            passed[scanner.nextInt()] = true;
        }

        p = scanner.nextInt();
        for (int i = 0; i < p; i++) {
            passed[scanner.nextInt()] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!passed[i]) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }

        System.out.println("I become the guy.");
    }
}
