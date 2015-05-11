package com.zlx.akoj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class e1281 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		map.put('a', 2);
		map.put('b', 2);
		map.put('c', 2);
		map.put('d', 3);
		map.put('e', 3);
		map.put('f', 3);
		map.put('g', 4);
		map.put('h', 4);
		map.put('i', 4);
		map.put('j', 5);
		map.put('k', 5);
		map.put('l', 5);
		map.put('m', 6);
		map.put('n', 6);
		map.put('o', 6);
		map.put('p', 7);
		map.put('q', 7);
		map.put('r', 7);
		map.put('s', 7);
		map.put('t', 8);
		map.put('u', 8);
		map.put('v', 8);
		map.put('w', 9);
		map.put('x', 9);
		map.put('y', 9);
		map.put('z', 9);
	
		
		
		
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-->0) {
			String string=cin.next();
			int result[]=new int[string.length()];
			for (int i = 0; i < result.length; i++) {
				result[i]=map.get(string.charAt(i));
			}
			for (int i : result) {
				System.out.print(i);
			}
			System.out.println();
			
		}

	}

}
