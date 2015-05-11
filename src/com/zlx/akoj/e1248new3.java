package com.zlx.akoj;

import java.util.Scanner;
import java.util.Vector;

public class e1248new3 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n==0) {
				break;
			}
			solve(n, 2);
		}
	}

	private static void solve(int n, int m) {
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 0; i < n; i++) {
			vector.add(i + 1);
		}
		int left = n;
		int count = 0;
		int i = 0;
		while (true) {

			count++;
			if (count == m) {
				vector.remove(i);
				count = 0;
				left--;
			} else {

				i++;
			}
			if (i == vector.size()) {
				i = 0;
			}

			if (left <= 1) {
				break;
			}
		}
		System.out.println(vector.get(0));
	}
}
