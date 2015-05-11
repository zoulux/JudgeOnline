package com.zlx.akoj;

import java.util.Scanner;

public class e1173 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while (cin.hasNext()) {
		int n=cin.nextInt();
		int k=cin.nextInt();
		int time=0;
		if (n<=k) {
			time=2;
		}else {
			time=(n*2)/k;
			if ((n*2)%k!=0) {
				time++;
			}
		}
		System.out.println(time);
	}
}
}
