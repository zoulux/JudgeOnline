/*** Title: e995
 * Description: 
 * @author zoulux
 * @date 2015年5月15日 下午8:30:05*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class e995 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static int[] data = new int[100000];

	public static void main(String[] args) {
		while (cin.hasNext()) {
			Arrays.fill(data, 0);
			int N = cin.nextInt();
			int T = cin.nextInt();
			if (N == T && N == 0) {
				break;
			}
			for (int i = 0; i < N; i++) {
				data[i] = cin.nextInt();
			}

			solve(N, T);
		}
		cin.close();
	}

	private static void solve(int n, int t) {
		int dp[] = new int[t + 1];

		Arrays.fill(dp, Integer.MAX_VALUE-100);
	
		
		dp[0] = 0;
		for (int i = 0; i < n; i++) {
			for (int j = data[i]; j <=t; j++) {
		//		for (int j = t; j >= data[i]; j--) {
				dp[j] = Math.min(dp[j - data[i]] + 1, dp[j]);
			}
		}
		System.out.println(dp[t]);
//		System.out.println(Arrays.toString(dp));

	}
}
