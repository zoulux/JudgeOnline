package com.zlx.akoj;
import java.util.Scanner;

public class e1180 {

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
			if (x1 == 0 && x2 == 0 && x3 == 0 && y1 == 0 && y2 == 0 && y3 == 0)
				break;
			double k = (y1 - y2) * 1.0 / (x1 - x2);
			double b = y1 - (y1 - y2) * 1.0 / (x1 - x2) * x1;
			double t = k * x3 + b - y3;
			if (t < 0)
				System.out.println("0");
			else

				System.out.println("1");

		}

	}

}
