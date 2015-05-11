package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class e1229 {
	public static void main(String[] args) {
		Vector<Integer> prime = new Vector<Integer>();
		Vector<Integer> resurt = new Vector<Integer>();
		for (int i = 2; i < 1000000; i++)
			if (isp(i))
				prime.add(i);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 0)
				break;
		
			f(n, prime);
System.out.println();

		}
		cin.close();
		cout.close();
	}

	private static void f(int n, Vector<Integer> prime) {
		for (int i = 0;; i++) {
			int t = prime.get(i);
			if (n % t == 0) {
				System.out.print(t);
				if(n/t!=1)
					System.out.print("*");
				f(n / t, prime);
				break;
			} else if (n == 1)
				break;
		}
	}

	private static boolean isp(int n) {
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
}
