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

public class e236new {
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
		while (T-- >0) {
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
		
	//	System.out.println(Arrays.toString(weight));
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (weight[i] != 0) {
				int t = weight[i];
				count++;
				for (int j = i + 1; j < n; j++) {
					if (weight[j] >= t) {
						t=weight[j];
						weight[j] = 0;
		
					}
				}

			}

		}
		System.out.println(count);

	}

	
}
