package com.zlx.akoj;
import java.util.Scanner;

public class e1120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {

			int n = cin.nextInt();
			int m = cin.nextInt();
			double s = 0;
			for (int i = n; i <= m; i++)
				s = s + 1.0/(i * i);
			System.out.println(s);
			//System.out.println(String.format("%.5f", s));
		}

	}

}
