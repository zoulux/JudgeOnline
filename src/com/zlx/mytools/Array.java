package com.zlx.mytools;

import java.util.Arrays;

public class Array {
	public static void print(int A[][]) {
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void print(double A[][]) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void print(Object A[][]) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void print(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}

	public static void print(double A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}

	public static void print(Object A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
}
