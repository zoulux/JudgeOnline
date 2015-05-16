/*** Title: e12
 * Description: 
 * @author zoulux
 * @date 2015年5月14日 上午10:50:45*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class e12 {
	public static class Circ implements Comparable<Circ> {
		public Circ(double left, double right) {
			this.left = left;
			this.right = right;
		}

		double left, right;

		@Override
		public int compareTo(Circ o) {
			return (this.left - o.left) >= 0 ? 1 : -1;
		}
	}

	static Vector<Circ> vector = new Vector<Circ>();
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int n = cin.nextInt();
			int w = cin.nextInt();
			int h = cin.nextInt();
			double h2 = h / 2.0;
			vector.clear();
			for (int i = 0; i < n; i++) {
				int x = cin.nextInt();
				int r = cin.nextInt();
				double temp = r * r - h2 * h2;

				if (temp < 0) {
					temp = 0;
				} else {
					temp = Math.sqrt(temp);
				}
				Circ circ = new Circ(x - temp, x + temp);
				vector.add(circ);
			}
			solve(n, w, h);
		
		}
		cin.close();
	}

	private static void solve(int n, int w, int h) {
		Collections.sort(vector);
		// for (Circ circ : vector) {
		// System.out.println(circ.left+":"+circ.right);
		// }

		int flag = 0, flags = 0;
		int count = 0;
		double li = vector.get(0).left;
		double ri = vector.get(0).right;
		double firstl = li;
		double firstr = ri;
		int t = 0;

		for (int i = 0; i < vector.size(); i = t) {
			count++;

			if (firstl > 0) {
				flag = 1;
				break;
			}
			if (firstr >= w) {
				break;
			}

			double max = 0;
			int flagss = 0;
			for (int j = i + 1; j < vector.size(); j++) {
				double lj = vector.get(j).left;
				double rj = vector.get(j).right;

				if (rj < w && j == vector.size() - 1) { // 在最后一个元素的情况下右边界还是小于矩形右边界
					flag = 1; // no ans
					System.out.println(">>>2");
					flags = 1;// exit
					break;
				} else {
					if (lj <= ri && rj > ri) { //两矩形必须左右边界相交
						flagss=1;
						if (rj >= w) {
							count++;
							flags = 1; // have ans 右边界到达矩形右边界
							break;
						}

						if (rj > max) {
							max = rj;
							t = j;
							ri = max;
						}
					}

				}

			}
			if (flags == 1) { // exit
				break;
			}
			if (flagss == 0) {
				flag = 1;// no ans
				break;
			}
		}

		if (flag == 1) {
			System.out.println(0);
		} else {
			System.out.println(count);
		}
	}
}
