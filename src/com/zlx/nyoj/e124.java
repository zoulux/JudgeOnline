package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;

public class e124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int M = sc.nextInt();
			int[] array=new int[M] ;
			Arrays.fill(array,0);
			for (int j = 0; j < M ; j++)
				array[j] = sc.nextInt();
			Arrays.sort(array);
			System.out.println(array[(M-1)/2]);

		}
	}

}
