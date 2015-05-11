package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class e1029 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter con = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = Integer.parseInt(cin.nextLine());
			while (N-- > 0) {
				String str = cin.nextLine();
				pipei(str);
			}
		}
		cin.close();
		con.close();
	}

	private static void pipei(String str) {
		Stack<String> s = new Stack<String>();
		s.push(str.charAt(0) + "");
		for (int i = 1; i < str.length(); i++) {
			String temp = str.charAt(i) + "";
			if (!s.isEmpty()&&comp(s.peek(), temp))
				s.pop();
			else
				s.push(temp);
		}
		if (s.isEmpty())
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	private static boolean comp(String m, String n) {
		if (m.equals("(") && n.equals(")"))
			return true;
		if (m.equals("[") && n.equals("]"))
			return true;
		return false;
	}

}
