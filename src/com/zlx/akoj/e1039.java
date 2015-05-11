package com.zlx.akoj;

import java.beans.beancontext.BeanContext;
import java.util.Scanner;
import java.util.Vector;

public class e1039 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int count = cin.nextInt();
			int bagVolume = cin.nextInt();
			int[] weight = new int[count + 1];
			int[] value = new int[count + 1];
			for (int i = 1; i < weight.length; i++) {
				weight[i] = cin.nextInt();
			}
			for (int i = 1; i < value.length; i++) {
				value[i] = cin.nextInt();
			}

			solve(weight, value, bagVolume, count);

		}

	}

	// 3　30　
	// 20　15　15
	// 40　25　25

	// 5
	// 15
	// 5 12
	// 4 3
	// 7 10
	// 2 3
	// 6 6

	private static void solve(int[] weight, int[] value, int bagVolume,
			int count) {
		int[][] best = new int[count + 1][bagVolume + 1];
		for (int i = 1; i <= count; i++) {
			for (int j = weight[i]; j <= bagVolume; j++) {

				int a = best[i - 1][j]; // 表示不放入i件物品，
				int b = best[i - 1][j - weight[i]] + value[i]; // 表示放入第i件物品

				best[i][j] = Math.max(a, b); // ，i表示第几件物品，j表示决策后的价值

				// System.out.println(max[i][j]);
			}
		}
		// for (int i = 0; i < count + 1; i++) {
		// for (int j = 0; j < bagVolume + 1; j++) {
		// System.out.print(best[i][j] + " ");
		// }
		// System.out.println();
		// }

		System.out.println(best[count][bagVolume]);
	}

}
