package com.zlx.nyoj;
import java.math.BigInteger;
import java.util.Scanner;


public class e102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
		long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d=(long) Math.pow(a,b);
			
			System.out.println(d%c);
	}

}
}
