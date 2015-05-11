package com.zlx.nyoj;
import java.math.BigInteger;
import java.util.Scanner;

public class e102Daan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n > 0) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger c = sc.nextBigInteger();
			System.out.println(a.modPow(b, c));
			n--;
		}
	}

}