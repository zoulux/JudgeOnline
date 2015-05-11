package com.zlx.nyoj;
import java.util.Scanner;

public class e108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int M = cin.nextInt();
		int[] array = new int[N + 1];
		int[] sum = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			array[i] = cin.nextInt();
			sum[i] = array[i] + sum[i - 1];
		}
		
		while (M-- > 0) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(sum[b] - sum[a - 1]);

		}

	}

}
