/*** Title: e456
 * Description: 邮票分你一半
 * @author zoulux
 * @date 2015年5月14日 下午10:12:16*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class e456 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static Vector<Integer> vector = new Vector<Integer>();

	public static void main(String[] args) {
		int m = cin.nextInt();
		while (m-- > 0) {
			vector.clear();
			int n = cin.nextInt();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int t = cin.nextInt();
				vector.add(t);
				sum += t;
			}

			solve(sum, n);
		}
		cin.close();
	}

	private static void solve(int sum, int n) {
		int sum2 = sum / 2;
		int dp[] = new int[sum2 + 1];

		for (int i = 0; i < n; i++) {
			for (int j = sum2; j >= vector.get(i); j--) {
				dp[j] = Math.max(dp[j - vector.get(i)] + vector.get(i), dp[j]);
				
			}
		}
		System.out.println(sum - dp[sum2] * 2);
	}
}
