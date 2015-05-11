package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;

public class e31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();
		long[] array = { a, b, c, d, e };
		Arrays.sort(array);
		System.out.printf("%d %d", array[0], array[4]);

	}

}
