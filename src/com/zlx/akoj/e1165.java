package com.zlx.akoj;

import java.util.Scanner;

public class e1165 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int A = cin.nextInt();
			int B = cin.nextInt();

			int count = 0;
			for (int i = 1; i <= A; i++) {
				for (int j = 1; j <= B; j++) {
					count += C(A, i) * C(B, j);
				}
			}
			System.out.println(count);
		}
	}

	private static int C(int s, int i) {
		int t=A(s,i)/A(i,i);
		return t;
	}

	private static int A(int i, int j) {
		int s=1;
		for (int k = i; k>=j; k--) {
			s*=k;
		}
		return s;
	}
}
