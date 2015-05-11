package com.zlx.akoj;
import java.util.Scanner;

public class e1119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			double sum = 0;
			int j = 1;
			for (int i = 1; i <= n; i += 2) {
				if (j % 2 == 1)
					sum += 1.0 / i;
				else
					sum -= 1.0 / i;
				j++;
			}

			

			System.out.println(String.format("%.6f", sum * 4.0));

		}

	}

}
