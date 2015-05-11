package com.zlx.akoj;

import java.util.Scanner;

public class e1138 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	int N=cin.nextInt();
	while (N-->0) {
		String data=cin.next()+" ";
		char A=data.charAt(0);
		int count=1;
		for (int i = 1; i <data.length(); i++) {
			char B=data.charAt(i);
			if (B==A) {
				count++;
			}else {
				System.out.print(count+""+A);
				count=1;
			}
			A=B;
		}
		System.out.println();
	}
}
}
