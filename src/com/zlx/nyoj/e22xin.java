package com.zlx.nyoj;
import java.util.Scanner;

public class e22xin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ci = new Scanner(System.in);
		int m = ci.nextInt();

		while (m > 0) {
			int n = ci.nextInt();
			int i = 0;
			int sum = 0;
			while (n > 0) {
				int array[] = { ci.nextInt() };

				if (array[i] == 1)
					sum = 0;
				{
					if (array[i] == 2)
						sum = sum + array[i];
					{
						if (array[i] == 3)

							sum = sum + array[i];

						else
							for (int j = 2; j <= Math.sqrt(array[i]); j++)

								if (array[i] % j != 0) {
									sum = sum + array[i++];
									break;
								}
					}
				}

				n--;
			}

			System.out.println(sum);
			m--;
		}

	}

}
