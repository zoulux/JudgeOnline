package com.zlx.nyoj;
import java.math.BigInteger;
import java.util.Scanner;

public class e73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		BigInteger c = new BigInteger("0");
		while(true){
			BigInteger a = cin.nextBigInteger();
			BigInteger b = cin.nextBigInteger();
			if((a.compareTo(c)==0)&&(b.compareTo(c)==0))
				break;
			int w = a.compareTo(b);
			if (w == 0)
				System.out.println("a==b");
			if (w == -1)
				System.out.println("a<b");
			if (w == 1)
				System.out.println("a>b");

			

		} 

	}

}
