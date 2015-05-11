package com.zlx.akoj;
import java.util.Scanner;

public class e1130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int[][] jz = new int[4][3];

		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 3; j++) {
				jz[i][j] = cin.nextInt();
			}
		int max = jz[0][0];
		int h = 0;
		int l = 0;
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 3; j++)
				if (jz[i][j] > max) {
					max = jz[i][j];
					h = i;
					l = j;
				}
		System.out.println(max + " " + h + " " + l);

	}

}
