package com.zlx.akoj;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class e1278 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner  cin=new Scanner(System.in);
	while (cin.hasNext()) {
		int n=cin.nextInt();
		Set<Integer> set=new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			set.add(cin.nextInt());
		}
		for (Integer integer : set) {
			System.out.print(integer+" ");
		}
		System.out.println();
	}

	}

}
