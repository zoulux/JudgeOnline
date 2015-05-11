package com.zlx.nyoj;

import java.util.Scanner;

public class e53new {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {

		for (int Test = cin.nextInt(); Test-- > 0; solve())
			;
	}

	private static Object solve() {
		int a[] = new int[7];
		int unhappy = 0, max = -1;
		int day = -1;
		for (int i = 0; i < 7; i++) {
			unhappy = cin.nextInt() + cin.nextInt();
			if (unhappy > max) {
				day = i;
				max = unhappy;
			}
		}
		if (max <= 8) {
			System.out.println(0);
		} else {
			System.out.println(day + 1);
		}
		return null;
	}
}
