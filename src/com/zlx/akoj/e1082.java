package com.zlx.akoj;

import java.util.Scanner;

public class e1082 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {

			int n = cin.nextInt();
			int[][] snake = new int[n][n];
			int m, i, j;
			m = snake[i = 0][j = 0] = 1;
			while (m < n * n) {
				while (j + 1 < n && snake[i][j + 1] == 0)
					snake[i][++j] = ++m;
				while (i + 1 < n && snake[i + 1][j] == 0)
					snake[++i][j] = ++m;
				while (j - 1 >= 0 && snake[i][j - 1] == 0)
					snake[i][--j] = ++m;
				while (i - 1 >= 0 && snake[i - 1][j] == 0)
					snake[--i][j] = ++m;

			}
			for (int j2 = 0; j2 < snake.length; j2++) {
				for (int k = 0; k < snake.length; k++) {
					System.out.print(snake[j2][k] + " ");

				}
				System.out.println();
			}

		}
	}
}