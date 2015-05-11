package com.zlx.nyoj;
import java.math.BigInteger;
import java.util.Scanner;

public class e28 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n, i;
		n = cin.nextInt();
		BigInteger a = BigInteger.valueOf(1);
		for (i = 1; i <= n; i++) {
			a = a.multiply(BigInteger.valueOf(i));
		}
		System.out.println(a);
	}
}