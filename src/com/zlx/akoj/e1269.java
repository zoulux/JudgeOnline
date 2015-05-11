package com.zlx.akoj;

import java.math.BigInteger;
import java.util.Scanner;

public class e1269 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			StringBuffer sb = new StringBuffer("1");
			int count = 1;
			BigInteger bigInteger = new BigInteger(new String(sb));
			while (!bigInteger.mod(BigInteger.valueOf(n)).equals(
					BigInteger.ZERO)) {

				sb.append("1");
				bigInteger = bigInteger.mod(BigInteger.valueOf(n));
				count++;
			}
			System.out.println(count);

		}
	}
}
