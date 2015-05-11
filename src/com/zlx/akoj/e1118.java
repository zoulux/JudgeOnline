package com.zlx.akoj;
import java.util.Scanner;

public class e1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			double H = 0;
			for (int i = 1; i <= n; i++)
				H += 1.0 / i;
			System.out.println(String.format("%.3f", H));
		}

	}

}
