package com.zlx.akoj;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class e1073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (true) {
			int N = cin.nextInt();
			if (N == 0)
				break;
			Map<String, Integer> map = new TreeMap<String, Integer>();
			for (int i = 0; i < N; i++) {
				String s = cin.next();
				if (!map.containsKey(s)) {
					map.put(s, 0);
				}
				map.put(s, map.get(s) + 1);
			}

			Iterator it = map.entrySet().iterator();
			String resulet = "";
			int max = 0;
			while (it.hasNext()) {
				Map.Entry<String, Integer> m = (Entry<String, Integer>) it
						.next();
				String k=m.getKey();
				int v = m.getValue();
				if (v > max) {
					max = v;
				resulet=k;
				}

			}
			System.out.println(resulet);
		}
	}

}
