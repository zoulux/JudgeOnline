package com.zlx.akoj;

import java.util.Scanner;

class Point {
	int x, y;
}

public class e1056 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int x1 = cin.nextInt();
			int y1 = cin.nextInt();
			int x2 = cin.nextInt();
			int y2 = cin.nextInt();
			int x3 = cin.nextInt();
			int y3 = cin.nextInt();
			if (x1 == x2 && x2 == x3 && y1 == y2 && y2 == y3 && x1 == y1
					&& x1 == 0) {
				break;
			}

			solve(x1, y1, x2, y2, x3, y3);
		}

	}

	private static void solve(int x1, int y1, int x2, int y2, int x3, int y3) {
			int flag=(x2-x1)*(y3-y1)-(y2-y1)*(x3-x1);
			if (flag<0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
	}

}
