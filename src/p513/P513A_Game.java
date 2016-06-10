package p513;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P513A_Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(),
            n2 = scanner.nextInt();
        scanner.nextInt();
        scanner.nextInt();

        System.out.println(n1 > n2 ? "First" : "Second");
    }
}
