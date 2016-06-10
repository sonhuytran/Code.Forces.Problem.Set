package p540;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P540A_CombinationLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String initial = scanner.nextLine();
        String lock = scanner.nextLine();

        char ci, cl;

        int step = 0,
            currentStep;

        for (int i = 0; i < n; i++) {
            ci = initial.charAt(i);
            cl = lock.charAt(i);
            currentStep = Math.abs(ci - cl);

            if (currentStep > 5) {
                currentStep = 10 - currentStep;
            }

            step += currentStep;
        }

        System.out.println(step);
    }
}
