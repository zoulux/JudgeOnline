package com.zlx.akoj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class e1140new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			Vector<Set<Integer>> set = new Vector<Set<Integer>>();
			for (int i = 1; i <= n; i++) {
				Set<Integer> s = new HashSet<Integer>();
				s.add(i);
				set.add(s);
			}

			int m = cin.nextInt();
			for (int i = 0; i < m; i++) {
				int a = cin.nextInt();
				int b = cin.nextInt();
				for (int j = 0; j < set.size(); j++) {
					Set<Integer> s = set.get(j);
					if (s.contains(a)) {
						set.remove(s);
						set.remove(new HashSet<Integer>(b));
						s.add(b);
						set.add(s);
						break;

					} else if (s.contains(b)) {
						set.remove(s);
						set.remove(new HashSet<Integer>(a));
						s.add(a);
						set.add(s);
						break;
					}

				}
				
			}
			System.out.println(set.size());
		}
	}
}
