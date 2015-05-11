package com.zlx.nyoj;
import java.util.Scanner;

public class e56new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int t = 1;
			int count = 0;
			for (int i = 1; i <= n; i++)// n=10,m=5;
			{
				t = i;
				while (t % m == 0) {
					t = t / m;
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
