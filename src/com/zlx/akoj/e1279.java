package com.zlx.akoj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class e1279 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t=1;
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 0) {
				break;
			}
			Vector<Integer> data = new Vector<Integer>();
			
			
			for (int i = 0; i < n; i++) {
				data.add(cin.nextInt());
			}
			double ave=ave(data);
			if (!(ave+"").endsWith(".0")) {
				System.out.println("No solution");
				continue;
			}
			
			int times=0;
			for (int i = 0; i < data.size(); i++) {
				int h=(int) Math.abs(data.get(i)-ave);
				times+=h;
			}
			
			
			System.out.println("Case #"+(t++));
			System.out.println(times/2);
		}
	}

	private static double ave(Vector<Integer> data) {
		double sum=0;
		for (Integer integer : data) {
			sum+=integer;
		}
		return sum/(data.size());
	}

}
