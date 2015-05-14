package com.zlx.akoj;

import java.util.Scanner;
import java.util.Stack;

//test
public class e1001 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		int a, b;
		while ((a = cin.nextInt()) != 0 && (b = cin.nextInt()) != 0) {
			int sum = 0;
			for (int i = a; i <= b; i++)
				sum += i;
			System.out.println(sum + "   ");

		}
	}
}
