package p105;

import java.util.Scanner;
import java.util.TreeSet;

public class P105A_Transmigration {

	private static class Skill implements Comparable<Skill> {

		private static final int TRANSMIGRATION_LIMIT = 100;

		private String name;
		private int level;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public Skill(String name, int level) {
			super();
			this.setName(name);
			this.setLevel(level);
		}

		@Override
		public int compareTo(Skill skill) {
			return this.getName().compareTo(skill.getName());
		}

		@Override
		public boolean equals(Object skill) {
			if (skill.getClass().equals(this.getClass())) {
				return this.getName().equals(((Skill) skill).getName());
			}

			return false;
		}

		public boolean transmigrate(int k) {
			this.setLevel(this.getLevel() * k / 100);

			if (this.getLevel() < TRANSMIGRATION_LIMIT) {
				this.setLevel(0);

				return false;
			}

			return true;
		}

		@Override
		public String toString() {
			return this.getName() + " " + this.getLevel();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), m = scanner.nextInt();
		int k = (int) Math.round(scanner.nextDouble() * 100);

		TreeSet<Skill> skills = new TreeSet<Skill>();
		Skill newSkill = null;

		while (n > 0) {
			newSkill = new Skill(scanner.next(), scanner.nextInt());

			if (newSkill.transmigrate(k)) {
				skills.add(newSkill);
			}

			n--;
		}

		while (m > 0) {
			newSkill = new Skill(scanner.next(), 0);

			if (!skills.contains(newSkill)) {
				skills.add(newSkill);
			}

			m--;
		}

		scanner.close();

		StringBuilder result = new StringBuilder();
		result.append(skills.size());
		result.append('\n');

		for (Skill skill : skills) {
			result.append(skill);
			result.append('\n');
		}

		System.out.println(result.toString().trim());
	}
}
