package com.zlx.akoj;
import java.util.Scanner;

public class e1156 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String str = cin.next();
			int a = str.charAt(0) - '0';
			int b = str.charAt(2) - '0';
			String op = str.charAt(3) + "";
			int c = str.charAt(4) - '0';
			int d = str.charAt(6) - '0';
			if (op.equals("+"))
				add(a, b, c, d);
			else
				sub(a, b, c, d);

		}

	}

	private static void add(int a, int b, int c, int d) {
		int fz = a * d + b * c;
		int fm = b * d;
		int t = Math.abs(gys(fz, fm));
		if (fz == 0)
			System.out.println(0);
		else if (fm == 1)
			System.out.println(fz);
		else if(fz%fm==0)
			System.out.println(fz/fm);
		else {
			
			System.out.println(fz / t + "/" + fm / t);
		}
	}

	private static void sub(int a, int b, int c, int d) {
		int fz = a * d - b * c;
		int fm = b * d;
		if (fz == 0)
			System.out.println(0);
		else if (fm == 1)
			System.out.println(fz);
		else if(fz%fm==0)
			System.out.println(fz/fm);
		else {
			int t = Math.abs(gys(fz, fm));
			System.out.println(fz / t + "/" + fm / t);
		}

	}

	private static int gys(int m, int n) {
		int t = m;
		if (m < n)
			return gys(n, m);
		else {
			while ((t = m % n) != 0) {
				m = n;
				n = t;
			}
			return n;
		}
	}

}
