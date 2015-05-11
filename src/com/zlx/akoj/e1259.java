package com.zlx.akoj;
import java.util.Scanner;
public class e1259 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String a = cin.next().toLowerCase();
			String b = cin.next().toLowerCase();
			if (f(a, b))
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

	private static boolean f(String a, String b) {
		if (a.length() >= b.length()) {
			if (a.length() - b.length() > 1)
				{return false;
				}		if (a.length() - b.length() == 1)
				if (a.replaceFirst(b, "").length() == 1)
					{System.out.println("1");return true;}
			if (a.length() == b.length())
				if (a.replaceFirst(b, "").length() == 0)
					{System.out.println("2");return true;}
			if (a.length()==1&&b.length()==1)
				return true;
			int t = 0;
			for (int i = 0; i < b.length(); i++)
				if ((a.charAt(i) != b.charAt(i))) {
					if (t == 0) {
						b = b.substring(0, i) + a.charAt(i) + b.substring(i);
						t++;
					} else
						return false;
				}
		System.out.println("3");	return true;
		} else
			return f(b, a);
	}
}
