package com.zlx.akoj;
import java.util.Scanner;
public class e1139new {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		int[][] list = new int[1000][1000];
		int k = 1;
		list[0][0] = 1;
		for (int i = 1; i < list.length; i++) {
			list[i][0] = list[i - 1][0] + k;
			k++;
		}

		for (int i = 0; i < list.length; i++) {
			int t = i + 1;
			for (int j = 1; j < list.length; j++) {
				t++;
				list[i][j] = list[i][j - 1] + t;
			}
		}

		 int N = cinScanner.nextInt();
		 while (N-- > 0) {
		 int x = cinScanner.nextInt();
		 int y = cinScanner.nextInt();
		 System.out.println(list[y][x]);
		 }
	}
}