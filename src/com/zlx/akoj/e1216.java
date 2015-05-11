package com.zlx.akoj;

import java.util.Scanner;

public class e1216 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();

			int[][] snake = new int[n][n];
			int i = 0, j = 0, m = 1;
			snake[0][0] = 1;
			while (m < n * n) {
					while (j+1<n&&snake[i][j+1]==0) {
						snake[i][++j] = ++m;
					}
			}
		}
	}
}
