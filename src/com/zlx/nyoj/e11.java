package com.zlx.nyoj;
import java.util.Scanner;

public class e11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		while (n > 0) {
			long a = sc.nextLong();
			for (long i = 1; i < a; i = i + 2)
				System.out.print(i + " ");
			System.out.println();
			for (long j = 2; j <= a; j = j + 2)
				System.out.print(j + " ");
			n--;
		}

	}

}
