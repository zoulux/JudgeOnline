/*** Title: e1054new
 * Description: 
 * @author zoulux
 * @date 2015年5月14日 下午6:05:01*/

package com.zlx.akoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class e1054new {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));

	public static void main(String[] args) {
		int T = cin.nextInt();
		while (T-- > 0) {
			int N = cin.nextInt();
			int A[] = new int[N];
			for (int i = 0; i < N; i++) {

				A[i] = cin.nextInt();
			}
			solve(A,N);

		}
		cin.close();
	}

	private static void solve(int[] A, int n) {
		int dp[]=new int[n];
	
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j <i; j++) {
			
			}
		}
		
	}
}
