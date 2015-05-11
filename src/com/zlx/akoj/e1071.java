package com.zlx.akoj;
import java.util.Scanner;

public class e1071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (cin.hasNext()) {
			int M = cin.nextInt();
			int[] A = new int[M];
			for (int i = 0; i < M; i++)
				A[i] = cin.nextInt();
			int sum = 0;
			for (int i = 0; i < M; i++)
				sum += A[i];
			System.out.println(sum);
			System.out.println();

		}

	}

}
