package com.zlx.nyoj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class e1104 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(0, "Áã");
		map.put(1, "Ò¼");
		map.put(2, "·¡");
		map.put(3, "Èş");
		map.put(4, "ËÁ");
		map.put(5, "Îé");
		map.put(6, "Â½");
		map.put(7, "Æâ");
		map.put(8, "°Æ");
		map.put(9, "¾Á");
		map.put(10, "Ê°");
		map.put(100, "°Û");
		map.put(1000, "Çª");
		map.put(10000, "Íò");
		map.put(100000000, "ÒÚ");
		while (cin.hasNext()) {
			String data = cin.next();
			int size=data.length();
			for (int i = 0; i <size; i++) {
				int d=data.charAt(i)-'0';
				if(f(data.substring(i))){
					System.out.println();
					break;
				}
				
			}
		}

	}

	private static boolean f(String sub) {
		boolean flag=true;
		for (int i = 0; i < sub.length(); i++) {
			char c=sub.charAt(i);
			if (c!='0') {
				flag=false;
			}
		}
		return flag;
	}
}
