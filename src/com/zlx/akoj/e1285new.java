package com.zlx.akoj;

import java.util.Scanner;
import java.util.TreeSet;

public class e1285new {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while (cin.hasNext()) {
			int aCount=cin.nextInt();
			TreeSet<Integer> treeA=new TreeSet<Integer>();
			for (int i = 0; i < aCount; i++) {
				treeA.add(cin.nextInt());
			}
			int bCount=cin.nextInt();
			TreeSet<Integer> treeB=new TreeSet<Integer>();
			for (int i = 0; i < bCount; i++) {
				treeB.add(cin.nextInt());
			}
			
			treeA.removeAll(treeB);
	
			System.out.print(treeA.size()+" ");
			for (Integer integer : treeA) {
				System.out.print(integer+" ");
			}
			System.out.println();
			}
			
			
		}

	

}
