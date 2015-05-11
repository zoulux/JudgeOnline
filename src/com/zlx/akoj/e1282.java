package com.zlx.akoj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class e1282 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < 26; i++) {
			char t1 = (char) (97 + i);
			map.put(t1, -(i + 1));
			char t2 = (char) (65 + i);
			map.put(t2, (i + 1));
		}
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		while (n-->0) {
			char x=cin.next().charAt(0);
			int y=cin.nextInt();
			System.out.println(map.get(x)+y);
			
		}

	}

}
