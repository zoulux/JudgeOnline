package com.zlx.nyoj;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class e62 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		Vector<Integer> zhishu = new Vector<Integer>();
		for (int i = 2; i <= 100; i++) {
			if (iszhishu(i)) {
				zhishu.add(i);
			}
		}

		// for (Integer integer : zhishu) {
		// System.out.println(integer);
		// }

		int N = cin.nextInt();
		for (; N-- > 0;) {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			String str = cin.next();
			for (int i = 0; i < str.length(); i++) {
				String temp = str.charAt(i) + "";
				if (!map.containsKey(temp)) {
					map.put(temp, 1);
				} else {
					map.put(temp, map.get(temp) + 1);
				}
			}

			Set<String> key = map.keySet();
			int min = 1000, max = 0;
			for (java.util.Iterator<String> it = key.iterator(); it.hasNext();) {
				String s = (String) it.next();
				int i = map.get(s);
				if (i > max) {
					max = i;
				}
				if (i < min) {
					min = i;
				}
			}
			
			int cha=max-min;
			boolean flag=false;
		for (int i = 0; i < zhishu.size(); i++) {
			if (zhishu.get(i)==cha) {
				System.out.println("Lucky Word");
				System.out.println(cha);
				flag=true;
				break;
			}
			
		}
			if (!flag) {
				System.out.println("No Answer");
				System.out.println(0);
			}
			
			
		}
		


	}

	private static boolean iszhishu(int i) {
		// TODO Auto-generated method stub
		if (i == 2) {
			return true;
		}
		if (i % 2 == 0) {
			return false;
		}
		int temp = (int) Math.sqrt(i);
		for (int j = 2; j < temp; j++) {
			if (i % j == 0) {
				return false;
			}
		}

		return true;
	}

}
