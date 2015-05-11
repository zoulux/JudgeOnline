package com.zlx.akoj;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class e1011 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int width = cin.nextInt();
		Vector<Integer> key = new Vector<Integer>();
		Vector<Integer> count = new Vector<Integer>();

		while (cin.hasNext()) {
			key.add(cin.nextInt());
			count.add(cin.nextInt());
		}
		int[][] RecBefore = new int[width][width];
		// for (int i = 0; i < width; i++) {
		// for (int j = 0; j < width; j++) {
		//
		// }
		// }
		int i = 0, j = 0, l = 0;
		while (true) {
			int tempCount = count.get(l);
			int tempKey = key.get(l);
			while (tempCount-- > 0) {
				if (j == width) {
					i++;
					j = 0;
				}
				RecBefore[i][j] = tempKey;
				j++;
			}
			l++;
			if (l == key.size()) {
				break;
			}
		}

		for (int k = 0; k < RecBefore.length; k++) {
			for (int k2 = 0; k2 < RecBefore.length; k2++) {
				System.out.print(RecBefore[k][k2] + " ");
			}
			System.out.println();
		}
	}

}
