package p527;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P527A_PlayingPaper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong(),
            b = scanner.nextLong(),
            squares = 0;

        while (b > 0) {
            long nextSquares = a / b;
            squares += nextSquares;

            long temp = a - nextSquares * b;
            a = b;
            b = temp;
        }

        System.out.println(squares);
    }
}
