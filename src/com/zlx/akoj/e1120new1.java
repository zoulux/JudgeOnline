package com.zlx.akoj;

import java.math.BigDecimal;
import java.util.Scanner;

public class e1120new1 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while (cin.hasNext()) {
			long n=cin.nextLong();
			long m=cin.nextLong();
			long i=n;
			double he=0;
			for (; i <= m; i++) {
				double dy=1.0/(i*i);
				he+=dy;
			}
			System.out.println(String.format("%.5f", he));
			
		}
	}
}
