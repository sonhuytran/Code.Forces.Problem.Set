package p472;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (08/06/2016).
 */
public class P472A_DesignTutorialLearnFromMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        if (n % 2 == 0) {
            System.out.println(8 + " " + (n - 8));
        } else {
            System.out.println(9 + " " + (n - 9));
        }
    }
}
