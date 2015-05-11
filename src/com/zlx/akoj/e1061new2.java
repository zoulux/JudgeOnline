package com.zlx.akoj;
import java.util.Scanner;
import java.util.Stack;
public class e1061new2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			Stack<Integer> stack = new Stack<Integer>();
			while (n-- > 0) {
				if (stack.isEmpty()) {
					stack.add(cin.nextInt());
				}else {
					int temp=cin.nextInt();
					int top=stack.peek();
					int gbs=gbs(temp, top);
					stack.add(gbs);
				}
			
			}
		System.out.println(stack.peek());
		}
	}

	static int gys(int a, int b) {
		return b == 0 ? a : gys(b, a % b);
	}
	static int gbs(int a, int b) {
		return a * b / (gys(a, b));
	}
}
