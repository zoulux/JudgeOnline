package com.zlx.akoj;

import java.util.Scanner;
import java.util.Stack;

public class e1020new1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			String data = cin.next();
			Stack<Integer> stack = new Stack<Integer>();
			stack.add(passInt(data.charAt(0) + ""));
			int j = 0;

			for (int i = 1; i < data.length(); i = j) {
				j = i + 1;
				boolean flag = false;
				while (true) {
					// System.out.print("i"+i+" ");
					// System.out.print("j"+j+" ");
				//	System.out.print(passInt(data.substring(i, j)) +" ");
			//		System.out.print(passInt(data.substring(j)) +" ");
			//		 System.out.println(stack.peek()+" ");
					 
					 if(( data.substring(j) +"").equals("")){
							stack.add(passInt(data.substring(i)));
							flag=true;
							break;
					}
					 
					if (passInt(data.substring(i, j)) > stack.peek()) {
						if (passInt(data.substring(j)) > passInt(data
								.substring(i, j))) {

							stack.add(passInt(data.substring(i, j)));
							break;
						} else {
							stack.add(passInt(data.substring(i)));
							flag = true;
							break;
						}

					}

					j++;

				}
				if (flag) {
					break;
				}

			}
			String s = "";
			for (Integer integer : stack) {
				s += integer + ",";

			}
			System.out.println(s.substring(0, s.length() - 1));
		}
	}

	private static int passInt(String string) {
		return Integer.parseInt(string);
	}

}
