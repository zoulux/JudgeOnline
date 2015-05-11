package com.zlx.akoj;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import javax.xml.stream.events.EndDocument;

public class e1087 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {

			int n = cin.nextInt();
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			while (n-- > 0) {
				map.put(cin.nextInt(), cin.nextInt());
			}
			solve(map);
		}
	}

	private static void solve(Map<Integer, Integer> map) {
		Set<Integer> begin = map.keySet();
		Object[] beginArr = begin.toArray();

		// System.out.println(Arrays.toString(beginArr));
		int max = 0;
		for (int i = 0; i < map.size(); i++) {
			int b1 = (Integer) beginArr[i];
			int end1 = map.get(b1);
			int ending = end1;
			int count = 1;
			for (int j = i; j < map.size(); j++) {
				int b2 = (Integer) beginArr[j];
				int end2 = map.get(b2);

				if (b2 >= ending) {
					count++;
					ending = end2;
				}
			}
			if (count > max) {
				max = count;
			}
		}
		System.out.println(max);

	}
}