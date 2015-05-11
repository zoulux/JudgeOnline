package com.zlx.akoj;
import java.util.Scanner;

public class e1021 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int k = cin.nextInt();

			solve(n, m, k);

		}

	}

	private static void solve(int n, int m, int k) {
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
			if (man[i] > n - k) {
				System.out.print((i + 1) + " ");
			}
		}
		System.out.println();
	}

}
