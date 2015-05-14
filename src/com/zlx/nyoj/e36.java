/*** Title: e36
 * Description: 最长公共子序列
 * @author zoulux
 * @date 2015年5月12日 下午7:35:25*/
package com.zlx.nyoj;

import java.util.Scanner;

public class e36 {
	static int A[][]=new int[1001][1001];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			while (N-- > 0) {
				String a = " "+cin.next();
				String b = " "+cin.next();
				solve(a, b);
			}

		}
	}

	private static void solve(String a, String b) {
		int max=0;
			for (int i = 1; i <a.length(); i++) {
				char ci=a.charAt(i);
				for (int j = 1; j < b.length(); j++) {
					char cj=b.charAt(j);
					if (ci==cj) {
						A[i][j]=A[i-1][j-1]+1;
					}else {
						A[i][j]=Math.max(A[i][j-1], A[i-1][j]);
					}
					if (A[i][j]>max) {
						max=A[i][j];
					}
				}
			}
			System.out.println(max);
	}
}
