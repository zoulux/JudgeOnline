package com.zlx.akoj;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class e1285 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cinScanner = new Scanner(System.in);
		while (cinScanner.hasNext()) {
			int aCount = cinScanner.nextInt();
			Vector<String> vecA = new Vector<String>();
			for (int i = 0; i < aCount; i++) {
				vecA.add(cinScanner.nextInt()+"");
			}
			
			int bCount = cinScanner.nextInt();
			Vector<String> vecB = new Vector<String>();
			for (int i = 0; i < bCount; i++) {
				vecB.add(cinScanner.nextInt()+"");
			}
			
			for (int i = 0; i < vecB.size(); i++) {
				String temp=vecB.get(i);
				if (vecA.contains(temp)) {
					vecA.remove(temp);
				}
			}
			
			System.out.print(vecA.size() + " ");
			for (String str : vecA) {
				System.out.print(str + " ");
			}
			System.out.println();

		}
	}

}
