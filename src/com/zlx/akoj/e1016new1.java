package com.zlx.akoj;

import java.util.Scanner;
public class e1016new1 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while (cin.hasNext()) {
		int n=cin.nextInt();
		int m=cin.nextInt();
		if (n==m&&n==0) {
			break;
		}
		
		for (int i = 0; i < m; i++) {
			cin.nextInt();
			cin.nextInt();
		}
		System.out.println(n-m-1);
	}
}
}
