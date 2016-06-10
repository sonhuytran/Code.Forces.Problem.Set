package p617;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P617A_Elephant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),
            result = n / 5;

        if (n % 5 != 0) {
            result++;
        }

        System.out.println(result);
    }
}
