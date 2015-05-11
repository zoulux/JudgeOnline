package com.zlx.akoj;

import java.util.Scanner;

public class e1216new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		// while (cin.hasNext()) {
		// int n = cin.nextInt();
		solve(4);
		// }
	}

	private static void solve(int n) {
		int data[][] = new int[n][n];
		int d = 1;
		int i = 0, j = 0;
		int sum = 0;
		boolean flag = true;
		while (d != ((n*n)+n)/2) {
	

		//	System.out.println("i:" + i + "j:" + j);
			for (int k = 0; k < sum + 1; k++) { // k表示每组个数
				System.out.println("d:" + d);
				System.out.println("sum:" + sum);
				System.out.println("i:" + i + "j:" + j);
				if (flag) {
					i=k;
					j=sum-k;
					data[i][j] = d++;

				} else {
					i=sum-k;
					j=k;
					data[i][j] = d++;
				}

				if (d == ((n*n)+n)/2) {
					break;
				}
				
				if (i == 0 && j == 0) {
					j++;

					continue;
				}

				if (i == 0) {
					if (j==n-1) {
						
						i++;
					}else {
						
						j++;
					}
					flag = true;
		
					continue;
				}
				if (j == 0) {
					if (i==n-1) {
						j++;
					}else {
						i++;
						
					}
					flag = false;
					continue;
				}
			}
			sum++;
			System.out.println();
		}
		com.zlx.mytools.Array.print(data);
	}
}
