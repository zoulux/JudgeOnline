package com.zlx.akoj;

import java.util.Scanner;

public class e1041new {
	static int moeny[] = { 100, 50, 20, 10, 5, 2, 1 };

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			solve(n);
		}
	}

	private static void solve(int n) {
		while (n != 0) {
			for (int i = 0; i <moeny.length; i++) {
					if (n>=moeny[i]) {
						System.out.println(moeny[i]);
						n=n-moeny[i];
						break;
					}
			}
		}

	}

	private static int f(int n) {

		if (n == 100)
			return 100;
		if (n == 50)
			return 50;
		if (n == 20)
			return 20;
		if (n == 10)
			return 10;
		if (n == 5)
			return 5;
		if (n == 2)
			return 2;
		if (n == 1)
			return 1;
		if (n > 100) {
			return n - 100;
		}
		if (n > 50) {
			return n - 50;
		}

		return n;

	}
}
