package com.zlx.nyoj;

import java.util.Scanner;

/***
 * Title: e10 Description: skiing
 * 
 * @author zoulux
 * @date 2015年5月12日 上午12:21:12
 */

public class e10 {
	static final int size = 101;
	static int visit[][] = new int[size][size];
	static int data[][] = new int[size][size];
	static int xx[] = { 0, 0, 1, -1 };
	static int yy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {

			int r = cin.nextInt();
			int c = cin.nextInt();
			int rr = r + 1;
			int cc = c + 1;
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					visit[i][j] = 1;
				}
			}

			for (int i = 1; i < rr; i++) {
				for (int j = 1; j < cc; j++) {
					data[i][j] = cin.nextInt();

				}
			}
			solve(rr, cc);
		}
	}

	private static void solve(int rr, int cc) {
		int ans = -1;
		for (int i = 1; i < rr; i++) {
			for (int j = 1; j < cc; j++) {
				dfs(i, j);
				if (visit[i][j] > ans) {
					ans = visit[j][j];
				}

			}
		}

		System.out.println(ans);
	}

	private static int dfs(int x, int y) {

		if (visit[x][y] > 1) {
			return visit[x][y];
		}

		for (int i = 0; i < 4; i++) {
			int a = x + xx[i];
			int b = y + yy[i];

			if (data[x][y] < data[a][b]) {
				int max = dfs(a, b);
				if (visit[x][y] < max + 1) {
					visit[x][y] = max + 1;
				}
			}
		}

		return visit[x][y];
	}
}
