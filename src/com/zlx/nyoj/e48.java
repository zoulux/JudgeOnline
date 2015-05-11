package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;

public class e48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		int[] sjs = new int[T];
		for (int i = 0; i < T; i++)
			sjs[i] = cin.nextInt();
		for (int i = 0; i < T; i++)
			for (int j = i + 1; j < T; j++)
				if (sjs[i] == sjs[j])
					sjs[j] = 0;
		Arrays.sort(sjs);
		int count = 0;
		for (int i = 0; i < T; i++) {
			if (sjs[i] == 0)
				continue;
			count++;
		}
		System.out.println(count);
		for (int i = 0; i < T; i++) {
			if (sjs[i] == 0)
				continue;
			System.out.print(sjs[i] + " ");
		}

	

	}
}
