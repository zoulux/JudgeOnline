package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;

public class e153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int n = cin.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = cin.nextInt();
			}
			for (int i = 0; i < n; i++) {
				y[i] = cin.nextInt();
			}
			int X = 0;
			int Y = 0;
			Arrays.sort(x);
			Arrays.sort(y);
			for (int i = 0; i < n; i++) {
				if (x[i] > y[i]) {
					X = X + 2;
					Y = Y + 0;
				} else if (x[i] == y[i]) {
					X++;
					Y++;
				} else {
					X = X + 0;
					Y = Y + 2;
				}
			}
			if (X > Y)
				System.out.println("X");
			else if (X < Y)
				System.out.println("Y");
			else
				System.out.println("none");
		}
	}

}
