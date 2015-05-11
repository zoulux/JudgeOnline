package com.zlx.akoj;
import java.util.Scanner;

public class e1084new {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String father = cin.next();
			String sun = cin.next();

			int count = 0;
			int w = 0;
			int t = 0;
			while ((t = father.indexOf(sun, w)) != -1) {
				count++;
				w = t + 1;
			}
			System.out.println(count);
			
		}
	}

}
