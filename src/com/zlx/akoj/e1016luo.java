package com.zlx.akoj;

import java.util.Scanner;

public class e1016luo {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while (cinScanner.hasNext()) {
			int m = cinScanner.nextInt();
			int n = cinScanner.nextInt();
			if (m == 0 && n == 0) {
				return;
			}
			int f[][] = new int[1001][1001];
			for (int i = 0; i < n; i++) {
				int a = cinScanner.nextInt();
				int b = cinScanner.nextInt();
				f[a][b] = 1;
			}
			int count = 0;
			for (int i = 0; i < f.length; i++) {
				for (int j = 0; j < f.length; j++) {
					if (f[i][j] == 1) {
						count++;
					}
				}
			}
			System.out.println(m - 1 - count);
		}
	}
}