package com.zlx.akoj;

import java.util.Scanner;

public class e1076new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			String data = cin.next()+" ";
			char first = data.charAt(0);
			int count = 1;
			for (int i = 1; i < data.length(); i++) {
				char c = data.charAt(i);
				if (first == c) {
					count++;
				}else {
					if (count==1) {
						System.out.print(first);
					}else {
						System.out.print(count+""+first);
					}
					first=c;
					count=1;
				}

			}
			System.out.println();
		}

	}
}
