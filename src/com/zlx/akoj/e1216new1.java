package com.zlx.akoj;

import java.util.Scanner;

public class e1216new1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		// while (cin.hasNext()) {
		// int n = cin.nextInt();
		solve(6);
		// }
	}

	private static void solve(int n) {
		int data[][] = new int[n][n];
		int d = 1;

		int sum = 0; // i,j之和
		int count = 1;// 每组数量
		int i = 0, j = 0;// 横纵坐标
		boolean flag = true;
		while (d != n * n) {
			if (d == n * n) {
				break;
			}
			if (d <= (n * n + n) / 2) {
				for (int k = 0; k < count; k++) {
					if (flag) {
						i = k;
						j = sum - k;
						data[i][j] = d++;

					} else {
						i = sum - k;
						j = k;
						data[i][j] = d++;
					}

				}

				System.out.println(">>" + d);
				if (i == 0) {
					j++;
					flag = false;

				} else if (j == 0) {
					i++;
					flag = true;
				}
				count++;
				sum++;
				com.zlx.mytools.Array.print(data);
				System.out.println();
				System.out.println("i:"+i+"j:"+j);
				System.out.println("count:"+count+"sum:"+sum);
			} else {
				
			}
		}

	}
}
