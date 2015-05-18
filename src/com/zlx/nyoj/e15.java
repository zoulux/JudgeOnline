/*** Title: e15
 * Description: 
 * @author zoulux
 * @date 2015年5月17日 上午11:47:01*/

package com.zlx.nyoj;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;
import java.util.Stack;

public class e15 {
	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
	static Stack<String> stack = new Stack<String>();

	public static void main(String[] args) throws IOException {

		int N = cin.nextInt();
		while (N-- > 0) {
			stack.clear();

			String data = cin.next();
			// System.out.println(data);
			// System.out.println(data.charAt(0) + "");
			solve(data);
		}
	}

	private static void solve(String data) {
		stack.add(data.charAt(0) + "");
		for (int i = 1; i < data.length(); i++) {
			String s = data.charAt(i) + "";
			// if (stack.isEmpty()) {
			// stack.add(s);
			// }

			if (s.equals("(") || s.equals("[")) {
				stack.add(s);

			} else {
				String top = stack.peek();
				if (top.equals("(") && s.equals(")")) {
					stack.pop();
				} else if (top.equals("[") && s.equals("]")) {
					stack.pop();
				} else {

					stack.add(s);
				}
			}

		}

		System.out.println(stack);

	}
}
