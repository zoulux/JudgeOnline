package com.zlx.akoj;

import java.math.BigInteger;
import java.util.Scanner;

public class e1153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int n = cin.nextInt();
			int p = cin.nextInt();
			BigInteger sum = BigInteger.ZERO;
			for (int i = 1; i <= n; i++) {
				BigInteger pCF = BigInteger.valueOf(i).modPow(BigInteger.valueOf(p),BigInteger.valueOf(10003));
				sum=sum.add(pCF);
				sum = sum.mod(BigInteger.valueOf(10003));
			}
			System.out.println(sum);
		}

	}


}
