/*** Title: e16
 * Description: 矩形嵌套
 * @author zoulux
 * @date 2015年5月14日 下午11:19:51*/

package com.zlx.nyoj;

import java.util.Arrays;
import java.util.Scanner;

public class e16new1 {
	static  class Recc implements Comparable<Recc> {
		int length, width;

		public Recc(int length, int width) {
			this.length = length;
			this.width = width;

		}

		@Override
		public int compareTo(Recc o) {
			if (this.length > o.length) {
				return 1;
			} else if (this.length == o.length && this.width > o.width) {
				return 1;
			}
			return -1;

		}
	}
		static Scanner cin = new Scanner(System.in);
		static int dp[] ;
		static Recc vector[];

		public static void main(String[] args) {
			int N = cin.nextInt();
			while (N-- > 0) {
				int n = cin.nextInt();
				vector = new Recc[n];
				 dp = new int[n];
				for (int i = 0; i < n; i++) {
					int l = cin.nextInt();
					int w = cin.nextInt();
					if (l > w) {
						int t = w;
						w = l;
						l = t;
					}
					vector[i] = new Recc(l, w);

				}
				solve(n);
			}
		//	cin.close();
		}

		private static void solve(int n) {
			for (int i = 0; i < n; i++) 
				dp[i] = 0;
			

			Arrays.sort(vector);
			int max = dp[0];
			for (int i = 1; i < n; i++) {
				for (int j = 0; j < i; j++) {
					if(max(vector[j], vector[i])&&dp[i]<dp[j]+1)
						dp[i]=dp[j]+1;
				}
				if (dp[i] > max) 
					max = dp[i];
				

			}

			System.out.println(max + 1);

		}

		static boolean max(Recc r1, Recc r2) {
			if ((r1.length < r2.length && r1.width < r2.width)
					|| (r1.length < r2.width && r1.width < r2.length)) {
				return true;
			}
			return false;
		}
	}

