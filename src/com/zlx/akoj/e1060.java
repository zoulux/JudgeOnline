package com.zlx.akoj;

import java.util.Scanner;

public class e1060 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int k = cin.nextInt();
			if (k == 0) {
				break;
			}
			String data = cin.next();
			int max = 0;
			for (int i = 0; i < data.length(); i++) {
				if (i + k > data.length()) {
					break;
				}
				String sub = data.substring(i, i + k);
				int t = getSubCount(data, sub, k);
				if (t > max) {
					max = t;
				}
			}
			System.out.println(max);
		}
	}

	private static int getSubCount(String data, String sub, int k) {
		StringBuffer sb = new StringBuffer(data);
		int count = 0;
		int start = 0;
		while ((start = sb.indexOf(sub)) != -1) {
			count++;
			sb.replace(start, start + k, "");
		}
		return count;
	}
}
