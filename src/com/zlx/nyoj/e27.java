package com.zlx.nyoj;

import java.util.Scanner;

/***
 * Title: e27 Description: 水池数目
 * 
 * @author zoulux
 * @date 2015年5月12日 上午1:08:10
 */

public class e27 {
	static int data[][] = new int[101][101];
	static int visit[][] = new int[101][101];
	static int xx[] = { 0, 1, 0, -1 };
	static int yy[] = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			int m = cin.nextInt();
			int n = cin.nextInt();
			int mm = m + 1;
			int nn = n + 1;

			for (int i = 0; i < 101; i++) {
				for (int j = 0; j < 101; j++) {
					visit[i][j] = 1;
				}
			}

			for (int i = 1; i < mm; i++) {
				for (int j = 1; j < nn; j++) {
					data[i][j] = cin.nextInt();
				}
			}

			int count = 0;
			for (int i = 1; i < mm; i++) {
				for (int j = 1; j < nn; j++) {
					if (data[i][j] == 1) {
						count++;
						dfs(i, j);
					}
				}
			}

			System.out.println(count);
		}
	}

	private static void dfs(int x, int y) {
		visit[x][y] = 0;
		for (int i = 0; i < 4; i++) {
			int a = x + xx[i];
			int b = y + yy[i];
			if (data[a][b] == 1 && visit[a][b] == 1) {
				dfs(a, b);
			}
		}
		data[x][y] = 0;
	}
}
