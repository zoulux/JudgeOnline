package com.zlx.nyoj;
import java.math.BigInteger;
import java.util.Scanner;

public class e112n {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
		int X = cin.nextInt();
		int N = cin.nextInt();
		BigInteger s=new BigInteger("1");
		for (int i = 1; i <= N; i++)
		s = s.multiply(BigInteger.valueOf(X));
		System.out.println(s);}
	
}}
