package p460;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (08/06/2016).
 */
public class P460A_VasyaSocks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),
            m = scanner.nextInt();

        if (n < m) {
            System.out.println(n);
            return;
        }

        int day = 0;

        do {
            day++;
            n--;

            if (day % m == 0) {
                n++;
            }
        } while (n > 0);

        System.out.println(day);
    }
}
