/*** Title: e20
 * Description: 
 * @author zoulux
 * @date 2015年5月16日 上午8:44:02*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class e20new {

	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static final int size = 100010;
	static Vector<Integer> A[] = new Vector[size];

	static  {
		for (int i = 0; i < A.length; i++) {
			A[i] = new Vector<Integer>();
		}
	}

	static int pre[] = new int[size];

	public static void main(String[] args) {
		new e20new();

		int M = cin.nextInt();

		while (M-- > 0) {
			int N = cin.nextInt();

			Arrays.fill(pre, 0);
			for (int i = 0; i < N + 1; i++) {
				A[i].clear();
			}

			int S = cin.nextInt();
			for (int i = 0; i < N - 1; i++) {

				int a = cin.nextInt();
				int b = cin.nextInt();

				A[a].add(b);
				A[b].add(a);

			}
			pre[S]=-1;
			DFS(S);
			for (int i = 0; i < N + 1; i++) {
				System.out.print(pre[i]+" ");
			}

		}
		cin.close();
	}

	private static void DFS(int i) {
		for (int j = 0; j < A[i].size(); i++) {
			if (pre[A[i].get(j)] != 0) {
				continue;
			}
			pre[A[i].get(j)] = i;
			DFS(A[i].get(j));
		}
	}
}
