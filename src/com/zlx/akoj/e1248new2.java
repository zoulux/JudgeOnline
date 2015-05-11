package com.zlx.akoj;

import java.util.Scanner;

public class e1248new2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();

			if (n == 0) {
				break;
			}
			solve(n, 2);
		}
	}

	private static void solve(int n, int m) {
		int man[] = new int[n];

		int count = 1;
		int pos = -1;
		while (count <= n) {
			int shushu = 0;
			while (true) {
				pos = (pos + 1) % n; // /核心的一步
				if (man[pos] == 0) {
					shushu++;
				}
				if (shushu == m) {
					break;
				}
			}
			man[pos] = count++;
		}
		for (int i = 0; i < man.length; i++) {
			if (man[i] == n) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}
