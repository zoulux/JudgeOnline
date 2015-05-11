package com.zlx.akoj;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class e1016 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			if (n == m && n == 0) {
				break;
			}
			int a[] = new int[m];
			int b[] = new int[m];
			for (int i = 0; i < m; i++) {
				a[i] = cin.nextInt();
				b[i] = cin.nextInt();
			}

			solve(n, m, a, b);

		}
	}

	// ÐÐ²»Í¨
	private static void solve(int n, int m, int[] a, int[] b) {
		Vector<Set<Integer>> vector = new Vector<Set<Integer>>();

		for (int i = 1; i <= n; i++) {
			Set<Integer> set = new HashSet<Integer>();
			set.add(i);
			vector.add(set);
		}

		for (int i = 0; i < m; i++) {

			int ma = a[i];
			int mb = b[i];
			HashSet<Integer> setA = null;
			HashSet<Integer> setB = null;
			HashSet<Integer> setC = new HashSet<Integer>();
			for (int j = 0; j < vector.size(); j++) {
				Set<Integer> s = vector.get(j);
				if (s.contains(ma)) {
					setA = new HashSet<Integer>(s);
				}

				if (vector.get(j).contains(mb)) {
					setB = new HashSet<Integer>(s);
				}
			}

			vector.remove(setA);
			vector.remove(setB);
			setC.addAll(setA);
			setC.addAll(setB);
			vector.add(setC);

		}
		System.out.println(vector.size() - 1);

	}
}
