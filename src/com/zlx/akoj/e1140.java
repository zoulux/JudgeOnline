package com.zlx.akoj;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class e1140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			Vector<Integer> vec = new Vector<Integer>();
			int n = cin.nextInt();
			int m = cin.nextInt();

			for (int i = 1; i <= n; i++)
				hm.put(i, i);

			for (int i = 0; i < m; i++) {
				int a = cin.nextInt();
				int b = cin.nextInt();
				if (hm.get(a) == a && hm.get(b) == b) {
					hm.put(a, Math.min(a, b));// TODO
					hm.put(b, Math.min(a, b));// TODO
				}
				if (hm.get(a) != a && hm.get(b) == b)
					hm.put(b, hm.get(a));
				if (hm.get(a) == a && hm.get(b) != b)
					hm.put(a, hm.get(b));
			}
			// System.out.println(hm.keySet());
			// System.out.println(hm.values());

			for (int i = 1; i <= n; i++)
				if (!vec.contains(hm.get(i)))
					vec.add(hm.get(i));
			System.out.println(vec.size());

		}

	}
}
