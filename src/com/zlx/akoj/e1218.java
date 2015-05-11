package com.zlx.akoj;
import java.math.BigInteger;
import java.util.Scanner;
public class e1218 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			BigInteger sum = BigInteger.ZERO;
			while (cin.hasNext()) {
				BigInteger a = cin.nextBigInteger();
				if (a.equals(BigInteger.ZERO))
					break;
				sum = sum.add(a);
			}
			System.out.println(sum);
		}
	}
}
