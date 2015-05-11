package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;//WrongAnswer

public class e71 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int s = cin.nextInt();
		while (s-- > 0) {
			int w = cin.nextInt();
			int n = cin.nextInt();
			int[] weight = new int[n];
			for (int i = 0; i < n; i++)
				weight[i] = cin.nextInt();
			int count = 0;
			Arrays.sort(weight);
			for (int i = 0; i < n; i = i + 2) {
				if (i == weight.length - 1) {
					count++;
					break;
				}
				if ((weight[i] + weight[i + 1]) <= w)
					count++;
				else
					count = count + 2;
			}
			System.out.println(count);
		}

	}
}
