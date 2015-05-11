package com.zlx.akoj;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class e1217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		Map<String, Integer> map = new TreeMap<String, Integer>();
		Map<Integer, String> mapReverse = new TreeMap<Integer, String>();
		for (int i = 0; i < 26; i++) {
			char c = (char) ('a' + i);
			char C = (char) ('A' + i);
			map.put(C + "", 10 + i);
			map.put(c + "", 36 + i);
			mapReverse.put(10 + i, C + "");
			mapReverse.put(36 + i, c + "");
		}
		for (int i = 0; i < 10; i++) {
			map.put(i + "", i);
			mapReverse.put(i, i + "");
		}

		while (cin.hasNext()) {
			int N = cin.nextInt();
			while (N-- > 0) {
				int a = cin.nextInt();
				int b = cin.nextInt();
				String data = cin.next();

				BigInteger sum = BigInteger.ZERO;
				for (int i = 0; i < data.length(); i++) {
					int d = map.get(data.charAt(i) + "");
					// long r = (long) (Math.pow(a, data.length() - i - 1) * d);

					BigInteger r = BigInteger.valueOf(a)
							.pow(data.length() - i - 1)
							.multiply(BigInteger.valueOf(d));
					sum = sum.add(r);

				}
				BigInteger yushu = BigInteger.ZERO;
				Vector<String> vector = new Vector<String>();
				while (sum.compareTo(BigInteger.ZERO) > 0) {
					yushu = sum.mod(BigInteger.valueOf(b));

					vector.add(mapReverse.get(yushu.intValue()));
					sum = sum.subtract(yushu).divide(BigInteger.valueOf(b));
				}
				Collections.reverse(vector);
				System.out.print(a + " ");
				System.out.println(data);
				System.out.print(b + " ");
				for (String v : vector) {
					System.out.print(v);
				}
				System.out.println();
				System.out.println();
			}

		}

	}

}
