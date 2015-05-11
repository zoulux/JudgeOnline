package com.zlx.akoj;
import java.util.Scanner;

public class e1031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int M = cin.nextInt();
		while (M-- > 0) {
			int N = cin.nextInt();
			int[] list = new int[N];
			for (int i = 0; i < N; i++)
				list[i] = cin.nextInt();
			int sum = 0;

			for (int t : list)
				if (isss(t))
					sum += t;
			System.out.println(sum);

		}

	}

	private static boolean isss(int n) {
		if (n == 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

}
