/*** Title: e17new
 * Description: 单调递增最长子序列
 * @author zoulux
 * @date 2015年5月12日 上午10:38:26*/
package com.zlx.nyoj;

import java.util.Scanner;

public class e17new {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			while (n-- > 0) {
				String data = cin.next();
				solve(data);
			}
		}
	}

	private static void solve(String data) {
		int size=data.length();
		int  dp[]=new int[size];
		
		for (int i = 0; i <size; i++) {
			for (int j = 0; j <=i; j++) {
				char di=data.charAt(i);
				char dj=data.charAt(j);
				if (dj<di) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int max=0;
		for (int i = 0; i < dp.length; i++) {
			if (dp[i]>max) {
				max=dp[i];
			}
		}
		System.out.println(max+1);
	}
}
