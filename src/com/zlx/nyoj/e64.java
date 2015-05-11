package com.zlx.nyoj;
import java.util.Scanner;

public class e64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int J = 4 * n - m;
			int T = m - 2 * n;

			if (J % 2 == 0 && T % 2 == 0 && J >= 0 && T >= 0)
				System.out.println(String.format("%d %d", J / 2, T / 2));
			else
				System.out.println("No answer");

		}
	}

}
