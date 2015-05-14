package com.zlx.akoj;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class e1267 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		int s = cin.nextInt();
		while (s-- > 0) {
			int w = cin.nextInt();
			int n = cin.nextInt();
			Vector<Integer> vector = new Vector<Integer>();
			for (int i = 0; i < n; i++) {
				
				vector.add(cin.nextInt());
			}
			solve(w, n, vector);
		}
	}

	private static void solve(int w, int n, Vector<Integer> vector) {
		Collections.sort(vector);
		int count=0;
		for (int i = 0; i < vector.size(); i++) {
			int t1=vector.get(i);
			count++;
			for (int j = i+1; j < vector.size(); j++) {
				int t2=vector.get(j);
				if (w-t1>=t2) {
					vector.remove(j);
				}
			}
		}
		System.out.println(count);
	}
}
 