/*** Title: e712
 * Description: 
 * @author zoulux
 * @date 2015年5月13日 下午8:27:23*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class e712 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static int A[][] = new int[51][51];
	static int visit[][] = new int[51][51];

	public static void main(String[] args) {
		int k = cin.nextInt();
		while (k-- > 0) {
			int M = cin.nextInt();
			int N = cin.nextInt();
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < A.length; j++) {
					A[i][j] = 0;
					visit[i][j] = 1;
				}
			}

			for (int i = 1; i <= M; i++) {
				for (int j = 1; j <= N; j++) {
					A[i][j] = cin.nextInt();
				}
			}
			solve(M, N);

		}
		cin.close();
	}

	private static void solve(int m, int n) {
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				int a = A[i][j - 1];
				int b = A[i - 1][j];
				if (a >= b) {

					A[i][j] += a;
					visit[i][j - 1] = 0;
				} else {
					A[i][j] += b;
					visit[i - 1][j] = 0;
				}
				// A[i][j]=A[i][j]+Math.max(A[i-1][j], A[i][j-1]);

			}
		}

		for (int i = m; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
			if (visit[i][j] != 0) {
					A[i][j] = A[i][j] + Math.max(A[i][j + 1], A[i + 1][j]);
				}

				
			}
		}
		for (int i = 0; i < m + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}
