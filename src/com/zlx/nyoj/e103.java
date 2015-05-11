package com.zlx.nyoj;
import java.util.Scanner;

public class e103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		int i = 1;
		while (T-- > 0) {
			long A = cin.nextLong();
			long B = cin.nextLong();
			System.out.println("Case" + " " + (i++) + ":");
			
			System.out.println(A + " " + "+" + " " + B + " " + "=" + " "
					+ (A + B));

		}

	}

}
