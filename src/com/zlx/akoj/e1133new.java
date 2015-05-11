package com.zlx.akoj;

import java.util.Scanner;
import java.util.Vector;

public class e1133new {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		Vector<Long> vector = new Vector<Long>();
		for (long i = 1; i < 100001; i++) {
			vector.add(i * i);
		}
		while (cinScanner.hasNext()) {
			long N = cinScanner.nextLong();
			long min = 999950889;
			int index = 0;
			for (int i = 0; i < vector.size(); i++) {
				long v = vector.get(i);
				
				long cha = Math.abs(v - N);
				if (cha < min) {
					min = cha;
					index = i;
				} else {
					break;
				}
			}
			System.out.println(vector.get(index));
		}
	}
}
