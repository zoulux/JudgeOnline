package com.zlx.nyoj;

import java.util.Scanner;

/***
 * Title: e10new Description:
 * 
 * @author zoulux
 * @date 2015年5月12日 上午2:18:35
 */

public class e10new {
	static int[][] data = new int[101][101];
	static int[][] f = new int[101][101];
	static int m;
	static int n;

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			m = cin.nextInt();
			n = cin.nextInt();
			for (int i = 0; i <101; i++) {
				for (int j = 0; j <101; j++) {
					f[i][j]=-1;
				}
			}
			
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					data[i][j] = cin.nextInt();
				}
			}
			int max = 0;
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					int num = dfs(i, j, Long.MAX_VALUE);
					if (num > max) {
						max = num;
					}
				}
			}
			System.out.println(max);

		}
	}

	private static int dfs(int row, int col, long h) {

		if (row < 1 || row > m || col < 1 || col > n || h <= data[row][col]) // 超出范围或上一点高度低于该点高度
			return 0; // 则返回0
		if (f[row][col] >= 0) // 如果已经搜索过
			return f[row][col]; // 则直接返回该点最大化学长度
		f[row][col] = max(dfs(row - 1, col, data[row][col]),
				dfs(row, col + 1, data[row][col]),
				dfs(row + 1, col, data[row][col]),
				dfs(row, col - 1, data[row][col])) + 1; // 动规，当前最大滑雪长度为四周比该点低的最大滑雪长度加1
		return f[row][col];
	}

	private static int max(int a, int b, int c, int d) {
		return max(max(a, b), max(c, d));

	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}
