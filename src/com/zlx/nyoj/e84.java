package com.zlx.nyoj;
import java.math.BigInteger;
import java.util.Scanner;

public class e84 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			long M = cin.nextLong();
			BigInteger s = new BigInteger("1");
			BigInteger s1 = new BigInteger("0");
			for (long i = 1; i <= M; i++)
				s = s.multiply(BigInteger.valueOf(i));
			int count = 0;
			System.out.println(s);
			while (true) {
				if ((s.mod(BigInteger.valueOf(10))).equals(s1)) {
					count++;
					s = s.divide(BigInteger.valueOf(10));
					System.out.println(s);
				} else
					break;

			}
			System.out.println(count);

		}

	}
}
