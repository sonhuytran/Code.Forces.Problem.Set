package p546;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (08/06/2016).
 */
public class P546A_Soldier_Bananas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        long n = scanner.nextLong();
        int w = scanner.nextInt();

        long result = k * w * (w + 1) / 2 - n;

        if (result < 0) {
            result = 0;
        }

        System.out.println(result);
    }
}
