/*** Title: e104
 * Description: 最大和
 * @author zoulux
 * @date 2015年5月13日 上午12:58:14*/

package com.zlx.nyoj;

import java.util.Scanner;

public class e104 {
	static int d[][] = new int[101][101];
	static int dp[][] = new int[101][101];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			int r = cin.nextInt();
			int c = cin.nextInt();
			for (int i = 1; i <= r; i++) {
				for (int j = 1; j <= c; j++) {
					d[i][j]=cin.nextInt();
				}
			}
			solve(r,c);
		}
	}

	private static void solve(int r, int c) {
		
		for (int i = 1; i <=r; i++) {
			for (int j = 0; j <=c; j++) {
			
			}
		}
		
	}
}
