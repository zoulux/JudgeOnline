/*** Title: e16
 * Description: 矩形嵌套
 * @author zoulux
 * @date 2015年5月14日 下午11:19:51*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class e16 {
	public static class Rec implements Comparable<Rec> {
		int length, width;

		public Rec(int length, int width) {
			this.length = length;
			this.width = width;

		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "length:" + length + "width:" + width;
		}

		@Override
		public int compareTo(Rec o) {
			if (this.width != o.width) {
				return this.width - o.width;
			}
			return this.length - o.length;

		}
	}

	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static Vector<Rec> vector = new Vector<Rec>();

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			vector.clear();

			int n = cin.nextInt();
			for (int i = 0; i < n; i++) {
				int l = cin.nextInt();
				int w = cin.nextInt();

				vector.add(new Rec(l, w));
				if (l != w) {
					vector.add(new Rec(w, l));
				}

			}
			solve(n);
		}
		cin.close();
	}

	private static void solve(int n) {
		Collections.sort(vector);

		int dp[] = new int[vector.size()];
		int max = 1;
		dp[0] = 1;
		for (int i = 1; i < vector.size(); i++) {
			dp[i] = 1;
			Rec iv = vector.get(i);
			for (int j = 0; j < i; j++) {
				Rec jv = vector.get(j);
				if (jv.length < iv.length && jv.width < iv.width) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			max = Math.max(max, dp[i]);

		}

		System.out.println(max);

	}

}
