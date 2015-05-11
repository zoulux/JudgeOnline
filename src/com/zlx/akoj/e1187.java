package com.zlx.akoj;
import java.util.Scanner;

public class e1187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int k = cin.nextInt();

		int[] burner = new int[n + 1];
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j * i <= n; j++) {
				if (burner[i * j] == 0)
					burner[i * j] = 1;
				else
					burner[i * j] = 0;
			}
		}
		for (int i = 0; i < n + 1; i++)
			if (burner[i] == 1)
				System.out.print(i + " ");
	}

}
