package com.zlx.akoj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class e1140Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			Vector<Set<Integer>> set = new Vector<Set<Integer>>();
			for (int i = 0; i < m; i++) {
				int a = cin.nextInt();
				int b = cin.nextInt();
				Set<Integer> s = new HashSet<Integer>();
				s.add(a);
				s.add(b);
				boolean flag = true;
				if (set.isEmpty()) {
					set.add(s);
					flag=false;
				} else {
					for (int j = 0; j < set.size(); j++) {

						Set<Integer> set2 = set.get(j);

						if (set2.contains(a)) {
							flag = false;
							set.remove(set2);
							set2.add(b);
							set.add(set2);
						} else if (set2.contains(b)) {
							flag = false;
							set.remove(set2);
							set2.add(a);
							set.add(set2);
						}
					}
				}
				if (flag) {
					set.add(s);
				}
			}
			System.out.println(set.size());
		}

	}
}
