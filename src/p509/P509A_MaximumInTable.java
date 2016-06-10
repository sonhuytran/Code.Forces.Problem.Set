package p509;

import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P509A_MaximumInTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] result = new int[]{0, 1, 2, 6, 20, 70,
            252, 924, 3432, 12870, 48620};

        System.out.println(result[n]);
    }
}
