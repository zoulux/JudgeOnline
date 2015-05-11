package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;

public class e1233 {

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int T = cin.nextInt();
			while (T-- > 0) {
				String URL = cin.next();
				int a = URL.indexOf("://") + 3;
				int b = 0;
				if (URL.substring(a).contains(":"))
					b = URL.substring(a).indexOf(":");
				else
					b = URL.substring(a).indexOf("/");
				cout.println(URL.substring(a, b + a));

			}

		}
		cin.close();
		cout.close();
	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
}
