package com.zlx.nyoj;
import java.util.Scanner;

public class e65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ci = new Scanner(System.in);
		int a = ci.nextInt();
		
		while (a > 0){
			int b = ci.nextInt();
		System.out.println(f(b));

		a--;
		}
	}

	private static long f(int n) {
		// TODO Auto-generated method stub
		
		long sum = 0;

		for (int k = 1; k <= n; k++) {
			long s =1;

			for (int j = 1; j <= k; j = j + 2)
				 s = s * j;

			sum = sum + s;
		}
		return sum;
	}
}
