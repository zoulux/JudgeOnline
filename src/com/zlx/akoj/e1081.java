package com.zlx.akoj;
import java.util.Scanner;

public class e1081 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String str = cin.next();
			String str1 = cin.next();
			int count = 0;
			String restr = str.replace(str1, "#");
			for (int i = 0; i < restr.length(); i++)
				if (restr.charAt(i) == '#')
					count++;
			System.out.println(count);
		}

	}
}