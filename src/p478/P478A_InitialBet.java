package p478;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P478A_InitialBet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt();
        }

        System.out.println((sum < 5 || sum % 5 != 0) ? -1 : sum / 5);
    }
}
