/*** Title: e15new
 * Description: 
 * @author zoulux
 * @date 2015年5月17日 下午2:59:55*/

package com.zlx.nyoj;

import java.util.Arrays;
import java.util.Scanner;

public class e15new {
	static final int Size = 100;
	static Scanner cin = new Scanner(System.in);
	static String data;
	static int[][] dp = new int[Size][Size];

	public static void main(String[] args) {

		int T = cin.nextInt();
		while (T-- > 0) {
			for (int i = 0; i < Size; i++) {
				Arrays.fill(dp[i], 0);
			}

			data = cin.next();
			solve(data);

		}

	}

	private static void solve(String data) {

		int size = data.length();

		for (int i = 1; i <= size; i++) {
			dp[i][i] = 1;
		}
		for (int i = 2; i <= size; i++) {
			for (int j = i - 1; j >= 1; j--) {
			//	dp[i][j] = Integer.MAX_VALUE - 100;
				dp[j][i]=dp[j][i-1]+1;
				for (int k = j; k < i; k++) { // i--j之间的k
				
//					if (check(j, k)) {
//						dp[j][i] = Math.min(dp[j][i], dp[j + 1][k - 1]
//								+ dp[k + 1][j]);
//					}
					if (check(k-1, i-1)) {
						dp[j][i] = Math.min(dp[j][i], dp[k + 1][i - 1]
								+ dp[j][k - 1]);

					}
//					if (!check(j, k) && !check(k, i)) {
//						dp[j][i] = Math.min(dp[j][i], dp[j][k - 1]
//								+ dp[k + 1][i] + 1);
//					}
				}
			}
		}
//		for (int[] is : dp) {
//			System.out.println(Arrays.toString(is));
//		}
		System.out.println(dp[1][size]);

	}

	private static boolean check(int i, int j) {
		// System.out.println(i+":"+j+":"+data);

		if (data.charAt(i) == '(' && data.charAt(j) == ')') {
			return true;
		}
		if (data.charAt(i) == '[' && data.charAt(j) == ']') {
			return true;
		}
		return false;
	}
}
