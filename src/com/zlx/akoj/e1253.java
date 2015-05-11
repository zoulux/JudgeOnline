package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;

public class e1253 {
	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.next();
			int count[] = new int[str.length()];
			int flag = 0;
			for (int i = 0; i  < str.length(); i++) {
				String temp = str.charAt(i) + "";
				if (!(str.replaceFirst(temp, "").contains(temp))) {
					cout.println(i);
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				cout.println("-1");
		}
		cin.close();
		cout.close();
	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

}
