package com.zlx.akoj;
import java.io.PrintWriter;
import java.util.Scanner;
public class e1205new {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String anwen = "";
		while (cin.hasNext()) {
			String mingwen=cin.next();
			for (int i = 0; i < mingwen.length(); i++) {
				char t = mingwen.charAt(i);
				if (t >= 'a' && t <= 'c')
					anwen += "2";
				else if (t >= 'd' && t <= 'f')
					anwen += "3";
				else if (t >= 'g' && t <= 'i')
					anwen += "4";
				else if (t >= 'j' && t <= 'l')
					anwen += "5";
				else if (t >= 'm' && t <= 'o')
					anwen += "6";
				else if (t >= 'p' && t < 's')
					anwen += "7";
				else if (t >= 't' && t <= 'v')
					anwen += "8";
				else if (t >= 'w' && t <= 'z')
					anwen += "9";
				else if (t >= 'A' && t <= 'Y')
					anwen += ((char) (t + 33));
				else if (t == 'Z')
					anwen += "a";
				else
					anwen += t;
			}
		}
		cout.println(anwen);
		cin.close();
		cout.close();
	}
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
}
