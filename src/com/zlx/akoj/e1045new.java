package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;

public class e1045new {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		String str = "";

		for (int i = 0; i < n; i++)
			str += cin.next();
		
		for (int i = 0; i < str.length(); i++) {
			String t1 = str.charAt(i) + "";
			for (int j = i + 1; j < str.length(); j++) {
				String t2 = str.charAt(j) + "";
				if (t1.equals(t2))
					str = str.replaceFirst(t1, "");
			}
		}
		char[] array = str.toCharArray();

		Arrays.sort(array);
		for (char t : array)
			System.out.println(t);
	}

}
