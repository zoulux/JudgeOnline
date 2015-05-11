package com.zlx.akoj;

import java.math.BigInteger;
import java.util.Scanner;

public class e1275 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while (cin.hasNext()) {
			BigInteger X=cin.nextBigInteger();
			int N=cin.nextInt();
			System.out.println(X.pow(N));
			System.out.println(X.nextProbablePrime());
		}
		
	}

}
