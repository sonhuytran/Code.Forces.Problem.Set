package p551;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author stran
 * @version 1.0 (10/06/2016).
 */
public class P551A_GukiZContest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] positions = new int[n];
        ArrayList<Integer> ratings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ratings.add(scanner.nextInt());
        }

        ArrayList<Integer> sortedRatings = (ArrayList<Integer>) ratings.clone();
        Collections.sort(sortedRatings, Collections.reverseOrder());

        positions[0] = 1;
        for (int i = 1; i < n; i++) {
            if (sortedRatings.get(i).equals(sortedRatings.get(i - 1))) {
                positions[i] = positions[i - 1];
            } else {
                positions[i] = i + 1;
            }
        }

        int[] initialPositions = new int[n];
        for (int i = 0; i < n; i++) {
            initialPositions[i] = positions[sortedRatings.indexOf(ratings.get(i))];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(initialPositions[i] + " ");
        }
    }
}
