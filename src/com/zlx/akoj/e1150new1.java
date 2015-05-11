package com.zlx.akoj;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class e1150new1 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter con = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int T = cin.nextInt();
//			int T=Integer.parseInt(cin.nextLine());
			while (T-- > 0) {
				String n = cin.next();
				int m = cin.nextInt();
				f(n, m);
			}
		}
		cin.close();
		con.close();
	}

	// static void f(String s, int m) {
	// if (m == 0) {
	// con.println(s);
	// return;
	// }
	// BigInteger max = BigInteger.ZERO;
	// for (int i = 0; i < s.length(); i++) {
	// BigInteger cur = new BigInteger(s.substring(0, i)
	// + s.substring(i + 1));
	// if (cur.compareTo(max) > 0)
	// max = cur;
	// }
	// f(max.toString(), m - 1);// ตÝน้
	// }

	private static void f(String n, int m) {

		String copyn = n;
		for (int i = 0; i < m; i++) {
			long max = 0;
			for (int j = 0; j < copyn.length(); j++) {
				long temp = Long.parseLong(copyn.substring(0, j)
						+ copyn.substring(j + 1));
				if (temp > max)
					max = temp;
			}
			copyn = max + "";
		}
		con.println(copyn);
	}
}
