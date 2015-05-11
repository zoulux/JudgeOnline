package com.zlx.akoj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class e1140new1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int a[] = new int[m];
			int b[] = new int[m];
			for (int i = 0; i < m; i++) {
				a[i] = cin.nextInt();
				b[i] = cin.nextInt();
			}

			solve(n, m, a, b);
		}
	}

	private static void solve(int n, int m, int[] a, int[] b) {
		Vector<Set<Integer>> vector = new Vector<Set<Integer>>();
		for (int i = 1; i <= n; i++) {
			Set<Integer> set = new HashSet<Integer>();
			set.add(i);
			vector.add(set);
		}

		for (int i = 0; i <m; i++) {
				int ia=a[i];
				int ib=b[i];
				
				Set<Integer> setA=null;
				Set<Integer> setB=null;
				Set<Integer> setC=new HashSet<Integer>();
				for (int j = 0; j < vector.size(); j++) {
					Set<Integer> set=vector.get(j);
					
					if (set.contains(ia)) {
						setA=new HashSet<Integer>(set);
					}
					if (set.contains(ib)) {
						setB=new HashSet<Integer>(set);
					}
				}
				setC.addAll(setB);
				setC.addAll(setA);
				vector.remove(setA);
				vector.remove(setB);
				vector.add(setC);
				
			
		}
		
		System.out.println(vector.size());
	}
}
