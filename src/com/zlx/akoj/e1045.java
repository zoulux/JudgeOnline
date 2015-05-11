package com.zlx.akoj;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class e1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		Vector<String> vec = new Vector<String>();
		String str = "";
		for (int i = 0; i < n; i++)
			str += cin.next();
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s = str.substring(i, i + 1);
			if (!vec.contains(s))
				vec.add(s);

		}
		Collections.sort(vec);
		for(String t:vec)
			System.out.println(t);

	}
}
