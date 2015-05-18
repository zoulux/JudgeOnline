/*** Title: e104new
 * Description: 最大和
 * @author zoulux
 * @date 2015年5月17日 下午4:03:28*/

package com.zlx.nyoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class e104new {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(
			new InputStreamReader(System.in)));
	static final int SIZE = 105;
	// static int[][] data = new int[SIZE][SIZE];
	static int[][] temp = new int[SIZE][SIZE];
	// static int[][] dp = new int[SIZE][SIZE];
	static int row, col;

	public static void main(String[] args) throws IOException {
		st.nextToken();
		int n = (int) st.nval;

		while (n-- > 0) {

			// for (int i = 0; i < SIZE; i++) {

			// Arrays.fill(dp[i], 0);
			// Arrays.fill(temp[i], 0);
			// Arrays.fill(data[i], 0);
			// }

			st.nextToken();
			row = (int) st.nval;

			st.nextToken();
			col = (int) st.nval;

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= col; j++) {
					st.nextToken();
					temp[i][j] = (int) st.nval;
					temp[i][j] += temp[i - 1][j];
				}
			}

			solve();

		}
	}

	private static void solve() {

		int max = temp[1][1];
		
		for (int i = 1; i <= row; i++) {
			for (int _i = i ; _i <= row; _i++) {
				int thisSum = 0;// 每一列的和
				for (int j = 1; j <= col; j++) {

					if (thisSum < 0) {
						thisSum = temp[_i][j] - temp[i - 1][j];
					} else {
						thisSum += temp[_i][j] - temp[i - 1][j];
						max = Math.max(max, thisSum);
					}

				}
			}
		}
		
	/*	
		for (int i = 1; i <= row; i++) {
			for (int _i = i; _i <= row; _i++) {
				int sum = 0;// 每一列的和
				for (int j = 1; j <= col; j++) {
					if (sum < 0) {
						sum = temp[_i][j] - temp[i - 1][j];
					} else {
						sum += temp[_i][j] - temp[i - 1][j];
						max = Math.max(max, sum);
					}
				}
			}
		}
*/
		System.out.println(max);
	}
}
