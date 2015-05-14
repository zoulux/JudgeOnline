/*** Title: e289
 * Description: 苹果
 * @author zoulux
 * @date 2015年5月12日 下午10:17:03*/

package com.zlx.nyoj;

import java.util.Scanner;

public class e289newD {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(); // n个苹果
			int size = cin.nextInt(); // 背包大小
			if (n == size && n == 0) {
				break;
			}
			int[] w = new int[n + 1];
			int[] v = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				w[i] = cin.nextInt();
				v[i] = cin.nextInt();
			}

			solve(w, v, n, size);

		}
	}

	private static void solve(int[] w, int[] v, int n, int size) {
		int tab[][] = new int[n + 1][size + 1];

		// for (int i = 1; i <= n; i++) {
		// for (int j = size; j >0; j--) {
		// int a = tab[i - 1][j];
		// if (j>=w[i]) {
		// int b = tab[i - 1][j - w[i]] + v[i];
		// tab[i][j] = max(a, b);
		// }else {
		// tab[i][j]=a;
		// }
		//
		// }
		// }
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= size; j++) {
				tab[i][j] = tab[i - 1][j];
				if (j >= w[i]) {
					tab[i][j] = max(tab[i][j], tab[i - 1][j - w[i]] + v[i]);
				}

			}
		}

		 for (int i = 1; i <= n; i++) {
		 for (int j = size; j >=w[i]; j--) {
		 int a = tab[i - 1][j];
		 int b = tab[i - 1][j - w[i]] + v[i];
		 tab[i][j] = max(a, b);
		 }
		 }

		 System.out.println();
		 for (int i = 0; i < n+1; i++) {
		 for (int j = 0; j < size+1; j++) {
		 System.out.print(tab[i][j]+" ");
		 }
		 System.out.println();
		 }
//		System.out.println(tab[n][size]);
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}
