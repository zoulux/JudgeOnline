package com.zlx.akoj;

import java.util.Scanner;

public class e1269new {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while (cin.hasNext()) {
		int n=cin.nextInt();
		
		int base=1;
		int count=1;
		while (base%n!=0) {
			count++;
			base=(base*10+1)%n;
			System.out.println(base);
		}
		System.out.println(count);
		
	}
}
}
