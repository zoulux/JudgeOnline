package com.zlx.akoj;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class e1020new2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			String str = cin.next();
			Stack<String> stack = new Stack<String>();
			for (int i = 0; i < str.length(); i++) {
				int j = i + 1;

				String nowString = str.substring(i, j);
				String nextString = str.substring(j);

				BigInteger now = new BigInteger(nowString);
				BigInteger next = new BigInteger(nextString);
				
				if (stack.isEmpty()) {
					if (now.compareTo(next) == -1) {
						stack.add(nowString);
					} else {
						stack.add(str);
						break;
					}

				} else {
					String before = stack.peek();
					
					
					
				}


			}

		}
	}

}
