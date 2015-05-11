package com.zlx.nyoj;
import java.util.Scanner;

public class e67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);

		while (true) {

			int x1 = cin.nextInt();
			int y1 = cin.nextInt();
			int x2 = cin.nextInt();
			int y2 = cin.nextInt();
			int x3 = cin.nextInt();
			int y3 = cin.nextInt();
			if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0 && x3 == 0 && y3 == 0)
				break;
			double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
			double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
			double c = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
			double ave = (a + b + c) / 2.0;
			double s = Math.sqrt(ave * (ave - a) * (ave - b) * (ave - c));
			System.out.println(String.format("%.1f", s));

		}

	}
}
