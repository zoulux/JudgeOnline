package com.zlx.nyoj;
import java.util.Scanner;

public class e22daan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int[] A = new int[1000];

		while (a >0) {
			int sum = 0;
			int b = input.nextInt();
			for (int j = 0; j < b; j++) {

				A[j] = input.nextInt();

				if (myprime(A[j]))

					sum = sum + A[j];
			}
			System.out.println(sum);
			a--;
		}
	}

	private static boolean myprime(int n) {
		int i;
		for (i = 2; i < n; i++) {
			if (n % i == 0)
				break;
		}
		if (n == i)
			return true;
		else
			return false;

	}

}