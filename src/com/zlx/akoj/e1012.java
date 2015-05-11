package com.zlx.akoj;
import java.math.BigInteger;
import java.util.Scanner;

public class e1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			System.out.println(new BigInteger(cin.next(), 16).toString(2));
		}
	}
}
