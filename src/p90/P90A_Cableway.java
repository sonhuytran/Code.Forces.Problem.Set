package p90;

import java.util.Scanner;

public class P90A_Cableway {

	private static int getNumberOfCars(int group) {
		if (group % 2 == 0) {
			return group / 2;
		} else {
			return (group + 1) / 2;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int red = scanner.nextInt();
		int green = scanner.nextInt();
		int blue = scanner.nextInt();
		scanner.close();

		int redCars = getNumberOfCars(red);
		int greenCars = getNumberOfCars(green);
		int blueCars = getNumberOfCars(blue);

		if (blueCars >= greenCars && blueCars >= redCars) {
			System.out.println(3 * blueCars - 1 + 30);
		} else if (greenCars >= redCars) {
			System.out.println(3 * greenCars - 2 + 30);
		} else {
			System.out.println(3 * redCars - 3 + 30);
		}
	}
}
