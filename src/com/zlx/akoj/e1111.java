package com.zlx.akoj;

import java.math.BigInteger;
import java.util.Scanner;

public class e1111 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while (cin.hasNext()) {
			int n=cin.nextInt();
			BigInteger re=BigInteger.ONE;
			BigInteger he=BigInteger.ZERO;
			for (int i = 1; i <= n; i++) {
				re=re.multiply(BigInteger.valueOf(i));
				re=re.mod(BigInteger.valueOf(1000000));
				he=he.add(re);
				he=he.mod(BigInteger.valueOf(1000000));
			}
			System.out.println(he);
			
			
		}
	}

}
