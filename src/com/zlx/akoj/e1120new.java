package com.zlx.akoj;

import java.math.BigDecimal;
import java.util.Scanner;

public class e1120new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {

			int n = cin.nextInt();
			int m = cin.nextInt();

			BigDecimal s = new BigDecimal("0");
			BigDecimal one = new BigDecimal("1.0");
			BigDecimal d = new BigDecimal("0");
			for (int i = n; i <= m; i++) {
				d = BigDecimal.valueOf(i * i);
				s = s.add(one.divide(d, 7, BigDecimal.ROUND_HALF_UP));
			}
			System.out.println(s);
		}

	}

}
