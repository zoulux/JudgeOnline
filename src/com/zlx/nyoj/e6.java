package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;

public class e6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int N = cin.nextInt();
			double[] pqb = new double[N];
			for (int i = 0; i < N; i++)
				pqb[i] = cin.nextDouble();
			double[] pqz = new double[N];
			for (int i = 0; i < N; i++)
				pqz[i] = pqb[i] * 2.0;
			Arrays.sort(pqz);
			int count = 0;
			double sum = 20;
			for (int i = N - 1; i >= 0; i--) {
				sum = sum - pqz[i];
				count++;
				if (sum < 0)
					break;
			}
			System.out.println(count);
		}
	}
}
