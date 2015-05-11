package com.zlx.akoj;
import java.util.Scanner;

public class e1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int[] F = new int[20];
		for (int i = 1; i < 20; i++)
			F[i] = F(i);
		int n = cin.nextInt();
		while (n-- > 0) {
			System.out.println(F[cin.nextInt()]);

		}

	}

	private static int F(int n) {
		// TODO Auto-generated method stub
		if (n == 1 || n == 2)
			return 1;
		else
			return F(n - 1) + F(n - 2);

	}

}
