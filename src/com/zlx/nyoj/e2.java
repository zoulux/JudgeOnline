package com.zlx.nyoj;
import java.util.Scanner;
import java.util.Stack;

public class e2 {

	/**
	 * @param args
	 */
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = cin.nextInt();
		while (N-- > 0) {
			String str = cin.next();
			System.out.println(solve(str));
		}
	}
	private static String solve(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (stack.isEmpty()) {
				stack.push(ch);
			}
			else if ((stack.peek()=='['&&ch==']')||(stack.peek()=='('&&ch==')')) {
				stack.pop();
			}else {
				stack.push(ch);
			}
		}

		
		
//		Character _ch = str.charAt(0);
//		if (_ch == ']' || _ch == ')')
//			return "No";
//		stack.push(_ch);
//		for (int i = 1; i < str.length(); i++) {
//			Character ch = str.charAt(i);
//			if (ch == '[' || ch == '(') {
//				stack.push(ch);
//			} else if (ch == ']') {
//				if (stack.peek() == '[') {
//					stack.pop();
//				} else if (stack.peek() == '(') {
//					stack.push(ch);
//				}
//			} else if (ch == ')') {
//				if (stack.peek() == '(') {
//					stack.pop();
//				} else if (stack.peek() == '[') {
//					stack.push(ch);
//				}
//			}
//		}
		if (stack.isEmpty()) {
			return "Yes";
		} else {
			return "No";
		}
	}

}
