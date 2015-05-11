package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;

public class e154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int n = cin.nextInt();
			int[] array = new int[n];

			for (int i = 0; i < n; i++)
				array[i] = cin.nextInt();

			Arrays.sort(array);
			System.out.println(array[(array.length + 2) / 2 - 1]);

		}

	}

}
