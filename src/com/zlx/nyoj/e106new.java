/*** Title: e106new
 * Description: 
 * @author zoulux
 * @date 2015年5月16日 下午7:32:12*/

package com.zlx.nyoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class e106new {
	static StreamTokenizer st = new StreamTokenizer(new BufferedReader(
			new InputStreamReader(System.in)));

	static Vector<A> vector = new Vector<A>();

	static class A implements Comparable<A> {
		int v, w;

		public A(int v, int w) {

			this.v = v;
			this.w = w;

		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "v:" + v + "w:" + w;
		}

		@Override
		public int compareTo(A o) {
			return (this.v - o.v) < 0 ? 1 : -1;
		}

	}

	public static void main(String[] args) throws IOException {
		st.nextToken();
		int n = (int) st.nval;
		while (n-- > 0) {
			vector.clear();
			st.nextToken();
			int s = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;

			for (int i = 0; i < s; i++) {
				st.nextToken();
				int v = (int) st.nval;
				st.nextToken();
				int w = (int) st.nval;

				vector.add(new A(v, w));
			}

			solve(s, m);
		}

	}

	private static void solve(int s, int m) {
		Collections.sort(vector);
	//	System.out.println(vector);

		int ww = m;
		int sum = 0;

		for (int i = 0; i < vector.size(); i++) {
			int can = Math.min(vector.get(i).w, ww);
			sum+=(can*vector.get(i).v);
			ww-=can;
			if (ww==0) {
				break;
			}
		}

		System.out.println(sum);

	}
}