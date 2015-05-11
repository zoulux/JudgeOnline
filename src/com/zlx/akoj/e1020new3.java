package com.zlx.akoj;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class e1020new3 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			while (N-- > 0) {
				String data = cin.next();
				solve(data);
			}
		}
	}

	private static void solve(String data) {
		int size = data.length();
		Vector<Vector<Integer>> vector = new Vector<Vector<Integer>>();
		Stack<BigInteger> stack = new Stack<BigInteger>();
		stack.add(BigInteger.ONE.negate());
		int j = 0;
		int i = 0;
		int index = 0;
		for (i = 0; i < size; i = j) {
			for (j = i + 1; j < size; j++) {
				
				String begin = data.substring(i, j);
				
				BigInteger bigBeginInt = new BigInteger(begin);

				String last = data.substring(j);
	
				BigInteger bigLastInt = new BigInteger(last);

				BigInteger peek = stack.peek();
	
				if (bigBeginInt.equals(BigInteger.ZERO)) {
					stack.add(bigBeginInt);
					break;
				}

				if (bigBeginInt.compareTo(peek) > 0) {
					if (bigLastInt.compareTo(bigBeginInt) > 0) {

						stack.add(bigBeginInt);
						break;
					}
				}

			}
			index = i;

		}

		stack.add(new BigInteger(data.substring(index)));
		
		for (int k = 1; k < stack.size(); k++) {
			System.out.print(stack.get(k));
			if (k != stack.size() - 1) {
				System.out.print(",");
			}
		}
		System.out.println();
	}
}
