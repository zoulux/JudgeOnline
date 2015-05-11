package com.zlx.akoj;

import java.util.Scanner;

public class e1182 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while (cin.hasNext()) {
		int n=cin.nextInt();
		int k=cin.nextInt();
		if (n==k&&n==0) {
			break;
		}
		if (n-1<=k) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
}
