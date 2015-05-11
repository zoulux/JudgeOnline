package com.zlx.akoj;

import java.util.Scanner;

public class e1294 {
	static String nine = "9";

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			while (N-- > 0) {
				String data = cin.next();
				int addm = cin.nextInt();
				int subk = cin.nextInt();
				solve(data, addm, subk);
			}
		}

	}

	private static void solve(String data, int addm, int subk) {

		StringBuffer add = new StringBuffer();
		for (int i = 0; i < addm; i++) {
			add.append(nine);
		}
		String addLater = add.toString() + data;

		System.out.println(f(addLater,subk));
	}

	public static String f(String string, int subk) {
	

	
		for (int i = 0; i < subk; i++) {
			int min = 9;
			int index=string.length()-1;
			for (int  j = 0; j < string.length() - 1; j++) {
				int t1 = string.charAt(j) - '0';
				int t2 = string.charAt(j + 1) - '0';
				if (t1 < t2) {
					if (t1 < min) {
						min = t1;
						index=j;
					}
				}
			}
			string=string.substring(0,index)+string.substring(index+1);
		}
		return string;
	}
}
