package com.zlx.akoj;
import java.math.BigInteger;
import java.util.Scanner;


public class e1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int N=cin.nextInt();
			int M=cin.nextInt();
			System.out.println(f(N).divide(f(M)));
		}

	}

	private static BigInteger f(int n) {
		BigInteger s=new BigInteger("1");
		for(int i=1;i<=n;i++)
			s=s.multiply(BigInteger.valueOf(i));
		return s;
		
		
	}

}
