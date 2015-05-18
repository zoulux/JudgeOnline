/*** Title: e47
 * Description: 
 * @author zoulux
 * @date 2015年5月16日 下午2:15:32*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class e47 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static int data[] = new int[1000];

	public static void main(String[] args) {
		int T = cin.nextInt();
		while (T-- > 0) {
			Arrays.fill(data, 0);
			int N = cin.nextInt();
			for (int i = 1; i <= N; i++) {
				data[i] = cin.nextInt();
			}
			solve(N);
		}
		cin.close();
	}

	private static void solve(int n) {
		Arrays.sort(data, 1, n+1);
		System.out.println(fun(n));
	}

	private static int fun(int n) {

		if (n < 3) {
			return data[n] ;
		}
		if (n == 3) {
			return  data[3]+data[1]+data[2];
		}

		return fun(n - 2)
				+ Math.min(data[n]+data[n-1]+2*data[1], data[n]+data[1]+2*data[2]);

	}
}
