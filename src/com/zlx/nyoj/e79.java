/*** Title: e79
* Description: 拦截导弹
* @author zoulux
* @date 2015年5月12日 下午9:35:40*/

package com.zlx.nyoj;

import java.util.Scanner;

public class e79 {
	static int[] dd=new int[21];
public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	int N=cin.nextInt();
	while (N-->0) {
			int m=cin.nextInt();
			for (int i = 1; i <= m; i++) {
				dd[i]=cin.nextInt();
			}
			
			int[] dp=new int[21];  //dp[i]:以i结尾的递减子序列的个数
//			for (int i : dd) {
//				System.out.println(i);
//			}
			
			for (int i = 1; i <=m; i++) {
				int di=dd[i];
				for (int j = 0; j <=i; j++) {
					int dj=dd[j];
					
					if (dj>di) {
						dp[i]=Math.max(dp[i], dp[j]+1);
					}
				}
			}
			
			int max=0;
			for (int i : dp) {
				if (i>max) {
					max=i;
				}
			}
			System.out.println(max+1);
	}
}
private static void solve() {
	
	
}
}
