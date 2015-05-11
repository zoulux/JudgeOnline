package com.zlx.nyoj;
import java.util.Scanner;

public class e91v1 {
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		while (m-- > 0) {
			long n = cin.nextInt();
			long t = 1;
			int flag = 0;
			long[] A = { 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800 };
			for (int i = 9; i >= 0; i--) {
				if (n - A[i] > 0) {
					t = n - A[i];
					n = t;
				}
				if (n - A[i] == 0)
					flag = 1;
			}
			if (flag == 1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
