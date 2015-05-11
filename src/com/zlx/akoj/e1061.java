package com.zlx.akoj;

import java.util.List;
import java.util.Scanner;

public class e1061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int[] list = new int[n];
			for (int i = 0; i < n; i++)
				list[i] = cin.nextInt();

			System.out.println(f(list, n));

		}
	}

	private static int f(int[] list, int l) {
		if (l == 1)
			return list[0];
		if (l == 2)
			return gbs(list[0], list[1]);
		else {
			int shengxia[] = new int[list.length - 1];
			for (int i = 0; i < shengxia.length-1; i++) {
				shengxia[i] = list[i + 2];
			}

					
			return f(shengxia, l);
		}

	}

	private static int gys(int m, int n) {
		if (m < n)
			gys(n, m);
		int t = 0;
		while ((t = m % n) != 0) {
			m = n;
			n = t;
		}

		return n;
	}

	private static int gbs(int m, int n) {

		return m * n / (gys(m, n));

	}
}
