package com.zlx.akoj;

import java.util.Scanner;

public class e1247 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			System.out.println(slove(n));
		}
	}

	private static int slove(int n) {
		
		return f(n, n);
	}

	private static int f(int n, int m) {

		if (n < 1 || m < 1)
			return 0;
		if (n == 1 || m == 1)
			return 1;
		if (n<m)
			
			return f(n, n);
		if (m == n)
			return f(n, m - 1) + 1;

		return f(n, m-1) + f(n-m, m );

	}

}
