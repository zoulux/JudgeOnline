package com.zlx.akoj;
import java.util.Scanner;

public class e1202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt();
			if (N == 0)
				break;
			int count = 0;
			for (int i = 0; i <= N; i++)
				for (int j = 0; j * 2 <= N; j++)
					if (i + 2 * j == N)
						count++;

			System.out.println(count);
		}

	}

}
