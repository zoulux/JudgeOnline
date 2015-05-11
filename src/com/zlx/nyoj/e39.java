package com.zlx.nyoj;
import java.util.Scanner;

public class e39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ci = new Scanner(System.in);
		int n = ci.nextInt();
		while (n != 0)

			if (ok(n)) {
				System.out.println("Yes");
				n = ci.nextInt();
			}

			else {
				System.out.println("No");
				n = ci.nextInt();
			}

	}

	private static boolean ok(int n) {

		int a = n / 100;
		int b = n % 10;
		int c = (n - 100 * a - b) / 10;
		if ((a * a * a + b * b * b + c * c * c) == n)
			return true;
		else
			return false;

	}

}
