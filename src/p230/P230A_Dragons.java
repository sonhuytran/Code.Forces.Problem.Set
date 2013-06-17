/**
 * 
 */
package p230;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Son-Huy TRAN
 * 
 */
public class P230A_Dragons {

	public static class Dragon implements Comparable<Dragon> {
		private int strength;
		private int bonusStrength;

		public int getStrength() {
			return strength;
		}

		public void setStrength(int strength) {
			this.strength = strength;
		}

		public int getBonusStrength() {
			return bonusStrength;
		}

		public void setBonusStrength(int bonusStrength) {
			this.bonusStrength = bonusStrength;
		}

		public Dragon(int strength, int bonusStrength) {
			super();
			this.strength = strength;
			this.bonusStrength = bonusStrength;
		}

		@Override
		public int compareTo(Dragon dragon) {
			if (this.getStrength() < dragon.getStrength()) {
				return -1;
			} else if (this.getStrength() > dragon.getStrength()) {
				return 1;
			} else {
				if (this.getBonusStrength() > dragon.getBonusStrength()) {
					return -1;
				} else if (this.getBonusStrength() < dragon.getBonusStrength()) {
					return 1;
				}
			}

			return 0;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int s = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.nextLine();

		ArrayList<Dragon> dragons = new ArrayList<Dragon>();

		for (int i = 0; i < n; i++) {
			int strength = scanner.nextInt();
			int bonusStrength = scanner.nextInt();

			Dragon dragon = new Dragon(strength, bonusStrength);
			dragons.add(dragon);

			scanner.nextLine();
		}

		scanner.close();

		Collections.sort(dragons);

		boolean result = true;

		for (Iterator<Dragon> iterator = dragons.iterator(); iterator.hasNext();) {
			Dragon dragon = (Dragon) iterator.next();

			if (s <= dragon.getStrength()) {
				result = false;
				break;
			} else {
				s += dragon.getBonusStrength();
			}
		}

		System.out.println(result ? "YES" : "NO");
	}
}