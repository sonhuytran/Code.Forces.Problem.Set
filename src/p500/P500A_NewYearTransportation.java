package p500;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P500A_NewYearTransportation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),
            t = scanner.nextInt();

        int[] portals = new int[n];

        for (int i = 1; i < n; i++) {
            portals[i] = scanner.nextInt();
        }

        int position = 1;

        while (position < t) {
            position += portals[position];
        }

        if (position == t) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
    }
}
