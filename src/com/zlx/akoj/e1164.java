package com.zlx.akoj;
import java.util.Arrays;
import java.util.Scanner;

public class e1164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double[] bian = new double[3];
			for (int i = 0; i < 3; i++)
				bian[i] = cin.nextDouble();
			Arrays.sort(bian);
			if (bian[0] * bian[0] + bian[1] * bian[1] == bian[2] * bian[2])
				System.out.println("Rect Triangle");
			else if (bian[0] * bian[0] + bian[1] * bian[1] > bian[2] * bian[2])
				System.out.println("Actue Triangle");
			else
				System.out.println("Obtuse Triangle");

		}

	}

}
