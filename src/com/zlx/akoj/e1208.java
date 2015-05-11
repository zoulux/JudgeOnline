package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;

public class e1208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int n = cin.nextInt();
		int[] f = new int[m];
		int[] g = new int[n];
		for (int i = 0; i < m; i++)
			f[i] = cin.nextInt();
		for (int i = 0; i < n; i++)
			g[i] = cin.nextInt();

		int fmax = max(f);
		int fmin = min(f);
		int gmax = max(g);
		int gmin = min(g);
		if (Math.abs(fmax - gmin) >= Math.abs(gmax - fmin))
			System.out.println(Math.abs(fmax - gmin));
		else
			System.out.println(Math.abs(gmax - fmin));

	}

	private static int min(int[] array) {
		Arrays.sort(array);
		return array[0];
	}

	private static int max(int[] array) {
		Arrays.sort(array);
		return array[array.length - 1];
	}

}
