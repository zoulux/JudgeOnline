package com.zlx.nyoj;
import java.util.Scanner;

public class e22new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		while (m > 0) {
			int n = cin.nextInt();
			int i = 0;
			int s = 0;
			int[] array = new int[n];
			for (i = 0; i < n; i++)
				array[i] = cin.nextInt();
			for (i = 0; i < n; i++) {
				if (ok2(array[i])) // if(true)
					s += array[i];
			}
			System.out.println(s);

			m--;
		}

	}

	private static boolean ok2(int n) {
		// TODO Auto-generated method stub
		boolean sushu = true;
		if (n == 1)
			sushu = false;
		{
			if (n == 2)
				sushu = true;
			{
				if (n == 3)
					sushu = true;

				else {
					for (int j = 2; j <= Math.sqrt(n); j++) {
						if (n % j == 0) {
							sushu = false;
							break;
						}

					}
				}
			}
		}

		return sushu;
	}

}