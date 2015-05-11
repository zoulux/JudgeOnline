package com.zlx.akoj;
import java.util.Scanner;

public class e1059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int M = cin.nextInt();
			l(N);
			c(M, N);
			l(N);
			System.out.println();

		}
	}

	private static void c(int m, int n) {
		for (int i = 0; i < m; i++) {
			System.out.print("|");
			for (int j = 0; j < n; j++) {
				System.out.print(" ");

			}
			System.out.print("|");
			System.out.println();
		}
	}

	private static void l(int n) {
		for (int i = 0; i < n + 2; i++) {
			if (i == 0)
				System.out.print("+");
			else if (i == n + 1)
				System.out.print("+");
			else
				System.out.print("-");
		}
		System.out.println();
	}
}