package com.zlx.akoj;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class e1210 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			Vector<String> vec = new Vector<String>();
			String str = cin.nextLine();
			String[] sc = str.split(" ");
			for (int i = 0; i < sc.length; i++)
				if (!vec.contains(sc[i]))
					vec.add(sc[i]);
			for (int i = 0; i < vec.size(); i++)
				System.out.print(vec.get(i) + " ");
			System.out.println();
		}
	}
}
