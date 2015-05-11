package com.zlx.akoj;

import java.math.BigInteger;
import java.util.Scanner;

public class e1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			BigInteger n = cin.nextBigInteger();
			String str2 = n.toString(2);
			int count = 0;
			for (char c : str2.toCharArray()) {
				if (c == '1')
					count++;
			}
			if (count%2==0) {
				
				System.out.println("even");
			}else {
				
				System.out.println("odd");
			}
		}

	}
}
