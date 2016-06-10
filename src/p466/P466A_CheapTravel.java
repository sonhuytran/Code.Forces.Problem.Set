package p466;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P466A_CheapTravel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),
            m = scanner.nextInt(),
            a = scanner.nextInt(),
            b = scanner.nextInt();

        if (b > a * m) {
            System.out.println(a * n);
            return;
        }

        if (b < a) {
            System.out.println((int) Math.ceil(n * 1.0 / m) * b);
            return;
        }

        if (n < m) {
            System.out.println(Math.min(n * a, b));
            return;
        }

        int bTickets = n / m,
            bAmount = bTickets * b,
            aTickets = n - bTickets * m,
            aAmount = aTickets * a;

        System.out.println(bAmount + aAmount);
    }
}
