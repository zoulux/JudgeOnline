/*** Title: e61
 * Description: 传纸条（一）
 * @author zoulux
 * @date 2015年5月16日 下午8:13:26*/

package com.zlx.nyoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class e61 {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(
			new InputStreamReader(System.in)));
	static int[][] A = new int[55][55];
	static int[][][] dp = new int[102][55][55];
	public static void main(String[] args) throws IOException {
		st.nextToken();
		int N = (int) st.nval;
		while (N-- > 0) {
			for (int i = 0; i < 55; i++) {
				Arrays.fill(A[i], 0);
			}

			st.nextToken();
			int m = (int) st.nval;
			st.nextToken();
			int n = (int) st.nval;

			for (int i = 1; i <= m; i++)
				for (int j = 1; j <= n; j++) {
					st.nextToken();
					A[i][j] = (int) st.nval;
				}

			solve(m, n);

		}
	}

	private static void solve(int m, int n) {
		for (int i = 0; i < m+n+2; i++) {
			for (int j = 0; j < m+2; j++) {
				Arrays.fill(dp[i][j], 0);
			}
		}
		
		
		A[1][1]=A[m][n]=0;

		int b = m + n;
		for (int k = 1; k <= b; k++) {
			for (int x1 = 1; x1 <= m; x1++) {
				for (int x2 = 1; x2 <= m; x2++) {
					if (x1 == x2 && !(k == b && x1 == m))
						continue;
					int y1 = k - x1;
					int y2 = k - x2;
					if (!(y1>=1&&y1<=n)||!(y2>=1&&y2<=n))
						continue;
					dp[k][x1][x2] = max(
							dp[k - 1][x1 - 1][x2],
							dp[k - 1][x1 - 1][x2 - 1],
							dp[k - 1][x1][x2 - 1],
							dp[k - 1][x1][x2])+
							A[x1][y1]+
							A[x2][y2];

				}
			}
		}
		System.out.println(dp[b][m][m]);

	}

	private static int max(int a, int b, int c, int d) {
		return Math.max(Math.max(a, b), Math.max(c, d));
	}
}
