/*** Title: e119
 * Description: 士兵杀敌（三）
 * @author zoulux
 * @date 2015年5月12日 下午7:54:25*/
package com.zlx.nyoj;

import java.util.Arrays;
import java.util.Scanner;

public class e119 {
	static long[][] A = new long[100000001][100000001];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int Q = cin.nextInt();
			int V[] = new int[N];
			for (int i = 0; i < N; i++) {
				V[i] = cin.nextInt();
			}

			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					A[i][j]=f(i,j,V);
				}
			}

			while (Q-->0) {
				int a = cin.nextInt();
				int b = cin.nextInt();
				System.out.println(A[a][b]);
			}
		}
	}

	private static int f(int i, int j, int[] v) {
		int VV[]=new int[j-i];
		for (int k = 0; k < j-i; k++) {
			VV[k]=v[i+k];
		}
		Arrays.sort(VV);
		
		return VV[j-i-1]-VV[0];
	}

	private static void solve(int a, int b, int[] v) {

	}
}
