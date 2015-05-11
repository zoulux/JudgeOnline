package com.zlx.nyoj;
import java.util.Scanner;

public class e276 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			char a = cin.next().charAt(0);
			char b = cin.next().charAt(0);
			if (a - b < 0)
				System.out.println(String.format("%c>%c", a, b));
			else if (a - b > 0)
				System.out.println(String.format("%c<%c", a, b));
			else
				System.out.println(String.format("%c=%c", a, b));

		}
	}

}
