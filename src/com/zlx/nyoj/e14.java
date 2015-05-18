/*** Title: e14
 * Description: 
 * @author zoulux
 * @date 2015年5月16日 下午1:10:32*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class e14 {
static	class Time implements Comparable<Time> {
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

	public static void main(String[] args) {
		int m = cin.nextInt();
		while (m-- > 0) {

			Arrays.fill(visit, 0);
			int n = cin.nextInt();
			for (int i = 0; i < n; i++) {
				tt[i] = new Time(cin.nextInt(), cin.nextInt());
			}
			solve(n);
		}
		cin.close();
	}

	private static void solve(int n) {
		Arrays.sort(tt, 0, n);

		int count = 0;
		int t=0;
		//这里写的不对
		for (int i = 0; i < n; i = t) {
			int T=0;
			if (visit[i] == 0) {
				for (int j = i + 1; j < n; j++) {
				
					if (tt[i].end < tt[j].begin && visit[j] == 0) {
						T=1;
						t=j;
						count++;
						visit[j] = 1;
						break;
					}
				}
			}
			if (T==0) {
				break;
			}

		}
		System.out.println(count + 1);
	}
}


