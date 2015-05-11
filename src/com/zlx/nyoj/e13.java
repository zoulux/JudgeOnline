package com.zlx.nyoj;
import java.util.Scanner;

public class e13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		while (m-- > 0) {
			int n = cin.nextInt();
			System.out.println(F(n));

		}

	}

	private static int F(int n) {
		int resurt = 0;
		if (n == 1 || n == 2)
			resurt = 1;
		else
			resurt = F(n - 1) + F(n - 2);

		return resurt;
	}

}
