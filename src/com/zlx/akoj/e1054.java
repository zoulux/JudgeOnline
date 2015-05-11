package com.zlx.akoj;

import java.util.Scanner;
import java.util.Vector;

public class e1054 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int N = cin.nextInt();
			Vector<Long> vector = new Vector<Long>();
			while (N-- > 0) {
				vector.add(cin.nextLong());
			}
			int count=0;
			for (int i = 0; i < vector.size()-1; i++) {
				Long now=vector.get(i);
				Long next=vector.get(i+1);
				if (now>next) {
				count++;
				}
			}
			
			System.out.println(count);
		}

	}

}
