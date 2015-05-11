package com.zlx.akoj;

import java.util.Scanner;

public class e1165new {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while (cin.hasNext()) {
			int A=cin.nextInt();
			int B=cin.nextInt();
			int count=0;
			for (int i = 1; i <= A; i++) {
				for (int j = 1; j <= B; j++) {
					count+=f(A,i)*f(B,j);
				}
			}System.out.println(count);
		}
	}

	//C(3,2)Á¬ÐøµÄ2
	private static int f(int i, int j) {
		int count=0;
		for (int k = 0; k < i; k++) {

			if (j+k<=i) {
				count++;
			}
		}
		return count;
	}
}
