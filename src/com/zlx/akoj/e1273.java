package com.zlx.akoj;

import java.util.Scanner;
import java.util.Vector;

public class e1273 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int count=oneTimes(n);
			
			int times=0;
			Vector<Integer> vector=new Vector<Integer>();
			for (int i = 0; i < 1001; i++) {
				if (times==5) {
					break;
				}
				if (oneTimes(i)==count&&i!=n) {
					times++;
					vector.add(i);
				}
			}
		for (Integer integer : vector) {
			System.out.print(integer+" ");
		}
		System.out.println();
		}
	}

	private static int  oneTimes(int n) {
		String s = Integer.toBinaryString(n);
		int OneTimes=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='1') {
				OneTimes++;
			}
		}
		
		return OneTimes;
	
		
	}
}
