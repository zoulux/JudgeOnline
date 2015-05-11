package com.zlx.akoj;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class e1162new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String data = cin.next();
			String s1[] = data.split("\\d+");
			String d[] = data.split("[+-/\\*]");
			String[] s = new String[s1.length - 1];
			for (int i = 0; i < s.length; i++) {
				s[i] = s1[i + 1];
			}

			Stack<String> stack = new Stack<String>();
			int j=0;
			while (true) {
				if (j==d.length-1) {
					break;
				}
				
				if (stack.size()==2) {
					calc();
				}else {
					stack.add(s[j++]);
				}
				
			}
				
			

		}
	}

	private static void calc() {
		// TODO Auto-generated method stub
		
	}

	private static double s2Double(String string) {
		return Double.parseDouble(string);
	}
}
