package com.zlx.nyoj;

import java.util.Scanner;

/***
 * Title: e252 
 * Description: 01串
 * @author zoulux
 * @date 2015年5月11日 下午6:05:22
 */

public class e252 {
	static int data[]=new int[42];
	public static void main(String[] args) {
		data[0]=1;data[1]=1;
		for (int i = 2; i < data.length; i++) {
			data[i]=data[i-1]+data[i-2];
		}
		
		
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
				int n=cin.nextInt();
				while (n-->0) {
					int m=cin.nextInt();
					solve(m);
				}
		}

	}

	private static void solve(int m) {
		System.out.println(data[m+1]);
		
	}
}
