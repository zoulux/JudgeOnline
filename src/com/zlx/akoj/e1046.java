package com.zlx.akoj;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class e1046 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Map<String, Integer> map = new TreeMap<String, Integer>();
		String str = cin.nextLine();
		String[] sc = str.split(" ");
		for (int i = 0; i < sc.length; i++) {
			if (!map.containsKey(sc[i]))
				map.put(sc[i], 1);
			else
				map.put(sc[i], map.get(sc[i]) + 1);
		}
		System.out.println(sc.length);
		Object[] s = map.keySet().toArray();

		for (int i = 0; i < map.size(); i++)
			System.out.println((String) s[i] + ":" + map.get(s[i]));

	}

}
