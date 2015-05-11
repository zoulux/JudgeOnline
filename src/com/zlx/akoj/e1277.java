package com.zlx.akoj;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class e1277 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			Vector<Double> vector = new Vector<Double>();
			for (int i = 0; i < N; i++) {
				vector.add(cin.nextInt() + 0.0);
			}
			Collections.sort(vector);
			for (int i = vector.size() - 1; i > 0; i--) {
				double t = 2 * Math.sqrt(vector.get(i) * vector.get(i - 1));
				vector.remove(vector.get(i));
				vector.remove(vector.get(i - 1));
				vector.add(t);
				Collections.sort(vector);
			}
			System.out.println(String.format("%.3f", vector.get(0)));
			

		}
	}
}
