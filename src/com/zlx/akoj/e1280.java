package com.zlx.akoj;

import java.util.Scanner;

public class e1280 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	int[] reault=new int[21];
	int a=cin.nextInt();
	while (a-->0) {
int n=cin.nextInt();
		int sum=0;
		for (int i = 1; i <= n; i++) {
			if (reault[i]==0) {
				reault[i]=f(i);
			}
			sum+=reault[i];
		}
		System.out.println(sum);
	}

	}

	private static int f(int j) {
		int s=1;
	for (int i = 1; i <= j; i=i+2) {
		s*=i;
	}
		return s;
	}

}
