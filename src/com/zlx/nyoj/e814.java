/*** Title: e814
 * Description: 又见拦截导弹
 * @author zoulux
 * @date 2015年5月15日 下午6:08:48*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class e814 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static int[] A = new int[3010];

	public static void main(String[] args) {

		while (cin.hasNext()) {
			Arrays.fill(A, 0);

			int N = cin.nextInt();
			if (N == -1) {
				break;
			}

			for (int i = 0; i < N; i++) {
				A[i] = cin.nextInt();
			}
			solve(N);
		}
		cin.close();
	}

	private static void solve(int n) {

		int dp[] = new int[n];

		// if (true) {
		// break;
		// }
		int m = 0;
		for (int i = 0; i < n; i++) {
			int t = A[i];
			int T=0;
			for (int j =0; j <= i; j++) {
				if (dp[j]>=t) {
					dp[j]=t;
					T=1;
					break;
				}
			}
			if (T==0) {
				dp[m++]=t;
			}

		}
		System.out.println(m);
		
	}
}
