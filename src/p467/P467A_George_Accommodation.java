package p467;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (08/06/2016).
 */
public class P467A_George_Accommodation {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt(),
            p, q,
            result = 0;

        for (int i = 0; i < n; i++) {
            p = reader.nextInt();
            q = reader.nextInt();

            if (q - p > 1) {
                result++;
            }
        }

        System.out.println(result);
    }
}