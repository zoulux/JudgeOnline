package com.zlx.akoj;

import java.util.Scanner;

public class e1022 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int m = cin.nextInt();
			int n = cin.nextInt();

			int map[][] = new int[100][100];
			boolean visit[][] = new boolean[100][100];
			for (int i = 0; i < visit.length; i++) {
				for (int j = 0; j < visit.length; j++) {
					map[i][j] = 0;
					visit[i][j] = false;
				}
			}

			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					map[i][j] = cin.nextInt();
					visit[i][j] = false;
				}
			}

			int count = 0;
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					if (map[i][j] == 1) {

						count++;
						dnf(i, j, map, visit);
					}
				}
			}
			System.out.println(100 - count * 10);
		}
	}

	private static void dnf(int i, int j, int[][] map, boolean[][] visit) {
		visit[i][j] = true;
		if (map[i - 1][j] == 1 && !visit[i - 1][j]) {
			dnf(i - 1, j, map, visit);
		}
		if (map[i + 1][j] == 1 && !visit[i + 1][j]) {
			dnf(i + 1, j, map, visit);
		}
		if (map[i][j - 1] == 1 && !visit[i][j - 1]) {
			dnf(i, j - 1, map, visit);
		}
		if (map[i][j + 1] == 1 && !visit[i][j + 1]) {
			dnf(i, j + 1, map, visit);
		}

		if (map[i + 1][j + 1] == 1 && !visit[i + 1][j + 1]) {
			dnf(i + 1, j + 1, map, visit);
		}

		if (map[i + 1][j - 1] == 1 && !visit[i + 1][j - 1]) {
			dnf(i + 1, j - 1, map, visit);
		}

		if (map[i - 1][j - 1] == 1 && !visit[i - 1][j - 1]) {
			dnf(i - 1, j - 1, map, visit);
		}

		if (map[i - 1][j + 1] == 1 && !visit[i - 1][j + 1]) {
			dnf(i - 1, j + 1, map, visit);
		}
		map[i][j] = 0;
	}
}
