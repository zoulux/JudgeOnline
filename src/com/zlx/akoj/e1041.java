package com.zlx.akoj;
import java.util.Scanner;

public class e1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int[] M = { 100, 50, 20, 10, 5, 2, 1 };
		while (m != 0) {
			for (int i = 0;; i++) {
				if (m >= M[i]) {
					System.out.println(M[i]);
					m = m - M[i];
					break;
				}

			}

		}
	}
}
