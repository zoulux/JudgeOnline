package com.zlx.nyoj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class e1104 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(0, "��");
		map.put(1, "Ҽ");
		map.put(2, "��");
		map.put(3, "��");
		map.put(4, "��");
		map.put(5, "��");
		map.put(6, "½");
		map.put(7, "��");
		map.put(8, "��");
		map.put(9, "��");
		map.put(10, "ʰ");
		map.put(100, "��");
		map.put(1000, "Ǫ");
		map.put(10000, "��");
		map.put(100000000, "��");
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
