package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;

public class e1047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int l = cin.nextInt();
		int flag = cin.nextInt();
		int[] A = new int[l];
		for (int i = 0; i < l; i++)
			A[i] = cin.nextInt();
		if (flag == 0)
			shengxu(A);
		else
			jiangxu(A);

	}

	private static void jiangxu(int[] a) {
		Arrays.sort(a);
		for (int i = a.length - 1; i >= 0; i--)
			System.out.println(a[i]);

	}

	private static void shengxu(int[] a) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

	}

}
