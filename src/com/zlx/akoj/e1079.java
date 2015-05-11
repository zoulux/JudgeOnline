package com.zlx.akoj;

import java.util.Scanner;
import java.util.Vector;

public class e1079 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while (cin.hasNext()) {
			String data=cin.next();
			solve(data);
		}
	}

	private static void solve(String data) {
		//Vector<String>  vec=new Vector<String>();
		String copy=new String(data);
		for (int i = 0; i <= data.length(); i++) {
			String temp=data.substring(0,i);
	//		vec.add(temp);
			
			
		String[] arr=copy.split(temp);
		if (arr.length==0) {
			System.out.println(i);
			break;
		}
		}
		
	}
}
