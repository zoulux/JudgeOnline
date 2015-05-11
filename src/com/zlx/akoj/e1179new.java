package com.zlx.akoj;

import java.util.Scanner;

public class e1179new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int count = 0;
			while (N != 0) {
				count +=( N >>= 1);
			}
			System.out.println(count+1);
		}
	}
}
