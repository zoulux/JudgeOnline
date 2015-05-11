package com.zlx.nyoj;
import java.math.BigInteger;
import java.util.Scanner;

public class e103new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		int i = 1;
		while (T-- > 0) {
			BigInteger A = cin.nextBigInteger();
			BigInteger B = cin.nextBigInteger();
			System.out.println("Case" + " " + (i++) + ":");
			System.out.println(A + " " + "+" + " " + B + " " + "=" + " "
					+ (A.add(B)  ));

		}

	}

}
