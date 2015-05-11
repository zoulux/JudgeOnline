package com.zlx.akoj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class e1144new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			Map<Integer, Double> map = new HashMap<Integer, Double>();
			for (int i = 0; i < N; i++) {
				double value = cin.nextDouble() / cin.nextDouble();
				map.put(i, value);
			}
			solve(map);
		}
	}

	private static void solve(Map<Integer, Double> map) {
		Object[] values = map.values().toArray();

		int max = 0;
		for (int i = 0; i < values.length; i++) {

			int count = 1;
			for (int j = i + 1; j < values.length; j++) {
				double t = (Double) values[i];
				double t1 = (Double) values[j];
				
				if (t1 == t) {
					count++;
				}
			}
			if (count > max)
				max = count;
		}
		System.out.println(max);
	}

}
