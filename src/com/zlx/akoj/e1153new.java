package com.zlx.akoj;

import java.util.Scanner;

public class e1153new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				long n = cin.nextLong();
				long p = cin.nextLong();
				long he = 0;
				for (long i = 1; i <= n; i++) {
					double pCF = pow(i, p);
					pCF = pCF % 10003;
					he += pCF;
					he %= 10003;
				}
				System.out.println(he);
			}
		}
	}

	private static double pow(long i, long p) {
		int sum = 1;
		for (int j = 0; j < p; j++) {
			sum *= i;
			sum %= 10003;
		}
		return sum;
	}
}
