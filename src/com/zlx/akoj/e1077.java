package com.zlx.akoj;

import java.util.Scanner;

public class e1077 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			long i = cin.nextLong();
			long j = cin.nextLong();
				solve(i, j);
	
		}
	}

	private static void solve(long a, long b) {
		long x1,x2;
		if (a>b) {
			x1=b;
			x2=a;
		}else {
			x1=a;
			x2=b;
		}
		
		long max = 0;
		for (long i = x1; i <= x2; i++) {
			if (f(i) > max) {
				max = f(i);
			}
		}
		System.out.println(a + " " + b+ " " + max);
	}

	private static long f(long a) {
		long count = 1;
		while (a != 1) {
			if (a % 2 == 0) {
				a >>= 1;
			} else {
				// a=3*a+1;
				// a>>=1;
				a = a + ((a + 1) / 2);
				count++;
			}
			count++;
		}

		return count;
	}
}
