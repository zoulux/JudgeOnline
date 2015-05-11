package com.zlx.nyoj;
import java.util.Scanner;

public class e181 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int N = cin.nextInt();
			long s = 1;
			long sum = 0;
			for (int i = 2; i <= N; i++) {
				if (i % 2 == 0) {
					s = s * i;
					sum = sum + s;
				} else {
					s = s * i;
					sum = sum - s;
				}

			}
			System.out.println(sum + 1);
		}
	}

}
