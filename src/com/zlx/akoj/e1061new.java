package com.zlx.akoj;
import java.util.Scanner;
import java.util.Stack;
public class e1061new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			Stack<Integer> stack = new Stack<Integer>();
			while (n-- > 0) {
				stack.add(cin.nextInt());
			}
			minG(stack);
		}
	}
	private static void minG(Stack<Integer> stack) {
		if (stack.size() == 1) {
			System.out.println(stack.peek());
		} else {
			int t1 = stack.peek();
			stack.pop();
			int t2 = stack.peek();
			stack.pop();
			int t = gbs(t1, t2);
			stack.add(t);
			minG(stack);
		}

	}
	static int gys(int a, int b) {
		return b == 0 ? a : gys(b, a % b);
	}
	static int gbs(int a, int b) {
		return a * b / (gys(a, b));
	}
}
