package com.zlx.akoj;
import java.util.Scanner;

public class e1084 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String father = cin.next();
			String sun = cin.next();
			int count = 0;
			for (int i = 0;; i++) {
				if (father.contains(sun))
					count++;
				else
					break;
			father.replaceFirst(sun, "");
			}
			System.out.println(count);

		}

	}

}
