package com.zlx.nyoj;
import java.util.Scanner;

public class e212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int k = cin.nextInt();
			int flag = 0;
			for (int m = 1;; m++) {
				for (int n = 0; n < m; n++) {
					double a = Math.pow(k, m);
					double b = Math.pow(k, n);
					if (a % 1000 == b % 1000 && a >= 1000.0 && b >= 1000.0) {
						System.out.println(m + n);
						flag = 1;
						break;
					}
				}
				if (flag == 1)
					break;
			}
		}
	}
}
