package com.zlx.akoj;

import java.util.Scanner;
import java.util.Vector;

public class e1039new {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int count = cin.nextInt();
			int bagVolume = cin.nextInt();
			int[] weight = new int[count+1];
			int[] value = new int[count+1];
			for (int i = 1; i < weight.length; i++) {
				weight[i] = cin.nextInt();
			}
			for (int i = 1; i < value.length; i++) {
				value[i] = cin.nextInt();
			}

			solve(weight, value, bagVolume, count);

		}

	}

	private static void solve(int[] weight, int[] value, int bagVolume,
			int count) {
		int best[][] = new int[count + 1][bagVolume + 1];
		for (int i = 1; i <= count; i++) {
			for (int j = bagVolume; j >= weight[i]; j--) {
				int a = best[i - 1][j];
				int b = best[i - 1][j - weight[i]] + value[i];
				best[i][j] = Math.max(a, b);
			}
		}

//		 for (int i = 0; i <count+1; i++) {
//		 for (int j = 0; j < bagVolume+1; j++) {
//		 System.out.print(best[i][j]+" ");
//		 }
//		 System.out.println();
//		 }

		System.out.println(best[count ][bagVolume]);
	}

}
