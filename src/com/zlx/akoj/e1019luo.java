package com.zlx.akoj;

import java.util.Scanner;

public class e1019luo {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		int n = cinScanner.nextInt();
		while (n-- > 0) {
			int M = cinScanner.nextInt();
			int N = cinScanner.nextInt();
			int t = cinScanner.nextInt();
			int[] x = new int[t];
			int[] y = new int[t];
			int[] L = new int[t];
			int[] h = new int[t];
			for (int i = 0; i < t; i++) {
				x[i] = cinScanner.nextInt();
				y[i] = cinScanner.nextInt();
				L[i] = cinScanner.nextInt();
				h[i] = cinScanner.nextInt();
			}
			int reX = x[0];
			int reY = y[0];
			int reL = L[0];
			int reH = h[0];
			for (int i = 1; i < t; i++) {
				reX = Math.abs(x[i] - reX);
				reY = Math.abs(y[i] - reY);
				reL = Math.abs(L[i] - reL);
				reH = Math.abs(h[i] - reH);
			}
			if (t == 1) {
				System.out.println(M * N - reL * reH);
			} else
				System.out.println(M * N - (reX * reY + reL * reH));
		}
	}
}