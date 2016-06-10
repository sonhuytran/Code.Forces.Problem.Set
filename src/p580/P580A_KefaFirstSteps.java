package p580;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (08/06/2016).
 */
public class P580A_KefaFirstSteps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),
            maxLength = 0,
            currentLength = 0;
        long a = 0, a1;

        while (n > 0) {
            a1 = scanner.nextLong();

            if (a1 >= a) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;

                    if (n - 1 < maxLength) {
                        break;
                    }
                }

                currentLength = 1;
            }

            a = a1;
            n--;
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
        }

        System.out.println(maxLength);
    }
}
