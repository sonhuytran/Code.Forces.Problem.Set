/**
 * 
 */
package utils;

/**
 * @author Son-Huy TRAN
 * 
 */
public class CodeForcesUtils {
	public static int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}
}
