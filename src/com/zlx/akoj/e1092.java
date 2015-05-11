package com.zlx.akoj;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class e1092 {

	static Stack<String> stack = new Stack<String>();

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
		 int n = cin.nextInt();
		 int m = cin.nextInt();
		solve(n, m);
		 }
	}

	private static void solve(int n, int m) {
		f(n, m);
		System.out.println(stack.size());
		while (stack.iterator().hasNext()) {
			System.out.print(stack.pop());
		}
		System.out.println();

	}

	private static int f(int n, int m) {
		if (n == m) {
			return 1;
		}
		if (n > m) {
			stack.add("g");
			return f(n / 2, m);
		}
		stack.add("f");
		return f(n * 3, m);

	}
}
