package com.zlx.akoj;
import java.util.Scanner;

public class e1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a1 = cin.nextInt();
			int b1 = cin.nextInt();
			int a2 = cin.nextInt();
			int b2 = cin.nextInt();
			for (int n = 0;; n++)
				if ((n - b1) % a1 == 0 && ((n - b2) % a2 == 0)) {
					System.out.println(n);
					break;
				}

		}
	}

}
