package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;

public class e53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int[] array3 = new int[7];
		int[] array4 = new int[7];

		while (N-- > 0) {
			for (int i = 0; i < 7; i++) {
				array3[i] = cin.nextInt() + cin.nextInt();
			}
			System.out.println(array3);
			array4 = Arrays.copyOf(array3, 7);
			Arrays.sort(array4);
			{
				if (array4[6] < 8)
					System.out.println(0);
			}
			int index = Arrays.binarySearch(array3, array4[6]);
			System.out.println(index + 1);
		}

	}

}
