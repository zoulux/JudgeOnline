package com.zlx.nyoj;
import java.util.Arrays;
import java.util.Scanner;

public class e57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			int a = cin.nextInt();
			int[] array = new int[4];
			int[] resurt = new int[4];
			int[] arraydao = new int[4];
			int b = 0;
			int court = 0;
			for (int j = 1; j <= 100; j++) {
				int c = a;
				for (int i = 0; i < 4; i++) {
					b = a;
					array[i] = a % 10;// 1467
					a = b / 10;
				}
				Arrays.sort(array);

				for (int i = 0; i < 4; i++) {
					arraydao[i] = array[3 - i];// 7641
				}

				for (int i = 0; i < 4; i++) {
					resurt[i] = arraydao[i] - array[i];// 6174

				}
				if (c == (resurt[0] + resurt[1] * 10 + resurt[2] * 100 + resurt[3] * 1000)) {
					System.out.println(court+1);
					break;
				}
				a = resurt[0] + resurt[1] * 10 + resurt[2] * 100 + resurt[3]
						* 1000;
				court++;
			}

		}

	}

}
