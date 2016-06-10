package p510;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P510A_FoxSnake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),
            m = scanner.nextInt(),
            m1 = m - 1;

        char[] cs1 = new char[m],
            cs2 = new char[m],
            cs3 = new char[m];

        cs1[0] = cs1[m1] = cs2[m1] = cs3[0] = '#';
        cs2[0] = cs3[m1] = '.';

        for (int i = 1; i < m1; i++) {
            cs1[i] = '#';
            cs2[i] = cs3[i] = '.';
        }

        String s1 = new String(cs1),
            s2 = new String(cs2),
            s3 = new String(cs3);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(s1);
            } else if (i % 4 == 1) {
                System.out.println(s2);
            } else {
                System.out.println(s3);
            }
        }
    }
}
