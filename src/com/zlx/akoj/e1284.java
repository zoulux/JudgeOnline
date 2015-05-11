package com.zlx.akoj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class e1284 {
	public static void main(String[] args) {
			Scanner cin=new Scanner(System.in);
			while (cin.hasNext()) {
				int count=cin.nextInt();
				Vector<Integer> data=new Vector<Integer>();
				Vector<Integer> index=new Vector<Integer>();
				for (int i = 0; i < count; i++) {
					data.add(cin.nextInt());
				}
				
				int max=Collections.max(data);
				for (int i = 0; i < count; i++) {
					if (data.get(i)==max) {
						index.add(i);
					}
				}
				System.out.println(max);
				for (Integer integer : index) {
					System.out.print(integer+" ");
				}
				System.out.println();
				

			}
	}
}
