package com.zlx.akoj;

import java.util.Scanner;

public class e1055 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int ar = cin.nextInt();
			int al = cin.nextInt();
			if (0 == al && ar == 0)
				break;
			int[][] A = new int[ar][al];
			for (int i = 0; i < ar; i++)
				for (int j = 0; j < al; j++)
					A[i][j] = cin.nextInt();

			int br = cin.nextInt();
			int bl = cin.nextInt();
			int[][] B = new int[br][bl];
			for (int i = 0; i < br; i++)
				for (int j = 0; j < bl; j++)
					B[i][j] = cin.nextInt();

			int cr = cin.nextInt();
			int cl = cin.nextInt();
			int[][] C = new int[cr][cl];
			for (int i = 0; i < cr; i++)
				for (int j = 0; j < cl; j++)
					C[i][j] = cin.nextInt();

			if (al != br || ar != cr || bl != cl) {
				System.out.println("No");
				continue;
			}

			int result[][] = new int[cr][cl];
			for (int i = 0; i < cr; i++) {
				for (int j = 0; j < cl; j++) {
					result[i][j] = solve(A, B,  al,  i, j);
				}
			}
			
			if (equal(result,C,cr,cl)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

	private static boolean equal(int[][] result, int[][] c, int cr, int cl) {
		for (int i = 0; i < cr; i++) {
			for (int j = 0; j < cl; j++) {
				if (c[i][j]!=result[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	private static int solve(int[][] A, int[][] B,  int al, int i, int j) {

		int res = 0;
		for (int x = 0; x < al; x++) {
			res += A[i][x] * B[x][j];
		}
		return res;
	}

}
