package com.zlx.akoj;
import java.util.Scanner;

public class e1049 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int op = cin.nextInt();
			int[][] jz = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					jz[i][j] = cin.nextInt();
			f(op, jz, n);
		}

	}

	private static void f(int op, int[][] jz, int n) {
		int[][] jzcopy = new int[n][n];
		if (op == 1) {
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					jzcopy[i][j]=jz[j][n - 1 - i];
				}

		} else if (op == 2) {
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					jzcopy[i][j]=jz[n-1-i][n-1-j];
					
				}
		} else if (op == 3) {
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					jzcopy[i][j]=jz[n-1-j][i];
				}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(jzcopy[i][j] + " ");
			System.out.println();
		}
	}

}
