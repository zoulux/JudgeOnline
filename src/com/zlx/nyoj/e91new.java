package com.zlx.nyoj;
import java.util.Scanner;

public class e91new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		while (m-- > 0) {
			int n = cin.nextInt();
			for (int i = 1; i < n; i++)
				jiecheng(i);

		}

	}

	private static int jiecheng(int n) {
		int s = 1;
		for (int i = 1; i < n; i++)
			s *= i;
		return s;

	}

}
