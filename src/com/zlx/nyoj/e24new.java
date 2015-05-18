/*** Title: e24new
 * Description: 素数距离问题
 * @author zoulux
 * @date 2015年5月16日 下午12:11:18*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class e24new {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static int A[] = new int[1000010];
	static int visit[] = new int[1000010];

	public static void main(String[] args) {
		int N = cin.nextInt();
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
		int t1 = 0, t2 = 0;
		
		for (int i = m; i <= 2 * m; i++) {
			if (isPr(i)) {
				t1 = i;
				break;
			}
		}
		
		for (int i = m; i >= (m/2-1); i--) {
			if (isPr(i)) {
				t2 = i;
				break;
			}
		}
		int det1 = t1 - m;
		int det2 = m - t2;
		if (det1 < det2) {
			A[m] = t1;
			visit[m]=1;
			System.out.println(A[m] + " " + det1);
		} else {
			A[m] = t2;
			visit[m]=1;
			System.out.println(A[m] + " " + det2);
		}
	}

	private static boolean isPr(int i) {
		if (i==2) {
			return true;
		}
		if (i % 2 == 0) {
			return false;
		}
		int size = (int) (Math.sqrt(i) + 1);
		for (int j = 2; j < size; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
