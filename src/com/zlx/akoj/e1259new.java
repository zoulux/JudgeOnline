package com.zlx.akoj;

import java.util.Scanner;
import java.util.Vector;

public class e1259new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String a = cin.next().toLowerCase();
			String b = cin.next().toLowerCase();
			solve(a, b);
		}
	}

	private static void solve(String a, String b) {
		Vector<String> va = new Vector<String>();
		Vector<String> vb = new Vector<String>();
		va.add(a);
		vb.add(b);
		for (int i = 0; i < a.length(); i++) {
			String temp = a.substring(0, i) + a.substring(i + 1);
			va.add(temp);
		}

		for (int i = 0; i < b.length(); i++) {
			String temp = b.substring(0, i) + b.substring(i + 1);
			vb.add(temp);
		}

		if (f(va, vb)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	private static boolean f(Vector<String> va, Vector<String> vb) {
		for (int i = 0; i < va.size(); i++) {
			for (int j = 0; j < vb.size(); j++) {
					if (va.get(i).equals(vb.get(j))) {
						return true;
					}
			}
		}
		return false;
	}
}
