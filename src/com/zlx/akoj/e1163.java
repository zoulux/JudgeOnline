package com.zlx.akoj;
import java.util.Scanner;

public class e1163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String AOJ = cin.next();
			if (AOJ.equals("E"))
				break;

			while (!AOJ.equals("")) {
				if (AOJ.indexOf("A") != -1) {
					System.out.print("A");
					AOJ = AOJ.replaceFirst("A", "");
				}
				if (AOJ.indexOf("O") != -1) {
					System.out.print("O");
					AOJ = AOJ.replaceFirst("O", "");
				}
				if (AOJ.indexOf("J") != -1) {
					System.out.print("J");
					AOJ = AOJ.replaceFirst("J", "");
				}
			}

			System.out.println();
		}

	}

}
