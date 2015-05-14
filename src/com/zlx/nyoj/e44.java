/*** Title: e44
 * Description: 子串和
 * @author zoulux
 * @date 2015年5月12日 下午6:43:41*/
package com.zlx.nyoj;

import java.util.Scanner;

public class e44 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			int n = cin.nextInt();
			int data[] = new int[n+1];
			for (int i = 1; i <= n; i++) {
				data[i] = cin.nextInt();
			}

			solve(data);
		}
	}

	private static void solve(int[] data) {
		
		
		int size=data.length;
		int dp[] = new int[size];
		
			for (int i = 1; i < size; i++) {
				System.out.println(data[i]);
					dp[i] = Math.max(data[i], dp[i-1]+data[i]);
			}
		
		int max=0;
		for (int i = 0; i < size; i++) {
		if (dp[i]>max) {
			max=dp[i];
		}
		}
		System.out.println(max);
	}


}
