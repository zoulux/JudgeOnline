package com.zlx.akoj;

import java.util.Scanner;

public class e1043 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int c[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					c[i][j] = cin.nextInt();
				}
			}
			solve(c);
		}
	}

	private static void solve(int[][] c) {
	

	}
}
