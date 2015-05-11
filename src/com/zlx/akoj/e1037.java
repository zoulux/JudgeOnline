package com.zlx.akoj;
public class e1037 {
	final static int N = 8;
	static int[][] Q = new int[N + 1][N + 1];

	public static void main(String[] args) {
		tran(1);
	}

	private static void tran(int i) {
		if (i > N) {
			print(Q);
		} else {
			for (int j = 1; j <= N; j++) {
				Q[i][j] = 1;
				if (isOk(Q, i, j)) {
					tran(i + 1);
				}
				Q[i][j] = 0;
			}
		}

	}

	private static boolean isOk(int[][] q2, int i, int j) {
		for (int x = 1; x <= i - 1; x++) {
			for (int y = 1; y <= N; y++) {
				if (Q[x][y] == 1) {
					if (y == j || Math.abs(x - i) == Math.abs(y - j)) {
						return false;
					}
				}
			}
		}

		return true;
	}

	private static void print(int[][] q2) {
		int A[] = new int[N];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (Q[i][j] == 1) {
					A[i - 1] = j - 1;
				}
			}
		}
		for (int i : A) {
			System.out.print(i);
		}
		System.out.println();

	}

}
