package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;

public class e1185 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			String str = cin.next();

			int t = 0;
			int count = 0;
			while (t != 6174) {

				char[] sc = str.toCharArray();
				Arrays.sort(sc);
				t = (sc[3] - sc[0]) * 1000 + (sc[2] - sc[1]) * 100
						+ (sc[1] - sc[2]) * 10 + (sc[0] - sc[3]);
				count++;
				str = t + "";
			}
			System.out.println(count+1 );

		}

	}

}
