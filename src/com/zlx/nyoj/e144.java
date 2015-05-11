package com.zlx.nyoj;
import java.util.Scanner;

public class e144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int n = cin.nextInt();
			int gys = gys(a, b);
			if (gys % n == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

	private static int gys(int a, int b) {

		int t = 1;
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		while ((t = a % b) != 0) {
			a = b;
			b = t;
		}
		return b;
	}
}
