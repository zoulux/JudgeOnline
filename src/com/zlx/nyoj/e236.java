/*** Title: e236
 * Description: 心急的C小加
 * @author zoulux
 * @date 2015年5月13日 下午4:16:53*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import org.omg.CORBA.PUBLIC_MEMBER;

public class e236 {
	public static class Stick implements Comparable<Stick> {
		int length, weight;

		@Override
		public int compareTo(Stick o) {
			if (this.length != o.length) {
				return this.length - o.length;
			}

			return this.weight - o.weight;
		}

	}

	static Scanner cin = new Scanner(new BufferedInputStream(System.in));

	public static void main(String[] args) {

		int T = cin.nextInt();
		while (T-- > 0) {
			int N = cin.nextInt();
			Vector<Stick> vector = new Vector<Stick>();

			for (int i = 0; i < N; i++) {
				Stick s = new Stick();
				s.length = cin.nextInt();
				s.weight = cin.nextInt();
				vector.add(s);
			}

			solve(N, vector);

		}
		cin.close();
	}

	private static void solve(int n, Vector<Stick> vector) {

		Collections.sort(vector);
		int length[] = new int[n];
		int weight[] = new int[n];
		for (int i = 0; i < weight.length; i++) {
			Stick stick = vector.get(i);
			length[i] = stick.length;
			weight[i] = stick.weight;
		}
		
		
		int dp[]=new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <i; j++) {
				if (weight[j]<=weight[i]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}
		
	

		 System.out.println( Arrays.toString(weight));
		 System.out.println( Arrays.toString(dp));
		
		
		
		// System.out.println( Arrays.toString(length));
		// System.out.println( Arrays.toString(weight));

	}

	private static void solve(int n, int[] length, int[] weight) {

	}
}
