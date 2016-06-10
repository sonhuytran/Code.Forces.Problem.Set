package p676;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P676A_NicholasPermutation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),
            k, pos1 = 0, posn = 0;

        for (int i = 0; i < n; i++) {
            k = scanner.nextInt();

            if (k == 1) {
                pos1 = i;
            } else if (k == n) {
                posn = i;
            }
        }

        System.out.println(Math.max(Math.max(pos1, posn),
            Math.max(n - 1 - pos1, n - 1 - posn)));
    }
}
