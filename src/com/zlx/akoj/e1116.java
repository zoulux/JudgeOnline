package com.zlx.akoj;
import java.util.Scanner;


public class e1116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		for(int i=n;i>=1;i--)
		   f(i,n);
		
		
		
	}

	private static void f(int n,int l) {
		for(int i=1;i<=l-n;i++)
			System.out.print(" ");
		for(int i=1;i<=2*n-1;i++)
			System.out.print("#");
//		for(int i=1;i<=l-n;i++)
//			System.out.print(" ");
		System.out.println();
		
	}

}
