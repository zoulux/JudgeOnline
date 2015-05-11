package com.zlx.akoj;
import java.math.BigInteger;
import java.util.Scanner;

public class e1042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		String num1 = cin.next();
		String op = cin.next();
		String num2 = cin.next();

		BigInteger Doublenum1 = new BigInteger(num1, 2);
		BigInteger Doublenum2 = new BigInteger(num2, 2);
		
		
		int sum = 0;
		if (op.equals("+"))
			sum = Integer.parseInt(Doublenum1.toString())
					+ Integer.parseInt(Doublenum2.toString());
		else if (op.equals("-"))
			sum = Integer.parseInt(Doublenum1.toString())
					- Integer.parseInt(Doublenum2.toString());

		System.out.println(Integer.toBinaryString(sum));

	}

}
