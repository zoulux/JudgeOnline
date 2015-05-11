package com.zlx.akoj;

import java.math.BigInteger;
import java.util.Scanner;



public class e1179 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			BigInteger s=BigInteger.ONE;
			for (int i = 1; i <= N; i++) {
				s=s.multiply(BigInteger.valueOf(i));
			}
		System.out.println("s:"+s.toString(2));
//		int c=0;
//		for (int i = 1; i <101; i++) {
//			if (i%5==0) {
//				
//				c++;
//			}
//			if (i%25==0) {
//				c++;
//			}
//		}
//		System.out.println(c);
//		for
//			System.out.println("bit:"+s.getLowestSetBit());
//			System.out.println("2:"+s.toString(2));
//			System.out.println(s.getLowestSetBit()+1);
		}
	}

}
