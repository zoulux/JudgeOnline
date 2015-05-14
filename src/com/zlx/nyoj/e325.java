/*** Title: e325
 * Description: zb的生日
 * @author zoulux
 * @date 2015年5月12日 下午9:03:36*/
package com.zlx.nyoj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class e325 {
	static int sum = 0;

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int W[] = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				W[i] = cin.nextInt();
				sum += W[i];
			}
			solve(W);

		}
	}

	private static void solve(int[] w) {
	int size=w.length;
	int s=sum/2;
	int dp[]=new int[s+1];
	for (int i = 0; i < size; i++) {
		for (int j =s ; j >w[i]; j--) {
			int a=dp[j];
			int b=dp[s-w[i]]+w[i];
			dp[j]=Math.max(a, b);
		}
	}
	System.out.println(Math.abs(sum-dp[s]*2));
	
	
}
}
