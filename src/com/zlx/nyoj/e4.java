package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;

public class e4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			String str = cin.next();
			char[] array = new char[3];
			array[0] = str.charAt(0);
			// char A=str.charAt(0);
			array[1] = str.charAt(1);
			// char B=str.charAt(1);
			array[2] = str.charAt(2);
			// char C=str.charAt(2);
			Arrays.sort(array);
			for (int i = 0; i < 3; i++)
				System.out.print(array[i]+" ");
			System.out.println();

		}

	}
}
