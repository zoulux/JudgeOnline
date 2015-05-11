package com.zlx.nyoj;
import java.util.Scanner;

public class e926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int[] a = new int[2];
			int b = 0;
			for (int i = 0; i < 2; i++)
				a[i] = cin.nextInt();
			int c = a[0] + a[1];
			int t = 0;
			
		for (int i = 0; i < 2; i++) {
				if (a[0] == 0 || a[1] == 0) {
				if (a[0] == 0) {
					System.out.print(0 + "/" + 1 + " ");
					System.out.println(1 + "/" + 1);
					break;
				}
				if (a[1] == 0) {
					System.out.print(1 + "/" + 1 + " ");
					System.out.println(0 + "/" + 1);
					break;
					}
			}
				b = a[i];
				while ((t = c % b) != 0) {
					c = b;
					b = t;
				}
				System.out.print(a[i] / b + "/" + c / b + " ");

			}
			System.out.println();

		}
	}
}
