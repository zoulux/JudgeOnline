package com.zlx.akoj;

import java.util.Scanner;
import java.util.Vector;

public class e1076 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			String data = cin.next();
			int count=1;
			Vector<Character> key=new Vector<Character>();
			Vector<Integer> value=new Vector<Integer>();
			for (int i = 0; i < data.length()-1; i++) {
				char now=data.charAt(i);
				char next=data.charAt(i+1);
				if (now==next) {
					count++;
					if (i==data.length()-2) {
						key.add(now);
						value.add(count);
						break;
					}
					
				}else {
					
					if (i==data.length()-2) {
						key.add(next);
						value.add(1);
						break;
					}
					
					key.add(now);
					value.add(count);
				}
			}
		for (int i = 0; i < key.size(); i++) {
			System.out.println(key.get(i)+":"+value.get(i));
		}
		}
	}

}
