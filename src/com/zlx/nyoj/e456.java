/*** Title: e456
 * Description: 邮票分你一半
 * @author zoulux
 * @date 2015年5月14日 下午10:12:16*/

package com.zlx.nyoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class e456 {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(
			new InputStreamReader(System.in)));

	static int[] A = new int[1005];
	static int[] dp = new int[50005];

	public static void main(String[] args) throws IOException {
		st.nextToken();
		int m = (int) st.nval;
		while (m-- > 0) {
		
			Arrays.fill(A, 0);
			Arrays.fill(dp, 0);

			st.nextToken();
			int n = (int) st.nval;
			int sum = 0;

			for (int i = 1; i <= n; i++) {
				st.nextToken();
				int t = (int) st.nval;
				A[i] = t;
				sum += t;
			}

			solve(sum, n);
		}

	}

	private static void solve(int sum, int n) {
		int sum2=sum>>1;
		for (int i = 1; i <= n; i++) {
			for (int j = sum2; j >= A[i]; j--) {
				dp[j] = max(dp[j], dp[j - A[i]] + A[i]);
			}
		}
		System.out.println(sum - dp[sum2] * 2);

	}

	private static int max(int i, int j) {

		return i > j ? i : j;
	}

}
