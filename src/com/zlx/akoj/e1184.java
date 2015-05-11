package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;

public class e1184 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			String str = cin.next();
			char[] sc = str.toCharArray();
			Arrays.sort(sc);
			for (int i = sc.length - 1; i >= 0; i--)
				System.out.print(sc[i] + " ");
			System.out.println();
		}
	

	}

}
