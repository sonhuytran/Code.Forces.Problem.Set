package p581;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P581A_VasyaHipster {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(),
            b = scanner.nextInt(),
            x = Math.min(a, b),
            y = Math.abs(a - b) / 2;

        System.out.println(x + " " + y);
    }
}
