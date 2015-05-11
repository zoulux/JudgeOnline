package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;

public class e238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T > 0) {
			int N = cin.nextInt();
			int[] array = new int[N];
			for (int i = 0; i < N; i++)
				array[i] = cin.nextInt();
			Arrays.sort(array);
			System.out.println(array[N - 1] - array[0]);
			T--;
		}
	}

}
