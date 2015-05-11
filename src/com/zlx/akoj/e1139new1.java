package com.zlx.akoj;

import java.util.Scanner;

public class e1139new1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		int[][] arr = new int[1000][1000];
		arr[0][0] = 1;
		int t = 2;
		for (int i = 1; i < arr.length; i++) {
			arr[0][i] = arr[0][i - 1] + t;
			t++;
		}
		int t2 = 1;
		for (int i = 1; i < arr.length; i++) {
			int temp = t2;
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = arr[i - 1][j] + temp;
				temp++;
			}
			t2++;
		}
		while (cin.hasNext()) {
			int N = cin.nextInt();
			while (N-- > 0) {
				int x = cin.nextInt();
				int y = cin.nextInt();
				System.out.println(arr[y][x]);
			}

		}
	}

}
