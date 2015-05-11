package com.zlx.akoj;
import java.util.Scanner;

public class e1213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int M = cin.nextInt();
			int[] list = new int[N];
			for (int i = 0; i < N; i++)
				list[i] = cin.nextInt();

			int[] A = new int[M];
			int[] B = new int[M];
			for (int i = 0; i < M; i++) {
				A[i] = cin.nextInt();
				B[i] = cin.nextInt();
				f(A[i], B[i], list);
			}
		}
	}

	private static void f(int m, int n, int[] list) {
		int max = list[n - 1];
		int min = list[m - 1];
		for (int i = m; i <= n; i++) {
			if (list[i - 1] > max)
				max = list[i - 1];
			if (list[i - 1] < min)
				min = list[i - 1];
		}
		System.out.println(max - min);
	}

}
