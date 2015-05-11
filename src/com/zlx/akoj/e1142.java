package com.zlx.akoj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class e1142 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while (cin.hasNext()) {
			int N=cin.nextInt();
			while (N-->0) {
				String a=cin.next();
				String b=cin.next();
				Set<Character> va=new HashSet<Character>();
				Set<Character> vb=new HashSet<Character>();
				for (Character c : a.toCharArray()) {
					va.add(c);
				}
				for (Character c : b.toCharArray()) {
					vb.add(c);
				}
				
				
				if (va.equals(vb)) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}

	}

}
