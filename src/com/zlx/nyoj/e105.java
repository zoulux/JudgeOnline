package com.zlx.nyoj;
import java.math.BigInteger;  //�ᳬʱ
import java.util.Scanner;

public class e105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		while (m-- > 0) {
			BigInteger n = cin.nextBigInteger();
			BigInteger a = new BigInteger("9");
			System.out.println(n.mod(a));
		}
	}
}
