package com.zlx.akoj;

import java.util.Scanner;

public class e1170 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			while (N-- > 0) {
				String data = cin.next();

				int size = data.length();
				String subA = new String(data);

				while (true) {
					
					if (size%2!=0) {
						break;
					}
					
					String subB = new String(subA);
					subA = subA.substring(0, size / 2);
					subB = subB.substring(subB.length() - size / 2);
					StringBuffer subBRe = new StringBuffer(subB).reverse();
					if (size == 1)
						break;
					if (!subA.equals(new String(subBRe))) {
						break;
					}
					size = size / 2;
				}
				System.out.println(size);
			}
		}
	}
}
