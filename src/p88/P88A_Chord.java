package p88;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P88A_Chord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String[] noteArray = new String[] { "C", "C#", "D", "D#", "E",
				"F", "F#", "G", "G#", "A", "B", "H" };
		final List<String> notes = Arrays.asList(noteArray);
		final String major = "major", minor = "minor", strange = "strange";

		Scanner scanner = new Scanner(System.in);
		String note1 = scanner.next();
		String note2 = scanner.next();
		String note3 = scanner.next();
		scanner.close();

		int[] noteIndex = new int[] { notes.indexOf(note1),
				notes.indexOf(note2), notes.indexOf(note3) };
		Arrays.sort(noteIndex);

		if ((noteIndex[1] - noteIndex[0] == 4 && noteIndex[2] - noteIndex[1] == 3)
				|| (noteIndex[1] - noteIndex[0] == 3 && noteIndex[2]
						- noteIndex[1] == 5)
				|| (noteIndex[1] - noteIndex[0] == 5 && noteIndex[2]
						- noteIndex[1] == 4)) {
			System.out.println(major);
		} else if ((noteIndex[1] - noteIndex[0] == 3 && noteIndex[2]
				- noteIndex[1] == 4)
				|| (noteIndex[1] - noteIndex[0] == 4 && noteIndex[2]
						- noteIndex[1] == 5)
				|| (noteIndex[1] - noteIndex[0] == 5 && noteIndex[2]
						- noteIndex[1] == 3)) {
			System.out.println(minor);
		} else {
			System.out.println(strange);
		}
	}
}
