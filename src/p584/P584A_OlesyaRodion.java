package p584;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P584A_OlesyaRodion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),
            t = scanner.nextInt();

        if (n == 1 && t == 10) {
            System.out.println(-1);
            return;
        }

        StringBuilder builder = new StringBuilder("" + t);
        for (int i = (t == 10 ? 2 : 1); i < n; i++) {
            builder.append(0);
        }

        System.out.println(builder);
    }
}
