/*** Title: e106
 * Description: 
 * @author zoulux
 * @date 2015年5月16日 下午5:37:49*/

package com.zlx.nyoj;


/**
 * 题意理解错误，背包可以分割，
 * 题目给出的是单位质量和单位价值
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class e106 {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(
			new InputStreamReader(System.in)));
	static int[] v = new int[21];
	static int[] w = new int[21];

	public static void main(String[] args) throws IOException {
		st.nextToken();
		int n = (int) st.nval;
		while (n-- > 0) {
			Arrays.fill(w, 0);
			Arrays.fill(v, 0);
			st.nextToken();
			int s = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;

			for (int i = 0; i < s; i++) {
				st.nextToken();
				v[i] = (int) st.nval;
				st.nextToken();
				w[i] = (int) st.nval;
			}
			solve(s, m);

		}
	}

	private static void solve(int s, int m) {

		int dp[] = new int[m + 1];

		for (int i = 0; i < s; i++) {
			for (int j = m; j >= w[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
			}
			
		}
		System.out.println(dp[m]);
	}
}
