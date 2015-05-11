package com.zlx.akoj;
import java.util.Scanner;

public class e1249FIB {
	static long[] FIB = new long[71];

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		// FIB[0] = FIB[1] = 1;
		// for (int i = 2; i < 70; i++)
		// FIB[i] = FIB[i - 1] + FIB[i - 2];

		while (cin.hasNext()) {
			int N = cin.nextInt();
			if (N == 0)
				break;

			System.out.println(f(N));
		}
	}

	// private static int f(long n) {
	// if (n == 1)
	// return 1;
	// if (n == 2)
	// return 2;
	// else
	// return f(n - 1) + f(n - 2);
	// }
	private static long f(int n) {

		if (FIB[n] == 0) {
			if (n == 0||n==1)
				return FIB[n] = 1;
			return FIB[n] = f(n - 1) + f(n - 2);
		} else
			return FIB[n];

	}
}
