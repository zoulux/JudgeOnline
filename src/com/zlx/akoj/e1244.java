package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class e1244 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.nextLine();
			pipei(str);
		}
		cin.close();
		cout.close();
	}

	private static void pipei(String str) {
		Stack<String> s = new Stack<String>();
		int max = 0;
		int count = 0;
		s.push(str.charAt(0) + "");

		for (int i = 1; i < str.length(); i++) {
			String temp = str.charAt(i) + "";
			if (s.isEmpty()) {
				count = 0;
				s.push(temp);
			} else if (!s.isEmpty() && comp(s.peek(), temp)) {
				s.pop();
				count++;
			} else if (temp.equals("(")) {
				s.push(temp);
			}

			if (count > max)
				max = count;
		}
		if (s.isEmpty())
			cout.println(max);
		else
			cout.println("Error");

	}

	private static boolean comp(String m, String n) {
		if (m.equals("(") && n.equals(")"))
			return true;

		return false;
	}

}
