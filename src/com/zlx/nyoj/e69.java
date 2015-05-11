package com.zlx.nyoj;
import java.math.BigInteger;
import java.util.Scanner;

public class e69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
		
			int N = cin.nextInt();
			BigInteger M = new BigInteger("1");
			for (int i = 1; i <= N; i++)
				M = M.multiply(BigInteger.valueOf(i));
			String str = M.toString();
			System.out.println(str.length());
		
		}

	}

}
