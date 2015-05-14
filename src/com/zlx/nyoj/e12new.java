/*** Title: e12new
 * Description: 
 * @author zoulux
 * @date 2015年5月14日 下午3:36:32*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class e12new {
	public static class Circ implements Comparable<Circ> {
		public Circ() {

		}

		double left, right;

		@Override
		public int compareTo(Circ o) {

			return (int) (this.left - o.left);
		}
	}

	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static Set<Circ> set = new TreeSet<Circ>();

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int n = cin.nextInt();
			int w = cin.nextInt();
			int h = cin.nextInt();
			double h2 = h / 2.0;

			// Circ[] vector = new Circ[n];
			set.clear();
			for (int i = 0; i < n; i++) {
				int x = cin.nextInt();
				int r = cin.nextInt();
				double temp = r * r - h2 * h2;

				if (temp < 0) {
					temp = 0;
				} else {
					temp = Math.sqrt(temp);
				}
				Circ circ = new Circ();
				circ.left = x - temp;
				circ.right = x + temp;
				set.add(circ);
				// vector[i] = circ;
			}

			solve(n, w, h);

		}
		cin.close();
	}

	private static void solve(int n, int w, int h) {
		// Arrays.sort(vector);
		// for (Circ circ : vector) {
		// System.out.println(circ.left + " : " + circ.right);
		// }

		double sum = 0;
		int flag = 0;
		int count = 0;

		while (sum < w) {
			double max = 0;
			for (Circ circ : set) {
				if (circ.left > sum) {
					break;
				}

				if (circ.right - sum > max) {
					max = circ.right - sum;

				}

			}

			// for (int i = t; i < n && set..left <= sum; i++) {
			// if (vector[i].right - sum > max) {
			// max = vector[i].right - sum;
			// t = i;
			// }
			// }
			if (max == 0) {
				flag = 1;
			} else {
				count++;
				sum += max;
			}

		}

		if (flag == 1) {
			System.out.println(0);
		} else {
			System.out.println(count);
		}

	}
}