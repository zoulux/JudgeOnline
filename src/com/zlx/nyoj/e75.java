package com.zlx.nyoj;
import java.util.Scanner;

public class e75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int s = 0;
			switch (b) {
			case 1:
				s = 0;
				break;
			case 2:
				s = 31;
				break;
			case 3:
				s = 31 + 29;
				break;
			case 4:
				s = 31 + 29 + 31 ;
				break;
			case 5:
				s = 31 + 29 + 31 + 30 ;
				break;
			case 6:
				s = 31 + 29 + 31 + 30 + 31 ;
				break;
			case 7:
				s = 31 + 29 + 31 + 30 + 31 + 30 ;
				break;
			case 8:
				s = 31 + 29 + 31 + 30 + 31 + 30 + 31 ;
				break;
			case 9:
				s = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 ;
				break;
			case 10:
				s = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 ;
				break;
			case 11:
				s = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 ;
				break;
			case 12:
				s = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 ;
				break;

			}
			if (isLeapYear(a)) {

				System.out.println(s + c);
			} else
				System.out.println(s + c - 1);

		}

	}

	private static boolean isLeapYear(int n) {
		// TODO Auto-generated method stub
		if (n % 400 == 0)
			return true;
		else if ((n % 4 == 0) && (n % 100 != 0)) {
			return true;
		} else {
			return false;
		}

	}
}
