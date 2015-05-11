package com.zlx.akoj;
import java.math.BigInteger;
import java.util.Scanner;

public class e1074 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			BigInteger A=cin.nextBigInteger();
			BigInteger B=cin.nextBigInteger();
			if (A.equals(BigInteger.ZERO)&&B.equals(BigInteger.ZERO)) {
				break;
			}
			BigInteger t=BigInteger.valueOf(1000L);
			 System.out.println(A.modPow(B, t));
		}

	}

}
