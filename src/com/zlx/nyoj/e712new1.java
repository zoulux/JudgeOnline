/*** Title: e712
 * Description: 
 * @author zoulux
 * @date 2015年5月13日 下午8:27:23*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class e712new1 {
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
		int dp[][][] = new int[m + n+1][m + 1][m + 1]; // 表示第k步机器1在第i行机器2在第j行时所取得的最大价值
		int b = m + n;
		int beg=A[1][1];
		int end=A[m][n];
		A[1][1]=A[m][n]=0;
		for (int k = 1; k <= b; k++) {
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= m; j++) {

					if (i == j && !(k == b && i == m)) {
						continue;
					}

					int y1 = k - i;
					int y2 = k - j;
					if (!(y1 >= 1 && y1 <= n)||!(y2 >= 1 && y2 <= n)) {
							continue;
					}

				//	System.out.println(k-1+" :"+(i-1)+": "+j);
					dp[k][i][j] = 
							max(dp[k - 1][i - 1][j],
							dp[k - 1][i][j - 1],
							dp[k - 1][i - 1][j - 1], dp[k - 1][i][j])+A[i][y1]+A[j][y2];
				}
			}
		}
		System.out.println(dp[b][m][m]+beg+end);
		

	}

	private static int max(int i, int j, int k, int l) {
		int A[] = { i, j, k, l };
		Arrays.sort(A);
		return A[3];
	}
}
