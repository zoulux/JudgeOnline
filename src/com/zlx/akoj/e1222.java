package com.zlx.akoj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;



public class e1222 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			Vector<Integer> m = new Vector<Integer>();
			Vector<Integer> y = new Vector<Integer>();
			for (int i = 0; i < 3; i++) {
				m.add(cin.nextInt());
			}
			for (int i = 0; i < 3; i++) {
				 y.add(cin.nextInt());
			}
			int weighta = f(m)[0];
			int valuea = f(m)[1];
			int weightb = f(y)[0];
			int valueb = f(y)[1];

			if (weighta > weightb) {
				System.out.println("you win");
			} else if (weighta == weightb) {
				if (valuea>valueb) {
					System.out.println("you win");
					
				}else {
					
					System.out.println("you lose");
				}
			} else {
				System.out.println("you lose");

			}

		}
	}

	private static int[] f(Vector<Integer> vec) {
		int result[] = new int[2];

		Collections.sort(vec);
		int a = vec.get(0);
		int b = vec.get(1);
		int c = vec.get(2);

		int count = 0;
		if (a + 1 == b && b + 1 == c) {
			result[0] = 2;
			result[1] = a + b + c;
			return result;
		}

		for (int i = 0; i < vec.size(); i++) {
			for (int j = i + 1; j < vec.size(); j++) {
				if (vec.get(i) == vec.get(j)) {
					count++;
				}
			}
		}
		result[0] = count;
		result[1] = a + b + c;
		return result;

	}

	private static int baozi(Vector<Integer> m) {
		// TODO Auto-generated method stub
		return 0;
	}

}
