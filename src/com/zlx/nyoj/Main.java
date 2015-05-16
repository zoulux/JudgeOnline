package com.zlx.nyoj;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Recc vector[];
	static int dp[];

	static boolean max(Recc c1, Recc c2) {
		if ((c1.length < c2.length && c1.width < c2.width)
				|| (c1.length < c2.width && c1.width < c2.length))
			return true;
		return false;
	}

	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		
		int N = cin.nextInt();
		while (N-- > 0) {
			int n = cin.nextInt();
			vector = new Recc[n];
			dp = new int[n];
			for (int i = 0; i < n; i++) {
				int l = cin.nextInt();
				int w = cin.nextInt();
				if (l > w) {
					int t = w;
					w = l;
					l = t;
				}
				vector[i] = new Recc(l, w);
			}
			solve(n);

		}
	}

	private static void solve(int n) {
		for (int i = 0; i < n; i++)
			dp[i] = 0;
		Arrays.sort(vector);
		int max = dp[0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (max(vector[j], vector[i]) && dp[i] < dp[j] + 1)
					dp[i] = dp[j] + 1;
			}
			if (dp[i] > max)
				max = dp[i];

		}
		System.out.println(max + 1);

	}

}

class Recc implements Comparable<Recc> {
	int length;
	int width;

	public int compareTo(Recc c) {
		if (this.length > c.length)
			return 1;
		else if (this.length == c.length && this.width > c.width)
			return 1;
		else
			return -1;
	}

	public Recc() {

	}

	public Recc(int x, int y) {
		this.length = x;
		this.width = y;
	}
}
