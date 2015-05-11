package com.zlx.akoj;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class e1121 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while (cin.hasNext()) {
		int a=cin.nextInt();
		int b=cin.nextInt();
		int c=cin.nextInt();
		BigDecimal aBigDecimal=new BigDecimal(a);
		BigDecimal bBigDecimal=new BigDecimal(b);
		BigDecimal r=aBigDecimal.divide(bBigDecimal,c,BigDecimal.ROUND_HALF_UP);
		System.out.println(r);	
	}

}
}