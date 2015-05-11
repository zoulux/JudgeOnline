package com.zlx.akoj;

import java.beans.beancontext.BeanContext;
import java.util.Scanner;

public class e1039new1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int count = cin.nextInt();
			int bagVolume = cin.nextInt();
			int[] weight = new int[count];
			int[] value = new int[count];
			for (int i = 0; i < weight.length; i++) {
				weight[i] = cin.nextInt();
			}
			for (int i = 0; i < value.length; i++) {
				value[i] = cin.nextInt();
			}

			solve(weight, value, bagVolume, count);

		}

	}

	private static void solve(int[] weight, int[] value, int bagVolume,
			int count) {
				int tab[][]=new int[bagVolume+1][bagVolume+1];
			for (int i = weight[0]; i <= bagVolume; i++) {
			
				tab[count-1][i]=weight[0];
			}
			
			for (int i = 1; i < count; i++) {
				for (int j = weight[i]; j <= bagVolume; j++) {
					int a=tab[count-i][j-weight[i]]+value[i];
					int b=tab[count-i][j];
					tab[i][j]=Math.max(a, b);
				}
			}
				
			for (int i = 0; i <bagVolume + 1; i++) {
				for (int j = 0; j <count+1 ; j++) {
					System.out.print(tab[j][i] + " ");
				}
				System.out.println();
			}
			System.out.println(tab[bagVolume][count]);
	}
}
