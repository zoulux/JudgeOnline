package com.zlx.akoj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class e1272 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			String data = cin.next();
			Map<Character, Integer> map = new TreeMap<Character, Integer>();
			for (int i = 0; i < data.length(); i++) {
				char c = data.charAt(i);
				if (!map.containsKey(c)) {
					map.put(c, 0);
				}
				map.put(c, map.get(c) + 1);
			}
			Iterator it = map.entrySet().iterator();
			char c = 'a';
			int max = 0;
		while (it.hasNext()) {
			Map.Entry<Character, Integer> m = (Entry<Character, Integer>) it
				.next();
			char k = m.getKey();
			int v = m.getValue();
			if (v > max) {
				max = v;
				c = k;
			}
			
		}
			System.out.println(c);
		
		}
	}

}
