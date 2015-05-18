/*** Title: e24new
 * Description: 素数距离问题
 * @author zoulux
 * @date 2015年5月16日 下午12:11:18*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class e24new1 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static int A[] = new int[1000010];
	static int visit[] = new int[1000010];

	public static void main(String[] args) {
		int N = cin.nextInt();
		A[1]=2;
		visit[1]=1;
		while (N-- > 0) {
			int M = cin.nextInt();
			if (visit[M] == 0) {
				solve(M);
			} else {
				System.out.println(A[M] + " " + Math.abs(A[M] - M));
			}

		}
		cin.close();
	}

	private static void solve(int m) {

		int t = 0;

		for (int i = m, j = m; i <= (2 * m + 1); i++, j--) {
			if (isPr(j)) {
				t = j;
				break;
			}
			if (isPr(i)) {
				t = i;
				break;
			}
		}
		
		A[m]=t;
		visit[m]=1;
		System.out.println(A[m] + " " + Math.abs(A[m] - m));
	}

	private static boolean isPr(int i) {
		if (i == 2) {
			return true;
		}
		
		
		if (i % 2 == 0) {
			return false;
		}
		int size = (int) (Math.sqrt(i) + 1);
		for (int j = 3; j < size; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
