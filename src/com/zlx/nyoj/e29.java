package com.zlx.nyoj;
import java.util.Scanner;

public class e29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			int[] array = new int[9];
			for (int i = 0; i < 9; i++)
				array[i] = cin.nextInt();
			int N = 0;
			for (int i = 0; i < 3; i++) {
				int j = 0;
				for (j = N++; j < 9; j = j + 3)
					System.out.print(array[j] + " ");
				System.out.println();
			
			}

			// for (int i = 0; i < 9; i = i + 3)
			// System.out.print(array[i] + " ");
			// System.out.println();
			// for (int i = 1; i < 9; i = i + 3)
			// System.out.print(array[i] + " ");
			// System.out.println();
			// for (int i = 2; i < 9; i = i + 3)
			// System.out.print(array[i] + " ");
			// System.out.println();

		}

	}
}
