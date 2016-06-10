package p486;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (08/06/2016).
 */
public class P486A_CalculatingFunction {

    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();

        if (n % 2 == 0) {
            System.out.println(n / 2);
            return;
        }

        System.out.println((n + 1) / 2 - n - 1);
    }
}
