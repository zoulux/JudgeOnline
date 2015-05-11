package com.zlx.akoj;
import java.util.Scanner;

public class e1148 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			long m = cin.nextLong();
			if(m==1)
				System.out.println("471");
			else
			System.out.println((m - 1) + "" + "471");

		}

	}

}
