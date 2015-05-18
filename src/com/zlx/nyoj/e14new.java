/*** Title: e14
 * Description: 
 * @author zoulux
 * @date 2015年5月16日 下午1:10:32*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class e14new {
	static class Time implements Comparable<Time> {
		int begin, end;

		public Time(int begin, int end) {

			this.begin = begin;
			this.end = end;
		}

		public Time() {

		}

		@Override
		public int compareTo(Time o) {
			if (this.end != o.end) {
				return this.end - o.end;
			}

			return this.begin - o.begin;
		}

	}

	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static Time tt[] = new Time[10000];
	static int visit[] = new int[10000];
	static int endMax = 0;

	public static void main(String[] args) {
		int m = cin.nextInt();
		while (m-- > 0) {

			Arrays.fill(visit, 0);
			endMax = 0;

			int n = cin.nextInt();
			for (int i = 0; i < n; i++) {
				int a = cin.nextInt();
				int b = cin.nextInt();

				tt[i] = new Time(a, b);
				if (b > endMax) {
					endMax = b;
				}
			}
			solve(n);
		}
		cin.close();
	}

	private static void solve(int n) {
		Arrays.sort(tt, 0, n);

		int current = tt[0].end;
		int count=0;
		while (current < endMax) {
			int T=0;
			for (int i = 1; i < n; i++) {
				if (tt[i].begin>current) {
				
					T=1;
					current=tt[i].end;
					count++;
					break;
				}
			}
			if (T==0) {
				break;
			}
				
		}
System.out.println(count+1);
	}
}
