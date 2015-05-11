package com.zlx.akoj;
import java.util.Scanner;

public class e1171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			String str = cin.next();
			while (str.indexOf("R") != -1) {
				System.out.print("R");
				str = str.replaceFirst("R", "");
			}

			while (str.indexOf("W") != -1) {
				System.out.print("W");
				str = str.replaceFirst("W", "");
			}

			while (str.indexOf("B") != -1) {
				System.out.print("B");
				str = str.replaceFirst("B", "");
			}
			System.out.println();
		}

	}

}
