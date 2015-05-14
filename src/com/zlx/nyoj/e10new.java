package com.zlx.nyoj;

import java.util.Scanner;

/***
 * Title: e10new Description:
 * 
 * @author zoulux
 * @date 2015��5��12�� ����2:18:35
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

		if (row < 1 || row > m || col < 1 || col > n || h <= data[row][col]) // ������Χ����һ��߶ȵ��ڸõ�߶�
			return 0; // �򷵻�0
		if (f[row][col] >= 0) // ����Ѿ�������
			return f[row][col]; // ��ֱ�ӷ��ظõ����ѧ����
		f[row][col] = max(dfs(row - 1, col, data[row][col]),
				dfs(row, col + 1, data[row][col]),
				dfs(row + 1, col, data[row][col]),
				dfs(row, col - 1, data[row][col])) + 1; // ���棬��ǰ���ѩ����Ϊ���ܱȸõ�͵����ѩ���ȼ�1
		return f[row][col];
	}

	private static int max(int a, int b, int c, int d) {
		return max(max(a, b), max(c, d));

	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}
