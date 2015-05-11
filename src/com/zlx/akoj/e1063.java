package com.zlx.akoj;
import java.util.Scanner;

public class e1063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 0)
				break;
			int[] money = new int[n];
			
			for (int i = 0; i < n; i++)
				money[i] = cin.nextInt();
			
			int sum = 0;
			for (int t : money)
				sum += f(t);

			System.out.println(sum);

		}

	}

	private static int f(int m) {
		int count = 0;
		int[] M = { 100, 50, 10, 5, 2, 1 };
		while (m != 0) {
			for (int i = 0;; i++) {
				if (m >= M[i]) {
					count++;
					m = m - M[i];
					break;
				}
			}
		}
		return count;
	}
}
