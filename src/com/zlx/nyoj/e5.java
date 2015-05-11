package com.zlx.nyoj;
import java.util.Scanner;


public class e5 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int N=cin.nextInt();
		while (N-->0) {
			String A=cin.next();
			String B=cin.next();
			int t=0;
			for (int i = 0; i <= B.length()-A.length(); i++) {
				if (B.substring(i, i+A.length()).equals(A)) {
					t++;
				}
			}
			System.out.println(t);
		}

	}

}
