package com.zlx.nyoj;
import java.util.Scanner;

public class e96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int M = cin.nextInt();
		while (M-- > 0) {
			int N = cin.nextInt();//123
			int n = String.valueOf(N).length();//3
			int[] array = new int[n];
			int m = n;
			int k=n;
			for (int i = 0; i < m; i++) {
				array[i] = (int) ((N / (Math.pow(10, n-1))));
				N = (int) (N % (Math.pow(10, n-1)));
				n--;
			}
		
			int sum = 0;
			for (int i = 1; i < m; i++) {
				sum = (int) (array[i] * (Math.pow(10, k - 2))) + sum;
				k--;
			}

			System.out.println(sum);
		}

	}
}
