package com.zlx.akoj;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class e1283 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int T=cin.nextInt();
		while (T-->0) {
			int N=cin.nextInt();
		TreeSet<Integer> data=new TreeSet<Integer>();
			for (int i = 0; i < N; i++) {
				data.add(cin.nextInt());
			}
			System.out.println(data.size());
			for (Integer integer : data) {
				System.out.print(integer+" ");
			}
			System.out.println();
		}

	}

}
